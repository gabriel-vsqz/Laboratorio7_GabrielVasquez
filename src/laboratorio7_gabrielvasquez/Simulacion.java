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
        int i = 0;
        while (vive) {
            if (avanzar) {
                double d = distanceFormula(bus.getEstudiantes().get(i).getParada());
                double t = (d / bus.getVelocidad())*60;
                pb.setMaximum((int)bus.getEstudiantes().get(i).getParada().getDistancia());
                pb.setValue(pb.getValue()+1);
                if(pb.getValue() == (int)bus.getEstudiantes().get(i).getParada().getDistancia()) {
                    Object[] row = {
                        bus.getEstudiantes().get(i).getParada(),
                        t,
                        bus.getEstudiantes().get(i).getNombre()
                    };
                    DefaultTableModel model = (DefaultTableModel) tbl.getModel();
                    model.addRow(row);
                    tbl.setModel(model);
                    pb.setValue(0);
                    i++;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
        }
    }

    public double distanceFormula(Parada pd) {
        double distance;

        int x = pd.getCoorx();
        int y = pd.getCoory();
        distance = Math.round(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));

        return distance;
    }

}
