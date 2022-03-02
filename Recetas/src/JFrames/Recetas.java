package JFrames;

import Classes.Receta;
import java.sql.*;
import ConexionesBD.ConexionMYSQLServer;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Recetas extends javax.swing.JFrame {

    //conexion
    ConexionMYSQLServer cc = new ConexionMYSQLServer();
    Connection con = cc.conectar();
     
    
    
    ResultSet rs = null;
    Statement st = null;
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    DefaultListModel modelo1 = new DefaultListModel();
    ArrayList<Receta> recetasArrayObjetos= new ArrayList();
    
    
    /**
     * Creates new form Recetas
     */
    public Recetas() {
        initComponents();
        //ListaRecetas.setModel(modelo); //asigno el modelo al JList 
        mostrarRecetas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnCrearReceta = new javax.swing.JButton();
        BtnAtrasR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableRecetas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recetas");

        BtnCrearReceta.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        BtnCrearReceta.setText("Crear nueva receta");
        BtnCrearReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearRecetaActionPerformed(evt);
            }
        });

        BtnAtrasR.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        BtnAtrasR.setText("Atrás");
        BtnAtrasR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasRActionPerformed(evt);
            }
        });

        JTableRecetas.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        JTableRecetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "Entrante", "Patatas Fritas", "03/02/2021"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Tipo", "Nombre", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableRecetas.setToolTipText("");
        JTableRecetas.setRowHeight(32);
        jScrollPane1.setViewportView(JTableRecetas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnAtrasR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnCrearReceta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAtrasR, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(BtnCrearReceta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAtrasRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasRActionPerformed
               
        Inicio abrir = new Inicio();
        abrir.setVisible(true); //abro la nueva ventana
        this.setVisible(false); //cierro la ventana actual
        
    }//GEN-LAST:event_BtnAtrasRActionPerformed

    private void BtnCrearRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearRecetaActionPerformed
     
        RecetaNueva abrir = new RecetaNueva();
        abrir.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BtnCrearRecetaActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(Recetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recetas().setVisible(true);
            }
        });
    }
    
    public void mostrarRecetas()
    {        
        JTableRecetas.setModel(modelo);
        //arraylist necesario + objeto declarados arriba del todo  
        
        //codigo SQL que ejecutara el query:
        String SQL = "SELECT * FROM recetas";
        
        try{
            //recoger recetas en arraylist
            st = con.createStatement();
            rs = st.executeQuery(SQL);
            
        //recojo los valores del result set i los guardo en el arrayObjetos.
        
            boolean r = rs.next(); //indica si existe una siguiente linea
            while(r) {
                Receta r1 = new Receta(); //como creo el objeto aqui, se borra cada vez que se recreea
                //se recogen los valores de la BD a 1 objeto
                r1.setId(rs.getInt("id"));
                r1.setNombre(rs.getString("nombre"));
                r1.setTipo(rs.getString("tipo"));
                r1.setIngredientes(rs.getString("ingredientes"));
                r1.setPreparacion(rs.getString("preparacion"));
                r1.setFecha(rs.getString("fecha"));
                r1.setActiva(rs.getInt("activa"));
                
                //ahora almacenamos el objeto en el arraylist:               
                recetasArrayObjetos.add(r1);
                
                r = rs.next(); //paso a la siguiente receta
            }
            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error al recoger valores de la Base de Datos.");
        }
        
        //Añado los elementos del array de objetos al modelo de la tabla:
        
        modelo.setColumnIdentifiers(new Object [] {"Id", "Tipo", "Nombre", "Fecha"});
        
        //mostrar cada receta en cada item del JList junto con su nombre, 
        //modelo.removeAllElements();//primero borro todo 
        for(int x = 0; x < recetasArrayObjetos.size(); x++)
        {
            modelo.addRow(new Object []{recetasArrayObjetos.get(x).getId(),recetasArrayObjetos.get(x).getTipo(), 
                recetasArrayObjetos.get(x).getNombre(), recetasArrayObjetos.get(x).getFecha()});
            
            //modelo.addElement(recetasArrayObjetos.get(x).getId() + "-|| " + recetasArrayObjetos.get(x).getNombre()
            //+ " || " + recetasArrayObjetos.get(x).getTipo() + " || " + recetasArrayObjetos.get(x).getFecha());
        }
        //recogiendolos de la posicion del arraylist
        
        
        
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtrasR;
    private javax.swing.JButton BtnCrearReceta;
    private javax.swing.JTable JTableRecetas;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
