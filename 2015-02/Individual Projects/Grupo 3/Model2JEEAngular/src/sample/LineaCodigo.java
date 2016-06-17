package sample;

import javax.sound.sampled.Line;

/**
 * Created by samuel on 11/24/15.
 */
public class LineaCodigo {
    private String lenguaje;
    private int loc;


    public LineaCodigo(){

    }
    public LineaCodigo(String lenguaje){
        this.lenguaje = lenguaje;

    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public int getLoc() {
        return loc;
    }

    public void setLoc(int loc) {
        this.loc = loc;
    }
}
