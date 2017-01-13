package webapigeneric.co.edu.uniandes.Utils;

/**
 * Created by LuisSebastian on 11/16/15.
 */
public class CiudadDTO {

    private int Id;
    private String Nombre;

    public CiudadDTO(int id, String value) {
        this.Id = id;
        this.Nombre = value;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
}
