/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.EstadoCivilController;
import controller.FuncionarioControlller;
import controller.TipoIdentificacionController;
import dao.EstadoCivilDao;
import dao.EstadoCivilDaoImpl;
import dao.FuncionarioDao;
import dao.FuncionarioDaoImpl;
import dao.TipoIdentificacionDao;
import dao.TipoIdentificacionDaoImpl;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;
import domain.EstadoCivil;
import domain.Funcionario;
import domain.TipoIdentificacion;
import utis.Mensajes;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import static java.time.LocalDate.now;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Super
 */
public class JFPrincipal extends javax.swing.JFrame {
    
    private TipoIdentificacionController tipoIdCtrl;
    private EstadoCivilController tipoEstadoCCtrl;
    private FuncionarioControlller funcionarioCtrl;
    /**
     * Creates new form JFPrincipal
     */
    public JFPrincipal() {
        initComponents();
        init();
    }
    
    private void init(){
        llenarComboTipoDoc();
        llenarComboEstadoCivil();
        llenarTablaFuncionarios();
        jBBorrar.setEnabled(false);
        jBEditar.setEnabled(false);
        jBActualizar.setEnabled(false);
    }
    
    private void llenarComboTipoDoc(){
        TipoIdentificacionDao tipoIdentificacionDao= new TipoIdentificacionDaoImpl();
        tipoIdCtrl= new TipoIdentificacionController(tipoIdentificacionDao);
        jCBTipoID.setModel(tipoIdCtrl.llenarCombo());
        
    }
    
    private void llenarComboEstadoCivil(){
        EstadoCivilDao estadoCivilDao= new EstadoCivilDaoImpl();
        tipoEstadoCCtrl= new EstadoCivilController(estadoCivilDao);
        jCBEstadoC.setModel(tipoEstadoCCtrl.llenarCombo());
    }
    
