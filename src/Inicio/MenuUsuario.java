
package Inicio;
import SelectInventario.*;
import InventarioSucursal.*;
import SelecSucursal.*;
import Venta.Venta_View;
import javax.swing.JFrame;


public class MenuUsuario extends javax.swing.JFrame {
    private int sucursalId;
 
    public MenuUsuario(int idSucursal) {
        this.sucursalId = idSucursal;
        initComponents();
        System.out.println("id: "+ sucursalId);
    }

    public MenuUsuario() {
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
        lblinbGeneral = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblinvSucursal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(227, 219, 192));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 683, -1));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 40)); // NOI18N
        jLabel3.setText("Cerrar Sesión");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 310, -1));

        jPanel2.setBackground(new java.awt.Color(212, 202, 180));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 60)); // NOI18N
        jLabel2.setText("Selecciona tu Opción");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblinbGeneral.setFont(new java.awt.Font("Tempus Sans ITC", 1, 40)); // NOI18N
        lblinbGeneral.setText("Inventario general");
        lblinbGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblinbGeneralMouseClicked(evt);
            }
        });
        jPanel1.add(lblinbGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 370, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 683, -1));

        lblinvSucursal.setFont(new java.awt.Font("Tempus Sans ITC", 1, 40)); // NOI18N
        lblinvSucursal.setText("Inventario sucursal");
        lblinvSucursal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblinvSucursalMouseClicked(evt);
            }
        });
        jPanel1.add(lblinvSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 370, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Login login = new Login();
        login.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void lblinbGeneralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblinbGeneralMouseClicked
        Informacion_Ingredientes select = new Informacion_Ingredientes();
        select.setVisible(true);
//        select.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        select.setLocationRelativeTo(null);
    }//GEN-LAST:event_lblinbGeneralMouseClicked

    private void lblinvSucursalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblinvSucursalMouseClicked
        InvSuc_Menu select = new InvSuc_Menu();
        select.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        select.setVisible(true);

        select.setLocationRelativeTo(null);
    }//GEN-LAST:event_lblinvSucursalMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new MenuUsuario().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblinbGeneral;
    private javax.swing.JLabel lblinvSucursal;
    // End of variables declaration//GEN-END:variables
}
