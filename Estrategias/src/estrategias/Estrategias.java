/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrategias;

import static estrategias.MonitorJobs.conn;
import static estrategias.MonitorJobs.estrategias;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alonso
 */
public class Estrategias extends javax.swing.JFrame {

    /**
     * Creates new form Estrategias
     */
    
    static Connection conn = null;
    static Statement sta = null;
    static ResultSet res = null;
    static DefaultTableModel servidores = new DefaultTableModel();
    static DefaultTableModel estrategias = new DefaultTableModel();
    static int selectedRow;
    
    public Estrategias() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(44,112,213));
        
        this.TableServidores.setModel(servidores);
        servidores.addColumn("Nombre Servidor");
        servidores.addColumn("Nombre Base");
        servidores.addColumn("Nombre Usuario");
        servidores.addColumn("Contrasena");
        servidores.addColumn("IP");
        servidores.addColumn("Puerto");
        getServidores();
        
        /*this.TableEstrategias.setModel(estrategias);
        estrategias.addColumn("Nombre");
        estrategias.addColumn("Tipo");
        estrategias.addColumn("Modo");
        estrategias.addColumn("Metodo");
        estrategias.addColumn("Objetos");
        estrategias.addColumn("Periodo");
        getEstrategias();*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableServidores = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableEstrategias = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Politicas y Estrategias");
        setBackground(java.awt.SystemColor.activeCaption);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Politicas y Estrategias de Respaldo");

        TableServidores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre de Servidor", "Nombre de Usuario", "Nombre de Base", "IP"
            }
        ));
        TableServidores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableServidoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableServidores);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Servidores");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estrategias");

        jButton1.setText("Agregar Servidor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TableEstrategias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Tipo", "Modo", "Metodo", "Objetos", "Periodo"
            }
        ));
        jScrollPane3.setViewportView(TableEstrategias);

        jButton2.setText("Agregar Estrategia");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setLabel("Actualizar Estrategia");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrategias/refresh.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setText("Eliminar Estrategia");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("Actualizar Servidor");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Eliminar Servidor");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Logs");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 525, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton6))
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Registro re = new Registro();
        re.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        selectedRow = TableServidores.getSelectedRow();
        Servidor se = new Servidor(servidores.getValueAt(selectedRow, 0).toString(),
                servidores.getValueAt(selectedRow, 1).toString(),
                servidores.getValueAt(selectedRow, 2).toString(),
                servidores.getValueAt(selectedRow, 3).toString(),
                servidores.getValueAt(selectedRow, 4).toString(), 
                3000);
        
        Diseno di = new Diseno(se);
        di.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            selectedRow = TableEstrategias.getSelectedRow();
            String nombre_periodo = estrategias.getValueAt(selectedRow, 5).toString();
            // Conexion con base y lanza sql
            conn = Dao.Enlace(conn);
            res = Dao.getPeriodo(res, nombre_periodo);
            // Obtiene la cantidad de columnas
            ResultSetMetaData Res_md = res.getMetaData();
            int cantidad_columnas = Res_md.getColumnCount();
            // Agrega las columnas necesarias
            // Ingresa a la tabla las filas 
            Periodos pe = null;
            while (res.next()) {
                pe = new Periodos(res.getObject(1).toString(),
                        res.getObject(2).toString() == "0" ? false : true,
                        res.getObject(3).toString() == "0" ? false : true,
                        res.getObject(4).toString() == "0" ? false : true,
                        res.getObject(5).toString() == "0" ? false : true,
                        res.getObject(6).toString() == "0" ? false : true,
                        res.getObject(7).toString() == "0" ? false : true,
                        res.getObject(8).toString() == "0" ? false : true,
                        ((BigDecimal) res.getObject(9)).intValue(),
                        ((BigDecimal) res.getObject(10)).intValue(),
                        ((BigDecimal) res.getObject(11)).intValue()
                );
            }
            res.close();
            conn.close();

            Periodo pd = new Periodo(pe);
            pd.setVisible(true);
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        eliminar();
        getServidores();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void TableServidoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableServidoresMouseClicked
        /*Hay que mostrar en la tabla estrategias la estrategia del servidor que la selecciono*/
        
        eliminarEstrategias();
        
        selectedRow = TableServidores.getSelectedRow();
        Servidor se = new Servidor(servidores.getValueAt(selectedRow, 0).toString(),
                servidores.getValueAt(selectedRow, 1).toString(),
                servidores.getValueAt(selectedRow, 2).toString(),
                servidores.getValueAt(selectedRow, 3).toString(),
                servidores.getValueAt(selectedRow, 4).toString(), 
                3000);
        try {
            // Conexion con base y lanza sql
            conn = Dao.Enlace(conn);
            res = Dao.getEstrategiasServidor(res, se.nombre_servidor);
            // Obtiene la cantidad de columnas
            ResultSetMetaData Res_md = res.getMetaData();
            int cantidad_columnas = Res_md.getColumnCount();
            // Agrega las columnas necesarias
            // Ingresa a la tabla las filas 
            while (res.next()) {
                Object[] fila = new Object[cantidad_columnas];
                for (int i = 0; i < cantidad_columnas; i++) {
                        fila[i] = res.getObject(i+1); // Ingresa valor desde SQL
                }
                estrategias.addRow(fila); // Ingresa la fila al table model
            }
            res.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_TableServidoresMouseClicked
    //Eliminar Estrategia.
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            selectedRow = TableEstrategias.getSelectedRow();
            String nombre_estrategia = estrategias.getValueAt(selectedRow, 0).toString();
            // Conexion con base y lanza sql
            conn = Dao.Enlace(conn);
            Dao.elimnarEstrategia(nombre_estrategia);
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed
    //Eliminar Servidor :D
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
           try {
            selectedRow = TableServidores.getSelectedRow();
            String nombre_servidor = servidores.getValueAt(selectedRow, 0).toString();
            // Conexion con base y lanza sql
            conn = Dao.Enlace(conn);
            Dao.eliminarServidor(nombre_servidor);
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(Estrategias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estrategias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estrategias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estrategias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estrategias().setVisible(true);
            }
        });
    }
    
    public void eliminar(){
        servidores = (DefaultTableModel) TableServidores.getModel();
        int a = TableServidores.getRowCount()-1;
            for (int i = a; i >= 0; i--) {           
                servidores.removeRow(servidores.getRowCount()-1);
            }
        estrategias = (DefaultTableModel) TableEstrategias.getModel();
        int b = TableEstrategias.getRowCount()-1;
            for (int i = b; i >= 0; i--) {           
                estrategias.removeRow(estrategias.getRowCount()-1);
            }
    }
    
    public void eliminarEstrategias(){
        estrategias = (DefaultTableModel) TableEstrategias.getModel();
        int a = TableEstrategias.getRowCount()-1;
            for (int i = a; i >= 0; i--) {           
                estrategias.removeRow(estrategias.getRowCount()-1);
            }
    }
    
    
    // Carga los servidores en table
    public static void getServidores() {
      try {
            // Conexion con base y lanza sql
            conn = Dao.Enlace(conn);
            res = Dao.getServidores(res);
            // Obtiene la cantidad de columnas
            ResultSetMetaData Res_md = res.getMetaData();
            int cantidad_columnas = Res_md.getColumnCount();
            // Agrega las columnas necesarias
            // Ingresa a la tabla las filas 
            while (res.next()) {
                Object[] fila = new Object[cantidad_columnas];
                for (int i = 0; i < cantidad_columnas; i++) {
                        fila[i] = res.getObject(i+1); // Ingresa valor desde SQL
                }
                servidores.addRow(fila); // Ingresa la fila al table model
            }
            res.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Carga los estrategias en table
    public static void getEstrategias() {
      try {
            // Conexion con base y lanza sql
            conn = Dao.Enlace(conn);
            res = Dao.getEstrategias(res);
            // Obtiene la cantidad de columnas
            ResultSetMetaData Res_md = res.getMetaData();
            int cantidad_columnas = Res_md.getColumnCount();
            // Agrega las columnas necesarias
            // Ingresa a la tabla las filas 
            while (res.next()) {
                Object[] fila = new Object[cantidad_columnas];
                for (int i = 0; i < cantidad_columnas; i++) {
                        fila[i] = res.getObject(i+1); // Ingresa valor desde SQL
                }
                estrategias.addRow(fila); // Ingresa la fila al table model
            }
            res.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void getEstrategias(String nombre_servidor) {
        try {
            // Conexion con base y lanza sql
            conn = Dao.Enlace(conn);
            res = Dao.getEstrategiasServidor(res, nombre_servidor);
            // Obtiene la cantidad de columnas
            ResultSetMetaData Res_md = res.getMetaData();
            int cantidad_columnas = Res_md.getColumnCount();
            // Agrega las columnas necesarias
            // Ingresa a la tabla las filas 
            while (res.next()) {
                Object[] fila = new Object[cantidad_columnas];
                for (int i = 0; i < cantidad_columnas; i++) {
                        fila[i] = res.getObject(i+1); // Ingresa valor desde SQL
                }
                estrategias.addRow(fila); // Ingresa la fila al table model
            }
            res.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableEstrategias;
    private javax.swing.JTable TableServidores;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
