

package itep.diejemplodatabase;

import itep.diejemplodatabase.dao.DaoPersona;
import itep.diejemplodatabase.dao.DaoPersonaImpl;
import itep.diejemplodatabase.dao.Persona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VentanaSecundaria extends javax.swing.JFrame {

    ArrayList<Persona> listaPersonas = new ArrayList();
    ResultSet conjuntoPersonas;


    public VentanaSecundaria() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextApellido1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextApellido2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextDomicilio = new javax.swing.JTextField();
        jComboGenero = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListAficiones = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextDni = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido1 = new javax.swing.JLabel();
        jLabelApellido2 = new javax.swing.JLabel();
        jLabelDomicilio = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jLabelAficiones = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePersonas = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextApellido1Actualizar = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextDniActualizar = new javax.swing.JTextField();
        jTextApellido2Actualizar = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextDomicilioActualizar = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextNombreActualizar = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jComboGeneroActualizar = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListAficionesActualizar = new javax.swing.JList<>();
        jLabel22 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jCheckBoxActivo = new javax.swing.JCheckBox();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jTextApellido1Recorrer = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextDniRecorrer = new javax.swing.JTextField();
        jTextApellido2Recorrer = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextDomicilioRecorrer = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextNombreRecorrer = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jComboGeneroRecorrer = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListAficionesRecorrer = new javax.swing.JList<>();
        jLabel29 = new javax.swing.JLabel();
        jButtonPrevio = new javax.swing.JButton();
        jButtonSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cambioTab(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido 1:");

        jLabel3.setText("Apellido 2:");

        jLabel4.setText("Domicilio:");

        jComboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mujer", "Hombre" }));

        jLabel5.setText("Género:");

        jLabel6.setText("Aficiones:");

        jListAficiones.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Música", "Deporte", "Teatro", "Naturaleza", "Gastronomía" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListAficiones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListAficiones);

        jButton1.setText("Enviar datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grabarPersona(evt);
            }
        });

        jLabel13.setText("DNI:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(jTextDni, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(11, 11, 11))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                                    .addComponent(jTextApellido1)
                                    .addComponent(jTextApellido2, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextDomicilio)
                                    .addComponent(jComboGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Formulario de Persona", jPanel1);

        jLabel7.setText("Nombre:");

        jLabel8.setText("Apellido 1:");

        jLabel9.setText("Apellido 2:");

        jLabel10.setText("Domicilio:");

        jLabel11.setText("Género:");

        jLabel12.setText("Aficiones:");

        jLabelNombre.setText("       ");
        jLabelNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelApellido1.setText("       ");
        jLabelApellido1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelApellido2.setText("       ");
        jLabelApellido2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelDomicilio.setText("       ");
        jLabelDomicilio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelGenero.setText("       ");
        jLabelGenero.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelAficiones.setText("       ");
        jLabelAficiones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setText("DNI:");

        jLabelDni.setText("       ");
        jLabelDni.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAficiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelApellido2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelApellido1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabelDni))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabelNombre))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelApellido1))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabelApellido2))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabelDomicilio))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabelGenero))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabelAficiones))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos de persona", jPanel2);

        jScrollPane3.setViewportView(jTablePersonas);

        jButton4.setText("Actualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personaActualizar(evt);
            }
        });

        jButton5.setText("Borrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarPersonaTabla(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Tabla Personas", jPanel4);

        jLabel16.setText("DNI:");

        jLabel17.setText("Apellido 2:");

        jLabel18.setText("Domicilio:");

        jLabel19.setText("Nombre:");

        jLabel20.setText("Apellido 1:");

        jLabel21.setText("Género:");

        jComboGeneroActualizar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mujer", "Hombre" }));

        jListAficionesActualizar.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Música", "Deporte", "Teatro", "Naturaleza", "Gastronomía" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListAficionesActualizar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jListAficionesActualizar);

        jLabel22.setText("Aficiones:");

        jButton2.setText("Buscar persona");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPersona(evt);
            }
        });

        jButton3.setText("Actualizar datos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarDatos(evt);
            }
        });

        jCheckBoxActivo.setText("Activo/a");

        jButton6.setText("Borrar Persona");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarPersona(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(jTextDniActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(11, 11, 11))
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextNombreActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                                    .addComponent(jTextApellido1Actualizar)
                                    .addComponent(jTextApellido2Actualizar, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel21))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextDomicilioActualizar)
                                    .addComponent(jComboGeneroActualizar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))))))
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextDniActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxActivo))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextNombreActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextApellido1Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextApellido2Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextDomicilioActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboGeneroActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Actualización pesona", jPanel3);

        jLabel23.setText("DNI:");

        jLabel24.setText("Apellido 2:");

        jLabel25.setText("Domicilio:");

        jLabel26.setText("Nombre:");

        jLabel27.setText("Apellido 1:");

        jLabel28.setText("Género:");

        jComboGeneroRecorrer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mujer", "Hombre" }));

        jListAficionesRecorrer.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Música", "Deporte", "Teatro", "Naturaleza", "Gastronomía" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListAficionesRecorrer.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(jListAficionesRecorrer);

        jLabel29.setText("Aficiones:");

        jButtonPrevio.setText("<");
        jButtonPrevio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recorreAtras(evt);
            }
        });

        jButtonSiguiente.setText(">");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recorreDelante(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextDniRecorrer, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextNombreRecorrer)
                                    .addComponent(jTextApellido1Recorrer)
                                    .addComponent(jTextApellido2Recorrer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextDomicilioRecorrer)
                                        .addComponent(jComboGeneroRecorrer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(jButtonPrevio)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonSiguiente))
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextDniRecorrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTextNombreRecorrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextApellido1Recorrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextApellido2Recorrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextDomicilioRecorrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboGeneroRecorrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrevio)
                    .addComponent(jButtonSiguiente))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Recorrer lista personas", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Formulario Persona");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personaActualizar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personaActualizar
        int personaSeleccionada = jTablePersonas.getSelectedRow();
        if (personaSeleccionada != -1) {
            Persona p = listaPersonas.get(personaSeleccionada);
            jTextDniActualizar.setText(p.getDni());
            jTextNombreActualizar.setText(p.getNombre());
            jTextApellido1Actualizar.setText(p.getApellido1());
            jTextApellido2Actualizar.setText(p.getApellido2());
            jTextDomicilioActualizar.setText(p.getDomicilio());
            jComboGeneroActualizar.setSelectedItem(p.getGenero());
            jListAficionesActualizar.setSelectedValue(p.getAficion(), true);
            jTabbedPane1.setSelectedIndex(3);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una persona", "Error", JOptionPane.ERROR_MESSAGE);
        }
        //navegar al tab de actualización.

    }//GEN-LAST:event_personaActualizar
    private void actualizarDatos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarDatos
        //Recoger los datos de las cajascrear persona y pasarla a
        String dni = jTextDniActualizar.getText();
        if("".equals(dni)){
            JFrame frame = new JFrame("Ejemplo de Ventana Modal");
                JOptionPane.showMessageDialog(frame, "Inserte un DNI", "Información", JOptionPane.INFORMATION_MESSAGE);       
        }
        else {
        DaoPersonaImpl daop = new DaoPersonaImpl();
        Persona p = new Persona(jTextDniActualizar.getText(), jTextNombreActualizar.getText(), jTextApellido1Actualizar.getText(), jTextApellido2Actualizar.getText(),
                jTextDomicilioActualizar.getText(), (String) jComboGeneroActualizar.getSelectedItem(), jListAficionesActualizar.getSelectedValue());
        daop.modificarPersona(p);
        }
    }//GEN-LAST:event_actualizarDatos
    private void buscarPersona(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPersona
        
        
        DaoPersonaImpl daop = new DaoPersonaImpl();
        String dni = jTextDniActualizar.getText();
        if("".equals(dni)){
            JFrame frame = new JFrame("Ejemplo de Ventana Modal");
                JOptionPane.showMessageDialog(frame, "Inserte un DNI", "Información", JOptionPane.INFORMATION_MESSAGE);       
        }
        else {Persona persona = daop.leerPersona(dni);
        jTextNombreActualizar.setText(persona.getNombre());
        jTextApellido1Actualizar.setText(persona.getApellido1());
        jTextApellido2Actualizar.setText(persona.getApellido2());
        jTextDomicilioActualizar.setText(persona.getDomicilio());  }
    }//GEN-LAST:event_buscarPersona
    private void grabarPersona(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grabarPersona
        // Rellenamos los campos del tab Datos de Persona
        String dni = jTextDniActualizar.getText();
        if("".equals(dni)){
            JFrame frame = new JFrame("Ejemplo de Ventana Modal");
                JOptionPane.showMessageDialog(frame, "Inserte un DNI", "Información", JOptionPane.INFORMATION_MESSAGE);       
        }
        else {
        jLabelDni.setText(jTextDni.getText());
        jLabelNombre.setText(jTextNombre.getText());
        jLabelApellido1.setText(jTextApellido1.getText());
        jLabelApellido2.setText(jTextApellido2.getText());
        jLabelDomicilio.setText(jTextDomicilio.getText());
        jLabelGenero.setText((String) jComboGenero.getSelectedItem());
        jLabelAficiones.setText(jListAficiones.getSelectedValue());
        // Incluimos en el objeto ArrayList de personas a la nueva persona
        Persona p = new Persona(jTextDni.getText(), jTextNombre.getText(), jTextApellido1.getText(), jTextApellido2.getText(),
                jTextDomicilio.getText(), (String) jComboGenero.getSelectedItem(), jListAficiones.getSelectedValue());
        listaPersonas.add(p);
        // Incluir los objetos que me van a ayudar a guardar a la persona como un registro de una tabla
        DaoPersonaImpl daop = new DaoPersonaImpl();
        daop.guardarPersona(p);
        //Pasar a la ventana de etiquetas de la nueva Persona
        jTabbedPane1.setSelectedIndex(1);
        }
    }//GEN-LAST:event_grabarPersona
    private void cambioTab(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cambioTab
        if (jTabbedPane1.getSelectedIndex() == 2) {
            setTabla();
        } else if (jTabbedPane1.getSelectedIndex() == 4) {
            rellenaRecorrerPersonas();
        }
    }//GEN-LAST:event_cambioTab
    private void borrarPersona(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarPersona
        String dni = jTextDniActualizar.getText();
        if("".equals(dni)){
            JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame, "Inserte un DNI", "Información", JOptionPane.INFORMATION_MESSAGE);       
        }
        else {
        DaoPersonaImpl daop = new DaoPersonaImpl();
        Persona p = new Persona(jTextDniActualizar.getText(), jTextNombreActualizar.getText(), jTextApellido1Actualizar.getText(), jTextApellido2Actualizar.getText(),
                jTextDomicilioActualizar.getText(), (String) jComboGeneroActualizar.getSelectedItem(), jListAficionesActualizar.getSelectedValue());
        boolean exito = daop.eliminarPersona(p);
        if (!exito)
            JOptionPane.showMessageDialog(this, "No se pudo borrar la persona", "Error", JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(this, "La persona se borró", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_borrarPersona
    private void borrarPersonaTabla(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarPersonaTabla
        int personaSeleccionada = jTablePersonas.getSelectedRow();
        if (personaSeleccionada != -1) {
            Persona p = listaPersonas.get(personaSeleccionada);
            DaoPersonaImpl daop = new DaoPersonaImpl();
            boolean exito = daop.eliminarPersona(p);
            if (!exito) {
                JOptionPane.showMessageDialog(this, "No se pudo borrar la persona", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "La persona se borró", "Exito", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_borrarPersonaTabla
    private void recorreAtras(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recorreAtras
        try {
            // TODO add your handling code here:
            if (!conjuntoPersonas.isFirst() && conjuntoPersonas.previous()) {
                rellenaRecorrer();
            }else{
                JOptionPane.showMessageDialog(this, "No hay más registros detrás", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error de base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_recorreAtras

    private void recorreDelante(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recorreDelante
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            if (!conjuntoPersonas.isLast()&& conjuntoPersonas.next()) {
                rellenaRecorrer();
            }else{
                JOptionPane.showMessageDialog(this, "No hay más registros delante", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error de base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_recorreDelante
    private void rellenaRecorrerPersonas() {
        // Creamos un resulset que se pueda recorrer en ambos sentidos
        DaoPersonaImpl daop = new DaoPersonaImpl();
        conjuntoPersonas = daop.resulsetGet();
        if (conjuntoPersonas != null) {
            try {
                if (conjuntoPersonas.first()) {
                    rellenaRecorrer();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error de base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo cargar el formulario", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void rellenaRecorrer() {
        try {
            jTextDniRecorrer.setText(conjuntoPersonas.getString(1));
            jTextNombreRecorrer.setText(conjuntoPersonas.getString(2));
            jTextApellido1Recorrer.setText(conjuntoPersonas.getString(3));
            jTextApellido2Recorrer.setText(conjuntoPersonas.getString(4));
            jTextDomicilioRecorrer.setText(conjuntoPersonas.getString(5));
            jComboGeneroRecorrer.setSelectedItem(conjuntoPersonas.getString(6));
            jListAficionesRecorrer.setSelectedValue(conjuntoPersonas.getString(7), true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error de base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    void setTabla() {
        DefaultTableModel model = (DefaultTableModel) jTablePersonas.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);
        DaoPersona personasDao = new DaoPersonaImpl();
        model.addColumn("Dni");
        model.addColumn("Nombre");
        model.addColumn("Apellido1");
        model.addColumn("Apellido2");
        model.addColumn("Domicilio");
        model.addColumn("Género");
        model.addColumn("Afición");
        listaPersonas = personasDao.leerPersonas();
        Vector<String> dni = null;
        Vector<String> nombre = null;
        Vector<String> apellido1 = null;
        Vector<String> apellido2 = null;
        Vector<String> domicilio = null;
        Vector<String> genero = null;
        Vector<String> aficion = null;

        for (int i = 0; i < listaPersonas.size(); i++) {
            dni = new Vector<>(Arrays.asList(listaPersonas.get(i).getDni()));
            nombre = new Vector<>(Arrays.asList(listaPersonas.get(i).getNombre()));
            apellido1 = new Vector<>(Arrays.asList(listaPersonas.get(i).getApellido1()));
            apellido2 = new Vector<>(Arrays.asList(listaPersonas.get(i).getApellido2()));
            domicilio = new Vector<>(Arrays.asList(listaPersonas.get(i).getDomicilio()));
            genero = new Vector<>(Arrays.asList(listaPersonas.get(i).getGenero()));
            aficion = new Vector<>(Arrays.asList(listaPersonas.get(i).getAficion()));

            Vector<Object> row = new Vector<Object>();
            row.addElement(dni.get(0));
            row.addElement(nombre.get(0));
            row.addElement(apellido1.get(0));
            row.addElement(apellido2.get(0));
            row.addElement(domicilio.get(0));
            row.addElement(genero.get(0));
            row.addElement(aficion.get(0));
            model.addRow(row);
        }

        jTablePersonas.setModel(model);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaSecundaria().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonPrevio;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JCheckBox jCheckBoxActivo;
    private javax.swing.JComboBox<String> jComboGenero;
    private javax.swing.JComboBox<String> jComboGeneroActualizar;
    private javax.swing.JComboBox<String> jComboGeneroRecorrer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAficiones;
    private javax.swing.JLabel jLabelApellido1;
    private javax.swing.JLabel jLabelApellido2;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelDomicilio;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JList<String> jListAficiones;
    private javax.swing.JList<String> jListAficionesActualizar;
    private javax.swing.JList<String> jListAficionesRecorrer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTablePersonas;
    private javax.swing.JTextField jTextApellido1;
    private javax.swing.JTextField jTextApellido1Actualizar;
    private javax.swing.JTextField jTextApellido1Recorrer;
    private javax.swing.JTextField jTextApellido2;
    private javax.swing.JTextField jTextApellido2Actualizar;
    private javax.swing.JTextField jTextApellido2Recorrer;
    private javax.swing.JTextField jTextDni;
    private javax.swing.JTextField jTextDniActualizar;
    private javax.swing.JTextField jTextDniRecorrer;
    private javax.swing.JTextField jTextDomicilio;
    private javax.swing.JTextField jTextDomicilioActualizar;
    private javax.swing.JTextField jTextDomicilioRecorrer;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextNombreActualizar;
    private javax.swing.JTextField jTextNombreRecorrer;
    // End of variables declaration//GEN-END:variables

}