    private void llenarTablaFuncionarios(){
        FuncionarioDao funcionarioDao = new FuncionarioDaoImpl();
        funcionarioCtrl= new FuncionarioControlller(funcionarioDao);
        jTFuncionarios.setModel(funcionarioCtrl.llenarTabla());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCBTipoID = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTFNumDocumento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JCBSexo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTFTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JDCFechaNac = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jCBEstadoC = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADireccion = new javax.swing.JTextArea();
        jBGuardar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTFuncionarios = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jBActualizar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBRefrescar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 3, 14)); // NOI18N
        jLabel1.setText("GESTIÓN DE FUNCIONARIOS");

        jCBTipoID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBTipoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoIDActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(51, 0, 255));
        jLabel2.setText("Documento:");

        jTFNumDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNumDocumentoActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(51, 0, 255));
        jLabel3.setText("Nombre:");

        jLabel4.setForeground(new java.awt.Color(51, 0, 255));
        jLabel4.setText("Apellido:");

        jLabel5.setForeground(new java.awt.Color(51, 0, 255));
        jLabel5.setText("Sexo:");

        JCBSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O", "F", "M" }));

        jLabel6.setForeground(new java.awt.Color(51, 0, 255));
        jLabel6.setText("Teléfono:");

        jLabel7.setForeground(new java.awt.Color(51, 0, 255));
        jLabel7.setText("Fecha Nac.:");

        jLabel8.setForeground(new java.awt.Color(51, 0, 255));
        jLabel8.setText("Estado C.:");

        jCBEstadoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setForeground(new java.awt.Color(51, 0, 255));
        jLabel9.setText("Dirección:");

        jTADireccion.setColumns(20);
        jTADireccion.setRows(5);
        jScrollPane1.setViewportView(jTADireccion);

        jBGuardar.setBackground(new java.awt.Color(102, 255, 204));
        jBGuardar.setText("GUARDAR");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBNuevo.setBackground(new java.awt.Color(102, 255, 204));
        jBNuevo.setText("NUEVO");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jTFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTFuncionarios);

        jLabel10.setForeground(new java.awt.Color(51, 0, 255));
        jLabel10.setText("Tipo Doc:");

        jBActualizar.setBackground(new java.awt.Color(102, 255, 204));
        jBActualizar.setText("ACTUALIZAR");
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel10))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jCBTipoID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTFApellido)
                                            .addComponent(JDCFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTFNumDocumento)
                                            .addComponent(JCBSexo, 0, 150, Short.MAX_VALUE)
                                            .addComponent(jCBEstadoC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBNuevo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBActualizar)
                                        .addGap(43, 43, 43)
                                        .addComponent(jBGuardar))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(4, 4, 4)
                                                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTFTelefono))))
                                        .addComponent(jLabel9)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addGap(311, 311, 311))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBTipoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTFNumDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(JCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(JDCFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jCBEstadoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBNuevo)
                    .addComponent(jBActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jBSalir.setBackground(new java.awt.Color(255, 0, 0));
        jBSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBRefrescar.setBackground(new java.awt.Color(102, 255, 204));
        jBRefrescar.setText("REFRESCAR");
        jBRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRefrescarActionPerformed(evt);
            }
        });

        jBBorrar.setBackground(new java.awt.Color(102, 255, 204));
        jBBorrar.setText("BORRAR");
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jBEditar.setBackground(new java.awt.Color(102, 255, 204));
        jBEditar.setText("EDITAR");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jBSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 561, Short.MAX_VALUE)
                .addComponent(jBRefrescar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBEditar)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBRefrescar)
                    .addComponent(jBBorrar)
                    .addComponent(jBEditar))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBTipoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBTipoIDActionPerformed

    private void jTFNumDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNumDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNumDocumentoActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        if(Mensajes.mensajeConfirm("Salir del Sistema", "¿Seguro que te quieres salir del aplicativo?")){
            this.dispose();
        }
        
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:
        if(guardar()){
            System.out.println("Guardado correctamente");
            llenarTablaFuncionarios();
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFuncionariosMouseClicked
        // TODO add your handling code here:
        if(jTFuncionarios.getSelectedRow() != -1){
            jBBorrar.setEnabled(true);
            jBEditar.setEnabled(true);
        }
    }//GEN-LAST:event_jTFuncionariosMouseClicked

    private void jBRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRefrescarActionPerformed
        // TODO add your handling code here:
        llenarTablaFuncionarios();
    }//GEN-LAST:event_jBRefrescarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        // TODO add your handling code here:
        if(Mensajes.mensajeConfirm("Eliminar","¿Deseas eliminar este registro?")){
            eliminar();
        }
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        // TODO add your handling code here:
        jBActualizar.setEnabled(true);
        editar();
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        // TODO add your handling code here:
        nuevo();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        // TODO add your handling code here:
        actu();
        llenarTablaFuncionarios();
    }//GEN-LAST:event_jBActualizarActionPerformed
    
    private boolean actu(){
        Funcionario funcionario = new Funcionario();
        TipoIdentificacion tipoID= new TipoIdentificacion(jCBTipoID.getSelectedIndex() + 1);
        funcionario.setTipoIdentificacion(tipoID);
        funcionario.setNumeroIdentificacion(jTFNumDocumento.getText().trim());
        funcionario.setNombres(jTFNombre.getText().trim());
        funcionario.setApellidos(jTFApellido.getText().trim());
        funcionario.setSexo(JCBSexo.getSelectedItem().toString().charAt(0));
        funcionario.setTelefono(jTFTelefono.getText().trim());
        if(JDCFechaNac.getDate()!=null){
            funcionario.setFechaNacimiento(JDCFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        }else{
            funcionario.setFechaNacimiento(LocalDate.now(ZoneId.systemDefault()));
        }
        EstadoCivil estadoCivil = new EstadoCivil(jCBEstadoC.getSelectedIndex() + 1);
        funcionario.setEstadoCivil(estadoCivil);
        funcionario.setDireccion(jTADireccion.getText().trim());
        System.out.println(funcionario.getApellidos());
        int resultado=funcionarioCtrl.actualizar(funcionario);
        if(resultado > 0){
            return true;
        }
        return false;
    }
    
    private void nuevo(){
        jTFNumDocumento.setText("");
        jTFNombre.setText("");
        jTFApellido.setText("");
        jTFTelefono.setText("");
        jTADireccion.setText("");
        jCBTipoID.setSelectedIndex(0);
        String str = "01-01-1900";
        SimpleDateFormat obj = new SimpleDateFormat("dd-MM-yyyy");      
        long epoch=0;      
        try {
            epoch = obj.parse(str).getTime();
        } catch (ParseException ex) {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Creating java.util.Date object
        java.util.Date date = new java.util.Date(epoch);
        JDCFechaNac.setDate(date);
        JCBSexo.setSelectedIndex(0);
        jCBEstadoC.setSelectedIndex(0);
    }
    
    private void editar(){
        String documento=(String)jTFuncionarios.getValueAt(jTFuncionarios.getSelectedRow(), 1);
        Funcionario f=funcionarioCtrl.listarPorDocumento(documento);
        jTFNumDocumento.setText(f.getNumeroIdentificacion());
        jTFNombre.setText(f.getNombres());
        jTFApellido.setText(f.getApellidos());
        jTFTelefono.setText(f.getTelefono());
        JDCFechaNac.setDate(Date.valueOf(f.getFechaNacimiento()));
        jTADireccion.setText(f.getDireccion());
    }
    
    private void eliminar(){
        String documento=(String)jTFuncionarios.getValueAt(jTFuncionarios.getSelectedRow(), 1);
        funcionarioCtrl.borrar(documento);
        System.out.println("Eliminado!");
    }
    
    private boolean guardar(){
        Funcionario funcionario = new Funcionario();
        TipoIdentificacion tipoID= new TipoIdentificacion(jCBTipoID.getSelectedIndex() + 1);
        funcionario.setTipoIdentificacion(tipoID);
        funcionario.setNumeroIdentificacion(jTFNumDocumento.getText().trim());
        funcionario.setNombres(jTFNombre.getText().trim());
        funcionario.setApellidos(jTFApellido.getText().trim());
        funcionario.setSexo(JCBSexo.getSelectedItem().toString().charAt(0));
        funcionario.setTelefono(jTFTelefono.getText().trim());
        if(JDCFechaNac.getDate()!=null){
            funcionario.setFechaNacimiento(JDCFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        }else{
            funcionario.setFechaNacimiento(LocalDate.now(ZoneId.systemDefault()));
        }
        EstadoCivil estadoCivil = new EstadoCivil(jCBEstadoC.getSelectedIndex() + 1);
        funcionario.setEstadoCivil(estadoCivil);
        funcionario.setDireccion(jTADireccion.getText().trim());
        int resultado=funcionarioCtrl.guardar(funcionario);
        if(resultado > 0){
            return true;
        }
        return false;
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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCBSexo;
    private com.toedter.calendar.JDateChooser JDCFechaNac;
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBRefrescar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBEstadoC;
    private javax.swing.JComboBox<String> jCBTipoID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTADireccion;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFNumDocumento;
    private javax.swing.JTextField jTFTelefono;
    private javax.swing.JTable jTFuncionarios;
    // End of variables declaration//GEN-END:variables
}
