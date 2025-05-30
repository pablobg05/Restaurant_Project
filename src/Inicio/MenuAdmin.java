
package Inicio;

import InventarioSucursal.*;
import Inventario.*;
import Sucursal.*;
import Empleado.*;
import Factura.FacturacionView;
import Venta.Venta_View;
import javax.swing.JFrame;


public class MenuAdmin extends javax.swing.JFrame {
    private int sucursalId;
 
    public MenuAdmin(int idSucursal) {
        this.sucursalId = idSucursal;
        initComponents();
        System.out.println("id: "+ sucursalId);
    }

    public MenuAdmin() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
<<<<<<< HEAD
        jLabel6 = new javax.swing.JLabel();
=======
        jLabel8 = new javax.swing.JLabel();
>>>>>>> 7e13c620d3242d5d1dd3da7cee37f8e4ac420cb9

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(227, 219, 192));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 270, 80));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 40)); // NOI18N
        jLabel3.setText("Cerrar Sesión");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 240, -1));

        jPanel2.setBackground(new java.awt.Color(212, 202, 180));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 60)); // NOI18N
        jLabel2.setText("Selecciona tu Opción");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 40)); // NOI18N
        jLabel4.setText("Empleados");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 214, -1));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 40)); // NOI18N
        jLabel5.setText("Sucursales");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 214, -1));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 40)); // NOI18N
        jLabel7.setText("Inventario general");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 350, -1));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 40)); // NOI18N
        jLabel6.setText("Inventario sucursal");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
<<<<<<< HEAD
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 370, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 400));
=======
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 350, -1));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 40)); // NOI18N
        jLabel7.setText("Inventario general ");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 340, -1));

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 40)); // NOI18N
        jLabel8.setText("Facturar");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 390));
>>>>>>> 7e13c620d3242d5d1dd3da7cee37f8e4ac420cb9

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Login login = new Login();
        login.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        MenuEmpleado select = new MenuEmpleado();
        select.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        select.setVisible(true);

        select.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        MenuSucursal select = new MenuSucursal();
        select.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        select.setVisible(true);

        select.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel5MouseClicked

<<<<<<< HEAD
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Menu_Inventario select = new Menu_Inventario();
=======
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        InvSuc_Menu select = new InvSuc_Menu();
>>>>>>> 7e13c620d3242d5d1dd3da7cee37f8e4ac420cb9
        select.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        select.setVisible(true);

        select.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel7MouseClicked

<<<<<<< HEAD
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        InvSuc_Menu select = new InvSuc_Menu();
=======
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Menu_Inventario select = new Menu_Inventario();
>>>>>>> 7e13c620d3242d5d1dd3da7cee37f8e4ac420cb9
        select.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        select.setVisible(true);

        select.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        FacturacionView select = new FacturacionView();
        select.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        select.setVisible(true);

        select.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel8MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new MenuAdmin().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
