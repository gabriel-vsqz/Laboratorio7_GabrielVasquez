package laboratorio7_gabrielvasquez;

import java.io.Serializable;

public class Parada implements Serializable {
 
    private String nombre;
    private double distancia;
    private double angulo;
    private int coorx;
    private int coory;

    public Parada(String nombre, double distancia, double angulo, int coorx, int coory) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.angulo = angulo;
        this.coorx = coorx;
        this.coory = coory;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public int getCoorx() {
        return coorx;
    }

    public void setCoorx(int coorx) {
        this.coorx = coorx;
    }

    public int getCoory() {
        return coory;
    }

    public void setCoory(int coory) {
        this.coory = coory;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}