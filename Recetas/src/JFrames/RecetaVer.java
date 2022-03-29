package JFrames;

import Classes.Receta;
import ConexionesBD.ConexionMYSQLServer;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author markez
 */
public class RecetaVer extends javax.swing.JFrame {

    //conexion
    ConexionMYSQLServer cc = new ConexionMYSQLServer();
    Connection con = cc.conectar();

    String nombre, tipo, ingredientes, preparacion, fecha, ultimaModificacion;
    int id;

    public RecetaVer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        LblNombreRV = new javax.swing.JLabel();
        LblTipoRecetaRV = new javax.swing.JLabel();
        LblIngredientesRV = new javax.swing.JLabel();
        LblPreparacionRV = new javax.swing.JLabel();
        LblFechaRV = new javax.swing.JLabel();
        BtnAtrasRV = new javax.swing.JButton();
        BtnEliminarRV = new javax.swing.JButton();
        BtnActualizarRV = new javax.swing.JButton();
        LblIdRV = new javax.swing.JLabel();
        LblUltimaModificacionRV = new javax.swing.JLabel();
        TFIdRV = new javax.swing.JTextField();
        TFNombreRV = new javax.swing.JTextField();
        TFTipoRV = new javax.swing.JTextField();
        TFFechaCreacionRV = new javax.swing.JTextField();
        TFUltimaModificacionRV = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAIngredientesRV = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TAPreparacionRV = new javax.swing.JTextArea();

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Nombre:");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Actualizar receta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        LblNombreRV.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        LblNombreRV.setText("Nombre:");

        LblTipoRecetaRV.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        LblTipoRecetaRV.setText("Tipo de receta:");

        LblIngredientesRV.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        LblIngredientesRV.setText("Ingredientes:");

        LblPreparacionRV.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        LblPreparacionRV.setText("Preparación:");

        LblFechaRV.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        LblFechaRV.setText("Fecha de creacion:");

        BtnAtrasRV.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        BtnAtrasRV.setText("Atrás");
        BtnAtrasRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasRVActionPerformed(evt);
            }
        });

        BtnEliminarRV.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        BtnEliminarRV.setText("Eliminar receta");
        BtnEliminarRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarRVActionPerformed(evt);
            }
        });

        BtnActualizarRV.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        BtnActualizarRV.setText("Actualizar receta");
        BtnActualizarRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarRVActionPerformed(evt);
            }
        });

        LblIdRV.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        LblIdRV.setText("Id:");

        LblUltimaModificacionRV.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        LblUltimaModificacionRV.setText("Ultima modificación:");

        TFIdRV.setEditable(false);
        TFIdRV.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        TFNombreRV.setEditable(false);
        TFNombreRV.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        TFTipoRV.setEditable(false);
        TFTipoRV.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        TFFechaCreacionRV.setEditable(false);
        TFFechaCreacionRV.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        TFUltimaModificacionRV.setEditable(false);
        TFUltimaModificacionRV.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        TAIngredientesRV.setEditable(false);
        TAIngredientesRV.setColumns(20);
        TAIngredientesRV.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        TAIngredientesRV.setLineWrap(true);
        TAIngredientesRV.setRows(5);
        jScrollPane1.setViewportView(TAIngredientesRV);

        TAPreparacionRV.setEditable(false);
        TAPreparacionRV.setColumns(20);
        TAPreparacionRV.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        TAPreparacionRV.setLineWrap(true);
        TAPreparacionRV.setRows(5);
        jScrollPane2.setViewportView(TAPreparacionRV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnAtrasRV, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblPreparacionRV)
                                    .addComponent(LblTipoRecetaRV)
                                    .addComponent(LblNombreRV)
                                    .addComponent(LblIdRV)
                                    .addComponent(LblIngredientesRV))
                                .addGap(28, 28, 28)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnEliminarRV, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnActualizarRV, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFIdRV, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFTipoRV, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFNombreRV, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LblFechaRV)
                        .addGap(18, 18, 18)
                        .addComponent(TFFechaCreacionRV, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LblUltimaModificacionRV)
                        .addGap(18, 18, 18)
                        .addComponent(TFUltimaModificacionRV, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblIdRV)
                    .addComponent(TFIdRV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNombreRV)
                    .addComponent(TFNombreRV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTipoRecetaRV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TFTipoRV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblIngredientesRV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblPreparacionRV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblUltimaModificacionRV)
                        .addComponent(TFUltimaModificacionRV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblFechaRV)
                        .addComponent(TFFechaCreacionRV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEliminarRV, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(BtnAtrasRV, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(BtnActualizarRV, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEliminarRVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarRVActionPerformed
        // TODO add your handling code here:
        
        
        if (JOptionPane.showConfirmDialog(null, "Seguro que deseas borrar la receta?", "Aviso importante!",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
        {
            //yes option
            
           //borrar receta de la bd + mostrar mensaje de que se ha borrado.
            String SQL = "DELETE FROM recetas WHERE id = '" + id + "'";
            cc.borrarReceta(SQL, con);
            
            //una vez borrada, volvemos al JFrame "recetas".
            Recetas abrir = new Recetas();
            abrir.setVisible(true);
            this.dispose();
        } else {
            // no option
        }
        
    }//GEN-LAST:event_BtnEliminarRVActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtnActualizarRVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarRVActionPerformed
        // TODO add your handling code here:
        Receta r = new Receta();
        //pasar datos a la pantalla modificar receta
        //abrir pantalla modificar receta y capturar ahi los datos enviados
        RecetaEditar abrir = new RecetaEditar();
        abrir.id = id;
        abrir.nombre = nombre;
        abrir.tipo = tipo;
        abrir.ingredientes = ingredientes;
        abrir.preparacion = preparacion;
        abrir.fecha = fecha;
        abrir.ultimaModificacion = ultimaModificacion;
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnActualizarRVActionPerformed

    private void BtnAtrasRVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasRVActionPerformed
        // TODO add your handling code here:
        Recetas abrir = new Recetas();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnAtrasRVActionPerformed


    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        TFIdRV.setText(String.valueOf(id));
        TFNombreRV.setText(nombre);
        TFTipoRV.setText(tipo);
        TAIngredientesRV.setText(ingredientes); //<htmml> para que haga automaticamente los saltos de linea (en labels, NO TxtARea)
        TAPreparacionRV.setText( preparacion);
        TFFechaCreacionRV.setText(fecha);
        TFUltimaModificacionRV.setText(ultimaModificacion);
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(RecetaVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecetaVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecetaVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecetaVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecetaVer().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizarRV;
    private javax.swing.JButton BtnAtrasRV;
    private javax.swing.JButton BtnEliminarRV;
    private javax.swing.JLabel LblFechaRV;
    private javax.swing.JLabel LblIdRV;
    private javax.swing.JLabel LblIngredientesRV;
    private javax.swing.JLabel LblNombreRV;
    private javax.swing.JLabel LblPreparacionRV;
    private javax.swing.JLabel LblTipoRecetaRV;
    private javax.swing.JLabel LblUltimaModificacionRV;
    private javax.swing.JTextArea TAIngredientesRV;
    private javax.swing.JTextArea TAPreparacionRV;
    private javax.swing.JTextField TFFechaCreacionRV;
    private javax.swing.JTextField TFIdRV;
    private javax.swing.JTextField TFNombreRV;
    private javax.swing.JTextField TFTipoRV;
    private javax.swing.JTextField TFUltimaModificacionRV;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
