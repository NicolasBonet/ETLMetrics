package co.edu.uniandes.proyectoautomatizacion.database;

/**
 * Created by juandavid on 6/24/15.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import co.edu.uniandes.proyectoautomatizacion.pojo.*;
import co.edu.uniandes.proyectoautomatizacion.pojo.Departamento;
import co.edu.uniandes.proyectoautomatizacion.pojo.Ciudad;


/**
 * Created by juandavid on 5/7/15.
 */
public class DatabaseHelper extends DaoMaster.OpenHelper {

    private final String TAG = DatabaseHelper.class.getSimpleName();
    private DepartamentoDao departamentoDao;
    private CiudadDao ciudadDao;
    private ImagenSliderItemDbDao imagenesSliderDao;
    private PromocionDbDao promocionDbDao;
    private UbicacionDbDao ubicacionDbDao;
    private CategoriaDbDao categoriaDbDao;
    private ProductoDbDao productoDbDao;
    private ProductoUbicDbDao productoUbicDbDao;
    private SQLiteDatabase db;
    private DaoSession daoSession;

    public DatabaseHelper(Context context) {
        super(context, "pepe.db", null);

        db = this.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();

        departamentoDao = daoSession.getDepartamentoDao();
        ciudadDao = daoSession.getCiudadDao();
        imagenesSliderDao = daoSession.getImagenSliderItemDbDao();
        promocionDbDao = daoSession.getPromocionDbDao();
        ubicacionDbDao = daoSession.getUbicacionDbDao();
        productoDbDao = daoSession.getProductoDbDao();
        productoUbicDbDao = daoSession.getProductoUbicDbDao();
        categoriaDbDao = daoSession.getCategoriaDbDao();
    }

    //Cerrar la DB

