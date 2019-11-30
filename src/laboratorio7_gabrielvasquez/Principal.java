package laboratorio7_gabrielvasquez;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_cEstudiante = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        st_nombre = new javax.swing.JTextField();
        st_cuenta = new javax.swing.JTextField();
        box_paradas = new javax.swing.JComboBox<>();
        st_edad = new javax.swing.JSpinner();
        b_crearStudent = new javax.swing.JButton();
        jd_cAutobus = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bs_id = new javax.swing.JTextField();
        bs_placa = new javax.swing.JTextField();
        bs_velocidad = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        b_crearBus = new javax.swing.JButton();
        bs_color = new javax.swing.JButton();
        jd_cParada = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        pd_nombre = new javax.swing.JTextField();
        pd_distancia = new javax.swing.JSpinner();
        pd_angulo = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        b_crearStop = new javax.swing.JButton();
        jd_Organizar = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        box_buses = new javax.swing.JComboBox<>();
        box_students = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        b_agregarStudent = new javax.swing.JButton();
        b_routeReady = new javax.swing.JButton();
        b_elegirBus = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        jd_showInfo = new javax.swing.JDialog();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBuses = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtParadas = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtEstudiantes = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        bar = new javax.swing.JProgressBar();
        jLabel14 = new javax.swing.JLabel();
        b_startRun = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newStudent = new javax.swing.JMenuItem();
        newBus = new javax.swing.JMenuItem();
        newStop = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        organizeRoutes = new javax.swing.JMenuItem();
        showInfo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Exit = new javax.swing.JMenuItem();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear Estudiante");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel3.setText("Edad");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel4.setText("Número de Cuenta");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel5.setText("Parada");

        st_nombre.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        st_cuenta.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        box_paradas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        st_edad.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        st_edad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        b_crearStudent.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        b_crearStudent.setText("Registrar");
        b_crearStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_crearStudentMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_cEstudianteLayout = new javax.swing.GroupLayout(jd_cEstudiante.getContentPane());
        jd_cEstudiante.getContentPane().setLayout(jd_cEstudianteLayout);
        jd_cEstudianteLayout.setHorizontalGroup(
            jd_cEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_cEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jd_cEstudianteLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jd_cEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jd_cEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(st_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(st_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_cuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(box_paradas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
            .addGroup(jd_cEstudianteLayout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(b_crearStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_cEstudianteLayout.setVerticalGroup(
            jd_cEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_cEstudianteLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jd_cEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jd_cEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jd_cEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jd_cEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_paradas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(b_crearStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Crear Autobus");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel7.setText("Número de Identificación");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel8.setText("Placa");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel9.setText("Color");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel10.setText("Velocidad");

        bs_id.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        bs_placa.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        bs_velocidad.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        bs_velocidad.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("km/h");

        b_crearBus.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        b_crearBus.setText("Crear");
        b_crearBus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_crearBusMouseClicked(evt);
            }
        });

        bs_color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bs_colorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_cAutobusLayout = new javax.swing.GroupLayout(jd_cAutobus.getContentPane());
        jd_cAutobus.getContentPane().setLayout(jd_cAutobusLayout);
        jd_cAutobusLayout.setHorizontalGroup(
            jd_cAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_cAutobusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jd_cAutobusLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jd_cAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jd_cAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bs_id, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addGroup(jd_cAutobusLayout.createSequentialGroup()
                        .addComponent(bs_velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(bs_placa, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(bs_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
            .addGroup(jd_cAutobusLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(b_crearBus, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_cAutobusLayout.setVerticalGroup(
            jd_cAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_cAutobusLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(43, 43, 43)
                .addGroup(jd_cAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bs_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jd_cAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bs_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jd_cAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bs_color, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jd_cAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bs_velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(b_crearBus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Crear Parada");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel19.setText("Nombre");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel20.setText("Distancia");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel21.setText("Ángulo");

        pd_distancia.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        pd_distancia.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        pd_angulo.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        pd_angulo.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 360.0d, 1.0d));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("km");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("radianes");

        b_crearStop.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        b_crearStop.setText("Crear");
        b_crearStop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_crearStopMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_cParadaLayout = new javax.swing.GroupLayout(jd_cParada.getContentPane());
        jd_cParada.getContentPane().setLayout(jd_cParadaLayout);
        jd_cParadaLayout.setHorizontalGroup(
            jd_cParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_cParadaLayout.createSequentialGroup()
                .addGroup(jd_cParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_cParadaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jd_cParadaLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jd_cParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_cParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_cParadaLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jd_cParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pd_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jd_cParadaLayout.createSequentialGroup()
                                        .addComponent(pd_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_cParadaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pd_angulo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 78, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jd_cParadaLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(b_crearStop, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_cParadaLayout.setVerticalGroup(
            jd_cParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_cParadaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel18)
                .addGap(39, 39, 39)
                .addGroup(jd_cParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pd_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jd_cParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pd_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jd_cParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pd_angulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(b_crearStop, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Organizar Ruta");

        box_buses.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        box_students.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Autobus");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Estudiante");

        b_agregarStudent.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        b_agregarStudent.setText("Agregar");
        b_agregarStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_agregarStudentMouseClicked(evt);
            }
        });

        b_routeReady.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        b_routeReady.setText("Listo");
        b_routeReady.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_routeReadyMouseClicked(evt);
            }
        });

        b_elegirBus.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        b_elegirBus.setText("Elegir");
        b_elegirBus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_elegirBusMouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Estudiantes en Bus");

        txtarea.setEditable(false);
        txtarea.setColumns(20);
        txtarea.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtarea.setRows(5);
        jScrollPane3.setViewportView(txtarea);

        javax.swing.GroupLayout jd_OrganizarLayout = new javax.swing.GroupLayout(jd_Organizar.getContentPane());
        jd_Organizar.getContentPane().setLayout(jd_OrganizarLayout);
        jd_OrganizarLayout.setHorizontalGroup(
            jd_OrganizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_OrganizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jd_OrganizarLayout.createSequentialGroup()
                .addGroup(jd_OrganizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_OrganizarLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(b_agregarStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_OrganizarLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jd_OrganizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(box_students, 0, 200, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jd_OrganizarLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jd_OrganizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(box_buses, 0, 200, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jd_OrganizarLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(b_elegirBus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jd_OrganizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57))
            .addGroup(jd_OrganizarLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(b_routeReady, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_OrganizarLayout.setVerticalGroup(
            jd_OrganizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_OrganizarLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel15)
                .addGap(36, 36, 36)
                .addGroup(jd_OrganizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jd_OrganizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_OrganizarLayout.createSequentialGroup()
                        .addGap(18, 19, Short.MAX_VALUE)
                        .addComponent(box_buses, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b_elegirBus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(box_students, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b_agregarStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_OrganizarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3)))
                .addGap(34, 34, 34)
                .addComponent(b_routeReady, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Buses");

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Estudiantes");

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Paradas");

        txtBuses.setEditable(false);
        txtBuses.setColumns(20);
        txtBuses.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtBuses.setRows(5);
        jScrollPane2.setViewportView(txtBuses);

        txtParadas.setEditable(false);
        txtParadas.setColumns(20);
        txtParadas.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtParadas.setRows(5);
        jScrollPane4.setViewportView(txtParadas);

        txtEstudiantes.setEditable(false);
        txtEstudiantes.setColumns(20);
        txtEstudiantes.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtEstudiantes.setRows(5);
        jScrollPane5.setViewportView(txtEstudiantes);

        javax.swing.GroupLayout jd_showInfoLayout = new javax.swing.GroupLayout(jd_showInfo.getContentPane());
        jd_showInfo.getContentPane().setLayout(jd_showInfoLayout);
        jd_showInfoLayout.setHorizontalGroup(
            jd_showInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_showInfoLayout.createSequentialGroup()
                .addGroup(jd_showInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_showInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_showInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jd_showInfoLayout.createSequentialGroup()
                        .addGroup(jd_showInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_showInfoLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_showInfoLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_showInfoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jd_showInfoLayout.setVerticalGroup(
            jd_showInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_showInfoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parada", "Tiempo", "Estudiantes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Simulación");

        b_startRun.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        b_startRun.setText("Iniciar");
        b_startRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_startRunMouseClicked(evt);
            }
        });

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

        jMenu2.setText("Organizar");

        organizeRoutes.setText("Asignar Buses");
        organizeRoutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizeRoutesActionPerformed(evt);
            }
        });
        jMenu2.add(organizeRoutes);

        showInfo.setText("Visualizar Binarios");
        showInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showInfoActionPerformed(evt);
            }
        });
        jMenu2.add(showInfo);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sistema");

        Exit.setText("Salir");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu3.add(Exit);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                            .addComponent(bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b_startRun, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(324, 324, 324))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(b_startRun, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStudentActionPerformed
        ap.cargarArcihivo();

        try {
            DefaultComboBoxModel m = (DefaultComboBoxModel) box_paradas.getModel();
            for (int i = 0; i < ap.getListaParadas().size(); i++) {
                m.addElement(ap.getListaParadas().get(i));
            }
            box_paradas.setModel(m);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

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

    private void b_crearStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_crearStudentMouseClicked
        String n = st_nombre.getText();
        int e = (int) st_edad.getValue();
        String c = st_cuenta.getText();
        Parada p = (Parada) box_paradas.getSelectedItem();
        
        ae.cargarArcihivo();
        boolean pass = true;
        for (int i = 0; i < ae.getListaEstudiantes().size(); i++) {
            if (st_cuenta.getText().equals(ae.getListaEstudiantes().get(i).getCuenta())) {
                pass = false;
            }
        }

        if (n.equals("") || c.equals("")) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        } else if (pass == true) {
            Estudiante st = new Estudiante(n, e, c, p);
            ae.cargarArcihivo();
            ae.setEstudiante(st);
            ae.escribirArchivo();
            JOptionPane.showMessageDialog(this, "Estudiante Registrado Exitosamente");

            st_nombre.setText("");
            st_edad.setValue(0);
            st_cuenta.setText("");
            box_paradas.setSelectedIndex(0);   
        } else {
            JOptionPane.showMessageDialog(this, "El número de cuenta ya existe");
        }
    }//GEN-LAST:event_b_crearStudentMouseClicked

    private void b_crearBusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_crearBusMouseClicked
        int i = Integer.parseInt(bs_id.getText());
        String p = bs_placa.getText();
        Color c = bs_color.getBackground();
        double v = (double) bs_velocidad.getValue();
        
        aa.cargarArcihivo();
        boolean pass = true;
        for (int j = 0; j < aa.getListaAutobuses().size(); j++) {
            if (bs_placa.getText().equals(aa.getListaAutobuses().get(j).getPlaca()) || bs_id.getText().equals(aa.getListaAutobuses().get(j).getId())) {
                pass = false;
            }
        }
        
        if (bs_id.getText().equals("") || p.equals("") || c.equals("")) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        } else if (pass == false) {
            JOptionPane.showMessageDialog(this, "La placa del autobus o el ID del autobus ya está registrado");
        } else {
            Autobus ab = new Autobus(i, p, c, v);
            aa.cargarArcihivo();
            aa.setAutobus(ab);
            aa.escribirArchivo();
            JOptionPane.showMessageDialog(this, "Autobus Registrado Exitosamente");

            bs_id.setText("");
            bs_placa.setText("");
            bs_color.setText("");
            bs_velocidad.setValue(0);
        }
    }//GEN-LAST:event_b_crearBusMouseClicked

    private void b_crearStopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_crearStopMouseClicked
        String n = pd_nombre.getText();
        double d = (double) pd_distancia.getValue();
        double a = (double) pd_angulo.getValue();
        double dx = d * Math.cos(a);
        int x = (int) dx;
        double dy = d * Math.sin(a);
        int y = (int) dy;

        ap.cargarArcihivo();
        boolean pass = true;
        for (int j = 0; j < ap.getListaParadas().size(); j++) {
            if (pd_nombre.getText().equals(ap.getListaParadas().get(j).getNombre())) {
                pass = false;
            }
        }
        
        if (n.equals("")) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        } else if (pass == false) {
            JOptionPane.showMessageDialog(this, "La parada bajo ese nombre ya está registrada");
        } else {
            Parada pd = new Parada(n, d, a, x, y);
            ap.cargarArcihivo();
            ap.setParad(pd);
            ap.escribirArchivo();
            JOptionPane.showMessageDialog(this, "Parada Registrada Exitosamente");

            pd_nombre.setText("");
            pd_angulo.setValue(0);
        }
    }//GEN-LAST:event_b_crearStopMouseClicked

    private void organizeRoutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizeRoutesActionPerformed
        ae.cargarArcihivo();
        aa.cargarArcihivo();

        box_buses.setEnabled(true);
        txtarea.setText("");

        try {
            DefaultComboBoxModel m = (DefaultComboBoxModel) box_buses.getModel();
            for (int i = 0; i < aa.getListaAutobuses().size(); i++) {
                m.addElement(aa.getListaAutobuses().get(i));
            }
            box_buses.setModel(m);

            DefaultComboBoxModel l = (DefaultComboBoxModel) box_students.getModel();
            for (int i = 0; i < ae.getListaEstudiantes().size(); i++) {
                l.addElement(ae.getListaEstudiantes().get(i));
            }
            box_students.setModel(l);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        jd_Organizar.setModal(true);
        jd_Organizar.pack();
        jd_Organizar.setLocationRelativeTo(this);
        jd_Organizar.setVisible(true);
    }//GEN-LAST:event_organizeRoutesActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void b_elegirBusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_elegirBusMouseClicked
        ruta = (Autobus) box_buses.getSelectedItem();
        bpos = box_buses.getSelectedIndex();
        box_buses.setEnabled(false);
    }//GEN-LAST:event_b_elegirBusMouseClicked

    private void b_agregarStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_agregarStudentMouseClicked
        Estudiante st = (Estudiante) box_students.getSelectedItem();

        txtarea.append(st.toString()+"\n");
        
        aa.cargarArcihivo();
        aa.getListaAutobuses().get(bpos).setEstudiante(st);
        aa.escribirArchivo();

        DefaultComboBoxModel m = (DefaultComboBoxModel) box_students.getModel();
        m.removeElement(st);
        box_students.setModel(m);
    }//GEN-LAST:event_b_agregarStudentMouseClicked

    private void b_routeReadyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_routeReadyMouseClicked
        jd_Organizar.setVisible(false);
        ruta = (Autobus) box_buses.getSelectedItem();
    }//GEN-LAST:event_b_routeReadyMouseClicked

    private void b_startRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_startRunMouseClicked
        cleanTable();
        s = new Simulacion(bar,ruta,table);
        s.start();
    }//GEN-LAST:event_b_startRunMouseClicked

    private void bs_colorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bs_colorMouseClicked
        bs_color.setBackground(JColorChooser.showDialog(this, "Elija el color del bus", Color.white));
    }//GEN-LAST:event_bs_colorMouseClicked

    private void showInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showInfoActionPerformed
        ae.cargarArcihivo();
        aa.cargarArcihivo();
        ap.cargarArcihivo();
        
        txtBuses.setText("");
        txtEstudiantes.setText("");
        txtParadas.setText("");
        
            for (int i = 0; i < ae.getListaEstudiantes().size(); i++) {
                txtEstudiantes.append("Nombre: " + ae.getListaEstudiantes().get(i).getNombre() +
                        " - Cuenta: " + ae.getListaEstudiantes().get(i).getCuenta() +
                        " - Edad: " + ae.getListaEstudiantes().get(i).getEdad() +
                        " - Parada: " + ae.getListaEstudiantes().get(i).getParada() + "\n");
            }
            for (int i = 0; i < aa.getListaAutobuses().size(); i++) {
                txtBuses.append("No. de ID: " + aa.getListaAutobuses().get(i).getId()+
                        " - Placa: " + aa.getListaAutobuses().get(i).getPlaca() +
                        " - Color: " + aa.getListaAutobuses().get(i).getColor() +
                        " - Velocidad: " + aa.getListaAutobuses().get(i).getVelocidad() +
                        " - Estudiantes: " + aa.getListaAutobuses().get(i).getEstudiantes() + "\n");
            }
            for (int i = 0; i < ap.getListaParadas().size(); i++) {
                txtParadas.append("Nombre: " + ap.getListaParadas().get(i).getNombre() +
                        " - Distancia: " + ap.getListaParadas().get(i).getDistancia() +
                        " - Ángulo: " + ap.getListaParadas().get(i).getAngulo() +
                        " - Coordenadas: (" + ap.getListaParadas().get(i).getCoorx() + "," + ap.getListaParadas().get(i).getCoory() + ")\n");
            }
        
        jd_showInfo.setModal(true);
        jd_showInfo.pack();
        jd_showInfo.setLocationRelativeTo(this);
        jd_showInfo.setVisible(true);
                
    }//GEN-LAST:event_showInfoActionPerformed

    public void cleanTable() {
        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Parada", "Tiempo", "Estudiantes"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
        }
    }

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
    private javax.swing.JMenuItem Exit;
    private javax.swing.JButton b_agregarStudent;
    private javax.swing.JButton b_crearBus;
    private javax.swing.JButton b_crearStop;
    private javax.swing.JButton b_crearStudent;
    private javax.swing.JButton b_elegirBus;
    private javax.swing.JButton b_routeReady;
    private javax.swing.JButton b_startRun;
    private javax.swing.JProgressBar bar;
    private javax.swing.JComboBox<String> box_buses;
    private javax.swing.JComboBox<String> box_paradas;
    private javax.swing.JComboBox<String> box_students;
    private javax.swing.JButton bs_color;
    private javax.swing.JTextField bs_id;
    private javax.swing.JTextField bs_placa;
    private javax.swing.JSpinner bs_velocidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JDialog jd_Organizar;
    private javax.swing.JDialog jd_cAutobus;
    private javax.swing.JDialog jd_cEstudiante;
    private javax.swing.JDialog jd_cParada;
    private javax.swing.JDialog jd_showInfo;
    private javax.swing.JMenuItem newBus;
    private javax.swing.JMenuItem newStop;
    private javax.swing.JMenuItem newStudent;
    private javax.swing.JMenuItem organizeRoutes;
    private javax.swing.JSpinner pd_angulo;
    private javax.swing.JSpinner pd_distancia;
    private javax.swing.JTextField pd_nombre;
    private javax.swing.JMenuItem showInfo;
    private javax.swing.JTextField st_cuenta;
    private javax.swing.JSpinner st_edad;
    private javax.swing.JTextField st_nombre;
    private javax.swing.JTable table;
    private javax.swing.JTextArea txtBuses;
    private javax.swing.JTextArea txtEstudiantes;
    private javax.swing.JTextArea txtParadas;
    private javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables
    adminEstudiante ae = new adminEstudiante("./Estudiantes.gvs");
    adminAutobus aa = new adminAutobus("./Autobuses.gvs");
    adminParada ap = new adminParada("./Paradas.gvs");
    Autobus ruta;
    int bpos;
    Simulacion s;

}
