/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laborando.Vista;

import laborando.Vista.VProfesion;

public class VPrincipal extends javax.swing.JFrame {

    public VPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ItemMenuIngCli = new javax.swing.JMenuItem();
        ItemMenuModCli = new javax.swing.JMenuItem();
        ItemMenuEliCli = new javax.swing.JMenuItem();
        ItemMenuListCli = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ItemMenuIngPro = new javax.swing.JMenuItem();
        ItemMenuModPro = new javax.swing.JMenuItem();
        ItemMenuEliPro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Laborando");

        jMenu1.setText("Cliente");

        ItemMenuIngCli.setText("Ingresar");
        ItemMenuIngCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuIngCliActionPerformed(evt);
            }
        });
        jMenu1.add(ItemMenuIngCli);

        ItemMenuModCli.setText("Modificar");
        ItemMenuModCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuModCliActionPerformed(evt);
            }
        });
        jMenu1.add(ItemMenuModCli);

        ItemMenuEliCli.setText("Eliminar");
        ItemMenuEliCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuEliCliActionPerformed(evt);
            }
        });
        jMenu1.add(ItemMenuEliCli);

        ItemMenuListCli.setText("Listar");
        ItemMenuListCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuListCliActionPerformed(evt);
            }
        });
        jMenu1.add(ItemMenuListCli);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Profesion");

        ItemMenuIngPro.setText("Ingresar");
        ItemMenuIngPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuIngProActionPerformed(evt);
            }
        });
        jMenu2.add(ItemMenuIngPro);

        ItemMenuModPro.setText("Modificar");
        ItemMenuModPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuModProActionPerformed(evt);
            }
        });
        jMenu2.add(ItemMenuModPro);

        ItemMenuEliPro.setText("Eliminar");
        ItemMenuEliPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuEliProActionPerformed(evt);
            }
        });
        jMenu2.add(ItemMenuEliPro);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemMenuIngCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuIngCliActionPerformed
        new VCliente(1).setVisible(true);
    }//GEN-LAST:event_ItemMenuIngCliActionPerformed

    private void ItemMenuModCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuModCliActionPerformed
        new VCliente(2).setVisible(true);
    }//GEN-LAST:event_ItemMenuModCliActionPerformed

    private void ItemMenuEliCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuEliCliActionPerformed
        new VCliente(3).setVisible(true);
    }//GEN-LAST:event_ItemMenuEliCliActionPerformed

    private void ItemMenuIngProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuIngProActionPerformed
        new VProfesion(1).setVisible(true);
    }//GEN-LAST:event_ItemMenuIngProActionPerformed

    private void ItemMenuModProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuModProActionPerformed
        new VProfesion(2).setVisible(true);
    }//GEN-LAST:event_ItemMenuModProActionPerformed

    private void ItemMenuEliProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuEliProActionPerformed
        new VProfesion(3).setVisible(true);
    }//GEN-LAST:event_ItemMenuEliProActionPerformed

    private void ItemMenuListCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuListCliActionPerformed
        new VListar().setVisible(true);
    }//GEN-LAST:event_ItemMenuListCliActionPerformed

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
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemMenuEliCli;
    private javax.swing.JMenuItem ItemMenuEliPro;
    private javax.swing.JMenuItem ItemMenuIngCli;
    private javax.swing.JMenuItem ItemMenuIngPro;
    private javax.swing.JMenuItem ItemMenuListCli;
    private javax.swing.JMenuItem ItemMenuModCli;
    private javax.swing.JMenuItem ItemMenuModPro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
