package laboratorio7_gabrielvasquez;

import javax.swing.JProgressBar;

public class Simulacion extends Thread {
 
    JProgressBar pb;
    private boolean avanzar;
    private boolean vive;

    public Simulacion(JProgressBar pb) {
        this.pb = pb;
        avanzar = true;
        vive = true;
    }

    public JProgressBar getPb() {
        return pb;
    }

    public void setPb(JProgressBar pb) {
        this.pb = pb;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public void run() {
        while (vive) {
            if (avanzar) {
//                progBar_d.setValue(Math.round( Integer.parseInt(sp_velocidad.getValue().toString()) * (progBar_t.getValue() / 60) ));
//                progBar_d.setString( Integer.toString(progBar_d.getValue()) + "Kilómetros" );
            }
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}