    public void close() {
        if (db.isOpen()) {
            db.close();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i(TAG, "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
        DaoMaster.dropAllTables(db, true);
        DaoMaster.createAllTables(db, false);
    }

    public DepartamentoDao getDepartamentoDao() {
        return departamentoDao;
    }

    public void setDepartamentoDao(DepartamentoDao departamentoDao) {
        this.departamentoDao = departamentoDao;
    }

    public CiudadDao getCiudadDao() {
        return ciudadDao;
    }

    public void setCiudadDao(CiudadDao ciudadDao) {
        this.ciudadDao = ciudadDao;
    }

    public List<ImagenSliderItemDb> findImagenesSliderByPantalla(String pantalla){

        List<ImagenSliderItemDb> lstDb = new ArrayList<>();
        List<ImagenSliderItem> lst = new ArrayList<>();

        for(ImagenSliderItemDb im : imagenesSliderDao.loadAll()){
            if(im.getPantalla().equalsIgnoreCase(pantalla)){
                lstDb.add(im);
            }
        }

        for(ImagenSliderItemDb im : lstDb){
            ImagenSliderItem imi = new ImagenSliderItem();
            imi.setUrl(im.getUrl());
            imi.setTipo(im.getTipo());
            imi.setImagen(im.getImagen());

            lst.add(imi);
        }

        return lstDb;
    }

    public void deletePromos(String cliente){
        promocionDbDao.queryBuilder().where(PromocionDbDao.Properties.Cliente.eq(cliente)).buildDelete().executeDeleteWithoutDetachingEntities();
    }

    public void insertPromos(PromosJsonList proms, String cliente){

        for(PromosJsonItem p : proms.getPromociones()) {

            PromocionDb pdb = new PromocionDb();

            pdb.setImagen(p.getImagen());
            pdb.setNombre(p.getNombre());
            pdb.setDescripcion(p.getDescripcion());
            pdb.setTerminos(p.getTerminos());
            pdb.setPassUrl(p.getPassUrl());
            pdb.setDetalleUrl(p.getDetalleUrl());
            pdb.setCliente(cliente);

            daoSession.insertOrReplace(pdb);

        }
    }

    public List<CategoriaDb> findAllCategorias(){
        List<CategoriaDb> ubics = categoriaDbDao.loadAll();
        return ubics;
    }

    public List<ProductoDb> findAllProductos(){
        List<ProductoDb> ubics = productoDbDao.loadAll();
        return ubics;
    }

    public List<ProductoUbicDb> findAllProductosUbic(){
        List<ProductoUbicDb> ubics = productoUbicDbDao.loadAll();
        return ubics;
    }

    public void deleteProductos(){
        productoDbDao.deleteAll();
    }

    public void deleteCategorias(){
        categoriaDbDao.deleteAll();
    }

    public List<CategoriaDb> findCategoriaByNombre(String nombre){
        return categoriaDbDao.queryBuilder().where(CategoriaDbDao.Properties.Nombre.eq(nombre)).list();
    }

    public void insertCategorias(CategoriaJsonList cats){

        for(CategoriaJsonItem c : cats.getCategorias()) {

            CategoriaDb cdb = new CategoriaDb();

            cdb.setNombre(c.getNombre());
            cdb.setLogo(c.getLogo());
            cdb.setId(c.getId());

            daoSession.insertOrReplace(cdb);

            for(ProductoJson pj : c.getProductos()){

                ProductoDb pdb = new ProductoDb();
                pdb.setNombre(pj.getNombre());
                pdb.setUrl(pj.getUrl());
                pdb.setDescripcion(pj.getDescripcion());
                pdb.setImagen1(pj.getImagen1());
                pdb.setImagen2(pj.getImagen2());
                //if(findCategoriaByNombre(c.getNombre()) != null && !findCategoriaByNombre(c.getNombre()).isEmpty()) {
                    System.out.println("no esta vacio " + c.getId());
                    pdb.setCategoriaId(c.getId());
                    daoSession.insertOrReplace(pdb);
                //}

            }

            //System.out.println("size productos insertados: " + cdb.getNombre() + cdb.getProductos().size());
            System.out.println("find all prod: " + findAllProductos().size());
            System.out.println("find all prod 1: " + findAllProductos().get(0).getCategoriaId());

        }
    }

    public List<ProductoDb> findProductosByCategoria(long catId){

        List<ProductoDb> prods = new ArrayList<>();

        for(ProductoDb p: findAllProductos()){
            if(p.getCategoriaId() == catId){
                prods.add(p);
            }
        }

        return prods;
    }

    public List<ProductoUbicDb> findProductosByUbicacion(long ubicId){

        List<ProductoUbicDb> prods = new ArrayList<>();

        for(ProductoUbicDb p: findAllProductosUbic()){
            if(p.getUbicacionId() == ubicId){
                prods.add(p);
            }
        }

        return prods;
    }

    public void deleteUbicaciones(){
        ubicacionDbDao.deleteAll();
    }

    public void deleteProductosUbic(){
        productoUbicDbDao.deleteAll();
    }

    public UbicacionDb findUbicacionById(long id){

        UbicacionDb ub = null;

        for(UbicacionDb u : findAllUbicaciones()){

            if(u.getId() == id){
                ub = u;
                break;
            }

        }

        return ub;
    }

    public void insertUbicaciones(UbicacionJsonList ubics){

        for(UbicacionJsonItem p : ubics.getTiendas()) {

            UbicacionDb udb = new UbicacionDb();

            udb.setId(p.getId());
            udb.setNombre(p.getNombre());
            udb.setImagen(p.getImagen());
            udb.setLatitud(Double.parseDouble(p.getLatitud().replace(",", "")));
            udb.setLongitud(Double.parseDouble(p.getLongitud().replace(",", "")));
            udb.setHorario(p.getHorario());
            udb.setDireccion(p.getDireccion());
            udb.setMensaje(p.getMensaje());

            daoSession.insertOrReplace(udb);

            for(String prod : p.getProductos()) {

                ProductoUbicDb pudb = new ProductoUbicDb();
                pudb.setNombre(prod);
                pudb.setUbicacionDb(findUbicacionById(udb.getId()));

                daoSession.insertOrReplace(pudb);

            }

        }
    }

    public List<UbicacionDb> findAllUbicaciones(){
        List<UbicacionDb> ubics = ubicacionDbDao.loadAll();
        return ubics;
    }

    public List<PromocionDb> findAllPromos(){
        List<PromocionDb> promos = promocionDbDao.loadAll();
        return promos;
    }

    public List<PromocionDb> findPromosByCliente(String cliente){
        return promocionDbDao.queryBuilder().where(PromocionDbDao.Properties.Cliente.eq(cliente)).list();
    }

    public void deleteImagenesSliderByPantalla(String pantalla){
        imagenesSliderDao.queryBuilder().where(ImagenSliderItemDbDao.Properties.Pantalla.eq(pantalla)).buildDelete().executeDeleteWithoutDetachingEntities();
    }

    public void insertImagenesSlider(ImagenesSlider imgs, String pantalla){

        for(ImagenSliderItem img : imgs.getImagenes()) {

            ImagenSliderItemDb imgdb = new ImagenSliderItemDb();

            imgdb.setUrl(img.getUrl());
            imgdb.setImagen(img.getImagen());
            imgdb.setTipo(img.getTipo());
            imgdb.setPantalla(pantalla);

            if(findImagenSliderByImagenAndPantalla(imgdb.getImagen(),imgdb.getPantalla()) == null ||
                    findImagenSliderByImagenAndPantalla(imgdb.getImagen(),imgdb.getPantalla()).isEmpty()){

                daoSession.insertOrReplace(imgdb);
            }
        }
    }

    public List<ImagenSliderItemDb> findImagenSliderByImagenAndPantalla(String img, String pantalla){
        return imagenesSliderDao.queryBuilder().where(ImagenSliderItemDbDao.Properties.Imagen.eq(img),ImagenSliderItemDbDao.Properties.Pantalla.eq(pantalla)).list();
    }

    //Insertar las ciudades y departamentos que entrega el server
    public void insertCiudadesAndDepartamentos(final List<Departamento> dptos) {

        daoSession.runInTx(new Runnable() {
            @Override
            public void run() {
                for (Departamento dpto : dptos) {

                    co.edu.uniandes.proyectoautomatizacion.database.Departamento dptoDb = new co.edu.uniandes.proyectoautomatizacion.database.Departamento();
                    dptoDb.setNombre(dpto.getNombreDepartamento());
                    daoSession.insertOrReplace(dptoDb);

                    for(Ciudad c : dpto.getCiudades()){

                        co.edu.uniandes.proyectoautomatizacion.database.Ciudad ciudadDb = new co.edu.uniandes.proyectoautomatizacion.database.Ciudad();
                        ciudadDb.setDepartamento(dptoDb);
                        ciudadDb.setNombre(c.getNombreCiudad());

                        daoSession.insertOrReplace(ciudadDb);
                    }
                }
            }
        });
    }

    //Consultar todos los Departamentos
    public List<co.edu.uniandes.proyectoautomatizacion.database.Departamento> findAllDepartamentos() {

        List<co.edu.uniandes.proyectoautomatizacion.database.Departamento> dptos = departamentoDao.loadAll();

        return dptos;
    }

    public List<co.edu.uniandes.proyectoautomatizacion.database.Ciudad> findCiudadesByDepartamento(long idDep) {

        return ciudadDao.queryBuilder().where(CiudadDao.Properties.DepartamentoId.eq(idDep)).list();

    }

    public List<co.edu.uniandes.proyectoautomatizacion.database.Ciudad> findAllCiudades() {

        List<co.edu.uniandes.proyectoautomatizacion.database.Ciudad> ciudades = ciudadDao.loadAll();

        return ciudades;
    }

    //Consultar Ciudades por Departamento

}
