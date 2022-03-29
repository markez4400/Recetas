package JFrames;

import Classes.Receta;
import JFrames.MenuNuevo;
import JFrames.Recetas;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import ConexionesBD.ConexionMYSQLServer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class RecetaNueva extends javax.swing.JFrame {

    //conexion
    ConexionMYSQLServer cc = new ConexionMYSQLServer();
    Connection con = cc.conectar();

    ResultSet rs = null;
    Statement st = null;

    public RecetaNueva() {
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

        BtnAtrasRN = new javax.swing.JButton();
        BtnCrearRecetaRN = new javax.swing.JButton();
        LblNombreRN = new javax.swing.JLabel();
        TxtFieldNombreRN = new javax.swing.JTextField();
        LblIngredientesRN = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaPreparacionRN = new javax.swing.JTextArea();
        LblTipoRN = new javax.swing.JLabel();
        LblPreparacionRN = new javax.swing.JLabel();
        ComboBoxTipoRN = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtAreaIngredientesRN1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nueva receta");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        BtnAtrasRN.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        BtnAtrasRN.setText("Atrás");
        BtnAtrasRN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasRNActionPerformed(evt);
            }
        });

        BtnCrearRecetaRN.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        BtnCrearRecetaRN.setText("Crear receta");
        BtnCrearRecetaRN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearRecetaRNActionPerformed(evt);
            }
        });

        LblNombreRN.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        LblNombreRN.setText("Nombre: *");

        TxtFieldNombreRN.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        LblIngredientesRN.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        LblIngredientesRN.setText("Ingredientes: *");

        TxtAreaPreparacionRN.setColumns(20);
        TxtAreaPreparacionRN.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        TxtAreaPreparacionRN.setLineWrap(true);
        TxtAreaPreparacionRN.setRows(5);
        jScrollPane1.setViewportView(TxtAreaPreparacionRN);

        LblTipoRN.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        LblTipoRN.setText("Tipo de receta: *");

        LblPreparacionRN.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        LblPreparacionRN.setText("Preparación: *");

        ComboBoxTipoRN.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        ComboBoxTipoRN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrante", "Primero", "Segundo", "Plato Combinado", "Postre" }));
        ComboBoxTipoRN.setSelectedIndex(-1);

        TxtAreaIngredientesRN1.setColumns(20);
        TxtAreaIngredientesRN1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        TxtAreaIngredientesRN1.setLineWrap(true);
        TxtAreaIngredientesRN1.setRows(5);
        jScrollPane3.setViewportView(TxtAreaIngredientesRN1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblIngredientesRN)
                    .addComponent(LblTipoRN)
                    .addComponent(LblNombreRN)
                    .addComponent(LblPreparacionRN)
                    .addComponent(BtnAtrasRN, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnCrearRecetaRN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtFieldNombreRN)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboBoxTipoRN, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 288, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNombreRN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtFieldNombreRN))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTipoRN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComboBoxTipoRN))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblIngredientesRN)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPreparacionRN))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCrearRecetaRN, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAtrasRN, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static String fechaActualString() { //recoge la fecha actual
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
        String strDate = dateFormat.format(date);

        return strDate;
    }

    public static Date fechaActualDate() {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
        String strDate = dateFormat.format(date);

        java.sql.Date date2 = new java.sql.Date(date.getTime());

        return date2;
    }


    private void BtnCrearRecetaRNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearRecetaRNActionPerformed

        //declaro variables y recogo valores 
        String nombre = TxtFieldNombreRN.getText().replace("'", "''"); // PARA QUE ACEPTE APOSTROFES /cambio 1 x 2 ' para que se agrege bien a BD
        String tipo = ComboBoxTipoRN.getItemAt(ComboBoxTipoRN.getSelectedIndex());
        String ingredientes = TxtAreaPreparacionRN.getText().replace("'", "''");;
        String preparacion = TxtAreaPreparacionRN.getText().replace("'", "''");;
        Date fecha = fechaActualDate();
        Date ultimaModificacion = fechaActualDate();

        //2. Restricciones
        if (comprovarVariables(nombre, tipo, ingredientes, preparacion)) {
            String SQL = "INSERT INTO recetas (nombre, tipo, ingredientes, preparacion, fecha, ultima_modificacion)"
                    + "VALUES('" + nombre + "','" + tipo + "','" + ingredientes + "',"
                    + "'" + preparacion + "','" + fecha + "', '" + ultimaModificacion + "')";

            //3. agrego SQL a la base de datos
            cc.crearReceta(SQL, con);

            //vuelvo a la pantalla Recetas:
            Recetas abrir = new Recetas();
            abrir.setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_BtnCrearRecetaRNActionPerformed

    private void BtnAtrasRNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasRNActionPerformed
        Recetas abrir = new Recetas();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnAtrasRNActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        cc.rellenarComboTipos(ComboBoxTipoRN, con);
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
            java.util.logging.Logger.getLogger(RecetaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecetaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecetaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecetaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecetaNueva().setVisible(true);
            }
        });
    }

    public static boolean comprovarVariables(String nombre, String tipo, String ingredientes, String preparacion) {
        //nombre no puede estar vacio
        boolean correcto = true;

        String faltaNombre = "";
        String faltaTipo = "";
        String faltaIngredientes = "";
        String faltaPreparacion = "";

        if (nombre.equals("")) {
            faltaNombre = "- Nombre\n";
            correcto = false;
        }
        if (tipo == null || tipo.equals("")) {//para que tenga que escoger 1
            faltaTipo = "- Tipo.\n";
            correcto = false;
        }
        if (ingredientes.equals("")) {
            faltaIngredientes = "- Ingredientes\n";
            correcto = false;
        }
        if (preparacion.equals("")) {
            faltaPreparacion = "- Preparación.\n";
            correcto = false;
        }

        if (correcto == false) {
            JOptionPane.showMessageDialog(null, "Falta rellenar los siguientes campos:\n\n"
                    + faltaNombre + faltaTipo + faltaIngredientes + faltaPreparacion);
        }

        return correcto;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtrasRN;
    private javax.swing.JButton BtnCrearRecetaRN;
    private javax.swing.JComboBox<String> ComboBoxTipoRN;
    private javax.swing.JLabel LblIngredientesRN;
    private javax.swing.JLabel LblNombreRN;
    private javax.swing.JLabel LblPreparacionRN;
    private javax.swing.JLabel LblTipoRN;
    private javax.swing.JTextArea TxtAreaIngredientesRN1;
    private javax.swing.JTextArea TxtAreaPreparacionRN;
    private javax.swing.JTextField TxtFieldNombreRN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
