package laboratorio7_gabrielvasquez;

import java.io.Serializable;
import java.util.ArrayList;

public class Autobus implements Serializable {
 
    private int id;
    private String placa;
    private String color;
    private double velocidad;
    private ArrayList<Estudiante> estudiantes = new ArrayList();

    public Autobus(int id, String placa, String color, double velocidad) {
        this.id = id;
        this.placa = placa;
        this.color = color;
        this.velocidad = velocidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    public void setEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    @Override
    public String toString() {
        return "" + id;
    }
    
}