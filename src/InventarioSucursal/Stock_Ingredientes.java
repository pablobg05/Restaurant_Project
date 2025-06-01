/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InventarioSucursal;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Usuario
 */
public class Stock_Ingredientes extends javax.swing.JInternalFrame {

    private final InvSuc_Controller controller = new InvSuc_Controller();
    
    public Stock_Ingredientes() {
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtId = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblIDProducto = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Units10 = new javax.swing.JButton();
        Units20 = new javax.swing.JButton();
        Units50 = new javax.swing.JButton();
        Units100 = new javax.swing.JButton();
        Units200 = new javax.swing.JButton();
        Units1000 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblStockPreeliminar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField_variable = new javax.swing.JTextField();
        Variable_BTN = new javax.swing.JButton();
        lblProducto = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "ID de Producto", "ID de Sucursal", "Stock", "Producto"
            }
        ));
        jScrollPane1.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 66, 616, 356));

        jPanel1.setBackground(new java.awt.Color(227, 219, 192));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Consulta");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Ingrese el código de ingrediente a añadir");

        txtId.setBackground(new java.awt.Color(241, 235, 196));
        jScrollPane2.setViewportView(txtId);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("ID Producto");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Id:");

        lblIDProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIDProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIDProducto.setText("...");
        lblIDProducto.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnBuscar.setBackground(new java.awt.Color(74, 59, 22));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Stock actual:");

        lblStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblStock.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblStock.setText("...");
        lblStock.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("unidades.");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Añadir en unidades:");

        Units10.setBackground(new java.awt.Color(74, 59, 22));
        Units10.setForeground(new java.awt.Color(255, 255, 255));
        Units10.setText("10 unidades");
        Units10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Units10ActionPerformed(evt);
            }
        });

        Units20.setBackground(new java.awt.Color(74, 59, 22));
        Units20.setForeground(new java.awt.Color(255, 255, 255));
        Units20.setText("20 unidades");
        Units20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Units20ActionPerformed(evt);
            }
        });

        Units50.setBackground(new java.awt.Color(74, 59, 22));
        Units50.setForeground(new java.awt.Color(255, 255, 255));
        Units50.setText("50 unidades");
        Units50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Units50ActionPerformed(evt);
            }
        });

        Units100.setBackground(new java.awt.Color(74, 59, 22));
        Units100.setForeground(new java.awt.Color(255, 255, 255));
        Units100.setText("100 unidades");
        Units100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Units100ActionPerformed(evt);
            }
        });

        Units200.setBackground(new java.awt.Color(74, 59, 22));
        Units200.setForeground(new java.awt.Color(255, 255, 255));
        Units200.setText("200 unidades");
        Units200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Units200ActionPerformed(evt);
            }
        });

        Units1000.setBackground(new java.awt.Color(74, 59, 22));
        Units1000.setForeground(new java.awt.Color(255, 255, 255));
        Units1000.setText("1000 unidades");
        Units1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Units1000ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Total:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("unidades a añadir.");

        lblStockPreeliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblStockPreeliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblStockPreeliminar.setText("...");
        lblStockPreeliminar.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Monto:");

        jTextField_variable.setBackground(new java.awt.Color(241, 235, 196));
        jTextField_variable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_variableActionPerformed(evt);
            }
        });

        Variable_BTN.setBackground(new java.awt.Color(74, 59, 22));
        Variable_BTN.setForeground(new java.awt.Color(255, 255, 255));
        Variable_BTN.setText("añadir");
        Variable_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Variable_BTNActionPerformed(evt);
            }
        });

        lblProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProducto.setText("...");
        lblProducto.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Producto:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5)
                        .addGap(21, 21, 21)
                        .addComponent(lblIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Units100)
                        .addGap(6, 6, 6)
                        .addComponent(Units200, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Units1000, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel14)
                        .addGap(6, 6, 6)
                        .addComponent(jTextField_variable, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(Variable_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12)
                        .addGap(12, 12, 12)
                        .addComponent(lblStockPreeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Units10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Units20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(Units50, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel11))
                            .addComponent(lblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 54, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lblIDProducto))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(lblStock)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProducto)
                    .addComponent(jLabel15))
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Units10)
                    .addComponent(Units20)
                    .addComponent(Units50))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Units100)
                    .addComponent(Units200)
                    .addComponent(Units1000))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jTextField_variable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Variable_BTN))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(lblStockPreeliminar)
                    .addComponent(jLabel13))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 390, 420));

        jPanel2.setBackground(new java.awt.Color(212, 202, 180));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("Stock de ingredientes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel6)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
            int id = Integer.parseInt(txtId.getText());
            InvSuc_Model prodtemp =  controller.getInventarioById(id);
            lblIDProducto.setText(String.valueOf(prodtemp.getProducto()));

            lblStock.setText(String.valueOf(prodtemp.getCantidad()));
            jTextField_variable.setText("");
            lblStockPreeliminar.setText("");
            lblProducto.setText(controller.getProductById(id));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void Units10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Units10ActionPerformed
        // TODO add your handling code here:
        lblStockPreeliminar.setText("10");
        jTextField_variable.setText("10");
    }//GEN-LAST:event_Units10ActionPerformed

    private void Units20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Units20ActionPerformed
        // TODO add your handling code here:
        lblStockPreeliminar.setText("20");
        jTextField_variable.setText("20");
    }//GEN-LAST:event_Units20ActionPerformed

    private void Units50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Units50ActionPerformed
        // TODO add your handling code here:
        lblStockPreeliminar.setText("50");
        jTextField_variable.setText("50");
    }//GEN-LAST:event_Units50ActionPerformed

    private void Units100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Units100ActionPerformed
        // TODO add your handling code here:
        lblStockPreeliminar.setText("100");
        jTextField_variable.setText("100");
    }//GEN-LAST:event_Units100ActionPerformed

    private void Units200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Units200ActionPerformed
        // TODO add your handling code here:
        lblStockPreeliminar.setText("200");
        jTextField_variable.setText("200");
    }//GEN-LAST:event_Units200ActionPerformed

    private void Units1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Units1000ActionPerformed
        // TODO add your handling code here:
        lblStockPreeliminar.setText("1,000");
        jTextField_variable.setText("1,000");
    }//GEN-LAST:event_Units1000ActionPerformed

    private void jTextField_variableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_variableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_variableActionPerformed

    private void Variable_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Variable_BTNActionPerformed
        String valorIngresado = jTextField_variable.getText();
        lblStockPreeliminar.setText(valorIngresado);

        String ID = txtId.getText().trim();
        String Subtotal = lblStockPreeliminar.getText().trim();

        if (ID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, primero seleccione un ingrediente con el ID.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jTextField_variable.setText("");
            lblStockPreeliminar.setText("");
            return;
        }

        try {
            int cantidad = Integer.parseInt(Subtotal);
            if (cantidad <= 0) {
                JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor a cero.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int id = Integer.parseInt(ID);

            // Obtener el stock actual antes de continuar
            int stockActual = controller.getStockById(id); 
            int nuevoStock = stockActual + cantidad;

            // Mensaje con la suma incluida
            String mensaje = "El stock actual es: " + stockActual + "\n"
                           + "Cantidad a añadir: " + cantidad + "\n"
                           + "Nuevo stock total será: " + nuevoStock + "\n\n"
                           + "¿Desea confirmar la actualización?";
            String[] opciones = {"Confirmar", "Cancelar"};

            int respuesta = JOptionPane.showOptionDialog(this, mensaje, "Confirmación",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (respuesta == 0) {

                boolean exito = controller.updateStock(id, cantidad);

                if (exito) {
                    JOptionPane.showMessageDialog(this, "Stock actualizado correctamente.");
                    jTextField_variable.setText("");
                    lblStockPreeliminar.setText("");
                    cargarTabla();
                } else {
                    JOptionPane.showMessageDialog(this, "Ocurrió un error al actualizar el stock.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_Variable_BTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock_Ingredientes().setVisible(true);
            }
        });
    }
    
    private void cargarTabla(){
        try {
            List<InvSuc_Model> lista = controller.getInventario();
            
            for(int filas = 0; filas < lista.size(); filas++){
                
               
                InvSuc_Model inv = lista.get(filas);
                int id = inv.getId(); 

                Tabla.setValueAt(id, filas, 0);
                Tabla.setValueAt(inv.getProducto(), filas, 1);
                Tabla.setValueAt(inv.getSucursal(), filas, 2);
                Tabla.setValueAt(inv.getCantidad(), filas, 3); 
                Tabla.setValueAt(controller.getProductById(id), filas, 4);
        

                
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton Units10;
    private javax.swing.JButton Units100;
    private javax.swing.JButton Units1000;
    private javax.swing.JButton Units20;
    private javax.swing.JButton Units200;
    private javax.swing.JButton Units50;
    private javax.swing.JButton Variable_BTN;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField_variable;
    private javax.swing.JLabel lblIDProducto;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblStockPreeliminar;
    private javax.swing.JTextPane txtId;
    // End of variables declaration//GEN-END:variables
}
