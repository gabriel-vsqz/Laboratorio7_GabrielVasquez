package laboratorio7_gabrielvasquez;

import javax.swing.JProgressBar;

public class Simulacion extends Thread {
 
    JProgressBar pb;
    Autobus bus;
    private int x;
    private boolean avanzar;
    private boolean vive;

    public Simulacion(JProgressBar pb, Autobus bus) {
        this.pb = pb;
        this.bus = bus;
        avanzar = true;
        vive = true;
    }

    public JProgressBar getPb() {
        return pb;
    }

    public void setPb(JProgressBar pb) {
        this.pb = pb;
    }

    public Autobus getBus() {
        return bus;
    }

    public void setBus(Autobus bus) {
        this.bus = bus;
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
                
            }
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}