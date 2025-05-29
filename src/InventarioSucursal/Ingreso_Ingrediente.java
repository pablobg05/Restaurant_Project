
package InventarioSucursal;

import ASDFASDF.InvSuc_Controller;
import java.sql.SQLException;


public class Ingreso_Ingrediente extends javax.swing.JInternalFrame {
    
    private final InvSuc_Controller controller = new InvSuc_Controller();

    public Ingreso_Ingrediente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtIdSucursal = new javax.swing.JTextField();
        Message = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(227, 219, 192));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setText("Ingreso de Ingredientes Nuevos");

        txtIdProducto.setBackground(new java.awt.Color(241, 235, 196));
        txtIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductoActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(74, 59, 22));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("ID de Sucursal:");

        txtIdSucursal.setBackground(new java.awt.Color(241, 235, 196));
        txtIdSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdSucursalActionPerformed(evt);
            }
        });

        Message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Message.setText("...");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("ID de Producto:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(btnAgregar)))
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 138, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(97, 97, 97)
                            .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 138, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18)
                    .addComponent(txtIdSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(btnAgregar)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 51, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(184, 184, 184)
                    .addComponent(Message)
                    .addGap(0, 51, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProductoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            int producto = Integer.parseInt(txtIdProducto.getText());
            int sucursal = Integer.parseInt(txtIdSucursal.getText());
            controller.setInventario(producto, sucursal);
            Message.setText("Ingresado exitosamente");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtIdSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSucursalActionPerformed

    
    private void limpiar(){
        txtIdProducto.setText(" ");
        txtIdSucursal.setText(" ");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Message;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIdSucursal;
    // End of variables declaration//GEN-END:variables
}
