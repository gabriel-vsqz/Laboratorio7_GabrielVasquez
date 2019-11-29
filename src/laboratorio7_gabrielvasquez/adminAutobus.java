package laboratorio7_gabrielvasquez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminAutobus {
 
    private ArrayList<Autobus> listaAutobuses = new ArrayList();
    private File archivo = null;

    public adminAutobus(String path) {
        archivo = new File(path);
    }

    public ArrayList<Autobus> getListaAutobuses() {
        return listaAutobuses;
    }

    public void setListaAutobuses(ArrayList<Autobus> listaAutobuses) {
        this.listaAutobuses = listaAutobuses;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setAutobus(Autobus a) {
        listaAutobuses.add(a);
    }
    
    public void cargarArcihivo() {
        try {
            listaAutobuses = new ArrayList();
            Autobus temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ( (temp = (Autobus) objeto.readObject()) != null ) {
                        listaAutobuses.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Autobus a : listaAutobuses) {
                bw.writeObject(a);
            }
            bw.flush();
        } catch (Exception e) {
            
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
                
            }
        }
    }
    
}