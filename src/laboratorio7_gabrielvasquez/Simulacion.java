package laboratorio7_gabrielvasquez;

import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Simulacion extends Thread {

    JProgressBar pb;
    JTable tbl;
    Autobus bus;
    private boolean avanzar;
    private boolean vive;

    public Simulacion(JProgressBar pb, Autobus bus, JTable tbl) {
        this.pb = pb;
        this.bus = bus;
        this.tbl = tbl;
        avanzar = true;
        vive = true;
    }

    public JProgressBar getPb() {
        return pb;
    }

    public void setPb(JProgressBar pb) {
        this.pb = pb;
    }

    public JTable getTbl() {
        return tbl;
    }

    public void setTbl(JTable tbl) {
        this.tbl = tbl;
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

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                int i = 0;
                    double d = distanceFormula(bus.getEstudiantes().get(i).getParada());
                    double t = d/bus.getVelocidad();
                    int time = (int) t;
                    pb.setMaximum(time);
                    pb.setValue(pb.getValue());
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
            pb.setValue(0);
            
//            Object[] row = {
//                bus.getEstudiantes().get(i).getParada(),
//                time,
//                bus.getEstudiantes().get(i).getNombre()
//            };
//            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
//            model.addRow(row);
//            tbl.setModel(model);
        }
    }

    public double distanceFormula(Parada pd) {
        double distance = 0;

        int x = pd.getCoorx();
        int y = pd.getCoory();
        distance = Math.round(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));

        return distance;
    }
    
    

}