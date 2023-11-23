/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laborando.Vista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.List;
import laborando.Modelo.Cliente;
import laborando.Controlador.CrudCliente;
import laborando.Controlador.CrudProfesion;
import laborando.Modelo.Profesion;

public class VCliente extends javax.swing.JFrame {
    CrudCliente crudcliente=new CrudCliente();
    CrudProfesion crudprofesion=new CrudProfesion();
    List <Profesion> lista_profesion=new ArrayList <>();
       
    public VCliente(int opc) {
        initComponents();
        opciones(opc);
        cargaProfesiones();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    
    private boolean validaRut(String rut){
        if(rut.length()==10 && rut.charAt(rut.length()-2) == '-'){
            String srut=rut.substring(0,8);
            int num = 0;
            char dv=rut.charAt(rut.length()-1);
            try {
                Integer.parseInt(srut); 
                if (dv!='K' && dv!='k')
                    num=Character.getNumericValue(dv);
                    if (num>=0 && num<=9)
                        return true;
                    else
                        return false;
            } catch (NumberFormatException excepcion) {
                    return false;
            }
        }
        return false;
    }
    
    private void cargaProfesiones(){
        lista_profesion=crudprofesion.obtieneProfesiones();
        if (lista_profesion!=null)
            for (Profesion tmp:lista_profesion)
                cmbProf.addItem(tmp.getDescripcion());
    }
    
    private void opciones(int opc){
        btnIngresar.setVisible(false);
        btnModificar.setVisible(false);
        btnEliminar.setVisible(false);  
        btnBuscar.setVisible(false);
        switch (opc) {
            case 1: btnIngresar.setVisible(true);
                    lblTitulo.setText("Ingreso de Cliente");
                    break;
            case 2: btnModificar.setVisible(true);
                    btnBuscar.setVisible(true);
                    lblTitulo.setText("Modificación de Cliente");   
                    break;               
            case 3: btnEliminar.setVisible(true);
                    btnBuscar.setVisible(true);
                    lblTitulo.setText("Eliminación de Cliente");
                    txtNombre.setEditable(false);
                    txtFecha.setEditable(false);
                    radSi.setEnabled(false);
                    radNo.setEnabled(false);
                    cmbProf.setEnabled(false);
                    break;              
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelIngresarDatos1 = new javax.swing.JPanel();
        lblRut = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblProfesion1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        radNo = new javax.swing.JRadioButton();
        radSi = new javax.swing.JRadioButton();
        cmbProf = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenedor Cliente");

        lblRut.setText("Rut");

        lblNombre.setText("Nombre");

        lblFecha.setText("Fecha Nacimiento");

        lblEstado.setText("CV al dia");

        lblProfesion1.setText("Profesión");

        lblTitulo.setBackground(new java.awt.Color(255, 153, 51));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 51, 255));
        lblTitulo.setText("Mantenedor Cliente");

        jLabel2.setText("(dd/mm/yyyy)");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        txtRut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRutFocusLost(evt);
            }
        });

        buttonGroup1.add(radNo);
        radNo.setText("No");

        buttonGroup1.add(radSi);
        radSi.setText("Si");
        radSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radSiActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIngresarDatos1Layout = new javax.swing.GroupLayout(panelIngresarDatos1);
        panelIngresarDatos1.setLayout(panelIngresarDatos1Layout);
        panelIngresarDatos1Layout.setHorizontalGroup(
            panelIngresarDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresarDatos1Layout.createSequentialGroup()
                .addGroup(panelIngresarDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIngresarDatos1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelIngresarDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRut)
                            .addGroup(panelIngresarDatos1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblEstado)
                                .addGap(31, 31, 31)
                                .addComponent(radSi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radNo))
                            .addGroup(panelIngresarDatos1Layout.createSequentialGroup()
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(panelIngresarDatos1Layout.createSequentialGroup()
                                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFecha)
                            .addGroup(panelIngresarDatos1Layout.createSequentialGroup()
                                .addComponent(btnIngresar)
                                .addGroup(panelIngresarDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelIngresarDatos1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnModificar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar))
                                    .addGroup(panelIngresarDatos1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                                        .addComponent(lblProfesion1)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(panelIngresarDatos1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(lblTitulo)))
                .addGap(20, 20, 20))
        );
        panelIngresarDatos1Layout.setVerticalGroup(
            panelIngresarDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresarDatos1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblRut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresarDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(lblNombre)
                .addGap(18, 18, 18)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresarDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfesion1)
                    .addComponent(jLabel2)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panelIngresarDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(radNo)
                    .addComponent(radSi))
                .addGap(34, 34, 34)
                .addGroup(panelIngresarDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panelIngresarDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelIngresarDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if (!validaRut(txtRut.getText())){ 
            JOptionPane.showMessageDialog(this,"Rut Invalido");
            txtRut.setText(null);
            return;
        }
        try {                                            
            Profesion pro=null;
            Cliente cliente;
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha;
            fecha = formato.parse(txtFecha.getText());
            for (Profesion tmp:lista_profesion)
                if (tmp.getDescripcion().equals(cmbProf.getSelectedItem()))
                    pro=new Profesion(tmp.getCod_pro(),tmp.getDescripcion());
            cliente=new Cliente(txtRut.getText(),txtNombre.getText(),fecha,radSi.isSelected(),pro);
            if (crudcliente.agregar(cliente))
                JOptionPane.showMessageDialog(this,"Cliente Ingresado Exitosamente");
            else
                JOptionPane.showMessageDialog(this,"Rut Ya Existe en la BD");
            this.dispose();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this,"Error en Ingreso de Cliente");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        Cliente cli=new Cliente();
        cli.setRut(txtRut.getText());
        if (crudcliente.eliminar(cli))
            JOptionPane.showMessageDialog(this,"Cliente Eliminado Exitosamente");
        else
            JOptionPane.showMessageDialog(this,"Rut No Existe en la BD");
        this.dispose();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {                                            
            Profesion pro=null;
            Cliente cliente;
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha;
            fecha = formato.parse(txtFecha.getText());
            for (Profesion tmp:lista_profesion)
                if (tmp.getDescripcion().equals(cmbProf.getSelectedItem()))
                    pro=new Profesion(tmp.getCod_pro(),tmp.getDescripcion());
            cliente=new Cliente(txtRut.getText(),txtNombre.getText(),fecha,radSi.isSelected(),pro);
            if (crudcliente.modificar(cliente))
                JOptionPane.showMessageDialog(this,"Cliente Modificado Exitosamente");
            else
                JOptionPane.showMessageDialog(this,"Rut No Existe en la BD");
            this.dispose();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this,"Error en Modificación de Cliente");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void radSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radSiActionPerformed
       
    }//GEN-LAST:event_radSiActionPerformed

    private void txtRutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRutFocusLost

    }//GEN-LAST:event_txtRutFocusLost

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
            Cliente cli=new Cliente();
            cli.setRut(txtRut.getText());
            String codpro=crudcliente.buscar(cli);
            if (!codpro.equals("-1")){
                txtNombre.setText(cli.getNombre());
                String fecha=new SimpleDateFormat("dd/MM/yyyy").format(cli.getFecnac());
                txtFecha.setText(fecha);
                if (cli.isCv())
                    radSi.setSelected(true);
                else
                    radNo.setSelected(true); 
                cli.setProfesion(crudprofesion.buscar(cli.getProfesion().getCod_pro()));
                cmbProf.setSelectedItem(cli.getProfesion().getDescripcion()); 
            }
            else { 
                JOptionPane.showMessageDialog(this,"Rut no Encontrado"); 
                txtRut.setText(null);
            }            
    }//GEN-LAST:event_btnBuscarActionPerformed


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
            java.util.logging.Logger.getLogger(VCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VCliente(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnModificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbProf;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblProfesion1;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelIngresarDatos1;
    private javax.swing.JRadioButton radNo;
    private javax.swing.JRadioButton radSi;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
