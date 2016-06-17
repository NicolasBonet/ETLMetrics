package co.edu.uniandes.proyectoautomatizacion.pojo;

/**
 * Created by juandavid on 4/20/15.
 */
import java.io.Serializable;

public class Location implements Serializable {

    private String latitude;
    private String longitude;
    private String altitude;
    private String relevantText;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAltitude() {
        return altitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    public String getRelevantText() {
        return relevantText;
    }

    public void setRelevantText(String relevantText) {
        this.relevantText = relevantText;
    }

    @Override
    public String toString() {
        return "Location{" +
                "latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", altitude='" + altitude + '\'' +
                ", relevantText='" + relevantText + '\'' +
                '}';
    }
}