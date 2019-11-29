package laboratorio7_gabrielvasquez;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_cEstudiante = new javax.swing.JDialog();
        jd_cAutobus = new javax.swing.JDialog();
        jd_cParada = new javax.swing.JDialog();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newStudent = new javax.swing.JMenuItem();
        newBus = new javax.swing.JMenuItem();
        newStop = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jd_cEstudianteLayout = new javax.swing.GroupLayout(jd_cEstudiante.getContentPane());
        jd_cEstudiante.getContentPane().setLayout(jd_cEstudianteLayout);
        jd_cEstudianteLayout.setHorizontalGroup(
            jd_cEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jd_cEstudianteLayout.setVerticalGroup(
            jd_cEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_cAutobusLayout = new javax.swing.GroupLayout(jd_cAutobus.getContentPane());
        jd_cAutobus.getContentPane().setLayout(jd_cAutobusLayout);
        jd_cAutobusLayout.setHorizontalGroup(
            jd_cAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jd_cAutobusLayout.setVerticalGroup(
            jd_cAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_cParadaLayout = new javax.swing.GroupLayout(jd_cParada.getContentPane());
        jd_cParada.getContentPane().setLayout(jd_cParadaLayout);
        jd_cParadaLayout.setHorizontalGroup(
            jd_cParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jd_cParadaLayout.setVerticalGroup(
            jd_cParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Crear");

        newStudent.setText("Nuevo Estudiante");
        newStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStudentActionPerformed(evt);
            }
        });
        jMenu1.add(newStudent);

        newBus.setText("Nuevo Autobus");
        newBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBusActionPerformed(evt);
            }
        });
        jMenu1.add(newBus);

        newStop.setText("Nueva Parada");
        newStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStopActionPerformed(evt);
            }
        });
        jMenu1.add(newStop);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStudentActionPerformed
        jd_cEstudiante.setModal(true);
        jd_cEstudiante.pack();
        jd_cEstudiante.setLocationRelativeTo(this);
        jd_cEstudiante.setVisible(true);
    }//GEN-LAST:event_newStudentActionPerformed

    private void newBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBusActionPerformed
        jd_cAutobus.setModal(true);
        jd_cAutobus.pack();
        jd_cAutobus.setLocationRelativeTo(this);
        jd_cAutobus.setVisible(true);
    }//GEN-LAST:event_newBusActionPerformed

    private void newStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStopActionPerformed
        jd_cParada.setModal(true);
        jd_cParada.pack();
        jd_cParada.setLocationRelativeTo(this);
        jd_cParada.setVisible(true);
    }//GEN-LAST:event_newStopActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDialog jd_cAutobus;
    private javax.swing.JDialog jd_cEstudiante;
    private javax.swing.JDialog jd_cParada;
    private javax.swing.JMenuItem newBus;
    private javax.swing.JMenuItem newStop;
    private javax.swing.JMenuItem newStudent;
    // End of variables declaration//GEN-END:variables
    adminEstudiante ae = new adminEstudiante("./Estudiantes.gvs");
    adminAutobus aa = new adminAutobus("./Autobuses.gvs");
    adminParada ap = new adminParada("./Paradas.gvs");

}