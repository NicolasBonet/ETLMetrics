package co.edu.uniandes.proyectoautomatizacion.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ubicacionDb.
*/
public class UbicacionDbDao extends AbstractDao<UbicacionDb, Long> {

    public static final String TABLENAME = "ubicacionDb";

    /**
     * Properties of entity UbicacionDb.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Nombre = new Property(1, String.class, "nombre", false, "NOMBRE");
        public final static Property Imagen = new Property(2, String.class, "imagen", false, "IMAGEN");
        public final static Property Latitud = new Property(3, Double.class, "latitud", false, "LATITUD");
        public final static Property Longitud = new Property(4, Double.class, "longitud", false, "LONGITUD");
        public final static Property Horario = new Property(5, String.class, "horario", false, "HORARIO");
        public final static Property Mensaje = new Property(6, String.class, "mensaje", false, "MENSAJE");
        public final static Property Direccion = new Property(7, String.class, "direccion", false, "DIRECCION");
    };

    private DaoSession daoSession;


    public UbicacionDbDao(DaoConfig config) {
        super(config);
    }
    
    public UbicacionDbDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'ubicacionDb' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'NOMBRE' TEXT," + // 1: nombre
                "'IMAGEN' TEXT," + // 2: imagen
                "'LATITUD' REAL," + // 3: latitud
                "'LONGITUD' REAL," + // 4: longitud
                "'HORARIO' TEXT," + // 5: horario
                "'MENSAJE' TEXT," + // 6: mensaje
                "'DIRECCION' TEXT);"); // 7: direccion
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'ubicacionDb'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, UbicacionDb entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String nombre = entity.getNombre();
        if (nombre != null) {
            stmt.bindString(2, nombre);
        }
 
        String imagen = entity.getImagen();
        if (imagen != null) {
            stmt.bindString(3, imagen);
        }
 
        Double latitud = entity.getLatitud();
        if (latitud != null) {
            stmt.bindDouble(4, latitud);
        }
 
        Double longitud = entity.getLongitud();
        if (longitud != null) {
            stmt.bindDouble(5, longitud);
        }
 
        String horario = entity.getHorario();
        if (horario != null) {
            stmt.bindString(6, horario);
        }
 
        String mensaje = entity.getMensaje();
        if (mensaje != null) {
            stmt.bindString(7, mensaje);
        }
 
        String direccion = entity.getDireccion();
        if (direccion != null) {
            stmt.bindString(8, direccion);
        }
    }

    @Override
    protected void attachEntity(UbicacionDb entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public UbicacionDb readEntity(Cursor cursor, int offset) {
        UbicacionDb entity = new UbicacionDb( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // nombre
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // imagen
            cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3), // latitud
            cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4), // longitud
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // horario
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // mensaje
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // direccion
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, UbicacionDb entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNombre(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setImagen(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLatitud(cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3));
        entity.setLongitud(cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4));
        entity.setHorario(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setMensaje(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setDireccion(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(UbicacionDb entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(UbicacionDb entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
