package JFrames;

import Classes.Receta;
import java.sql.*;
import ConexionesBD.ConexionMYSQLServer;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;

public class Recetas extends javax.swing.JFrame {

    //conexion
    ConexionMYSQLServer cc = new ConexionMYSQLServer();
    Connection con = cc.conectar();
     
    ResultSet rs = null;
    Statement st = null;
    
    
    ArrayList<Receta> recetasArrayObjetos= new ArrayList();
    
    
    DefaultTableModel modelo = new DefaultTableModel() { //sobrescribo el metodo isCellEditable para que no se pueda editar la tabla.
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    
    
    //CONSTRUCTOR
    public Recetas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnCrearReceta = new javax.swing.JButton();
        BtnAtrasR = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableRecetas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recetas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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
        JTableRecetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableRecetasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableRecetas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnAtrasR, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCrearReceta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnAtrasR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCrearReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAtrasRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasRActionPerformed
               
        Inicio abrir = new Inicio();
        abrir.setVisible(true); //abro la nueva ventana
        this.dispose(); //cierro la ventana actual
        
    }//GEN-LAST:event_BtnAtrasRActionPerformed

    private void BtnCrearRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearRecetaActionPerformed
     
        RecetaNueva abrir = new RecetaNueva();
        abrir.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BtnCrearRecetaActionPerformed

    private void JTableRecetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableRecetasMouseClicked
        
        //al hacer doble click:
        if (evt.getClickCount() == 2) {
            //JOptionPane.showMessageDialog(rootPane, "Has dado click en la receta: " + JTableRecetas.getSelectedRow());
            
            //recoger el valor del id, es el 1r numero:
            int id, row;
            Receta r = new Receta();

            row = JTableRecetas.getSelectedRow();
            Object f = JTableRecetas.getValueAt(row, 0);
            String d = f.toString();
            id = Integer.parseInt(d);

            
            //busco el objeto seleccionado segun el id
            for (int x = 0; x < recetasArrayObjetos.size(); x++) {
                if (id == recetasArrayObjetos.get(x).getId()) {
                    r = recetasArrayObjetos.get(x);
                }
            }

            //añado el objeto r al paquete que envio a la pantalla "RecetaVer".
            RecetaVer abrir = new RecetaVer();
            abrir.id = r.getId();
            abrir.nombre = r.getNombre();
            abrir.tipo = r.getTipo();
            abrir.ingredientes = r.getIngredientes();
            abrir.preparacion = r.getPreparacion();
            abrir.fecha = r.getFecha();
            abrir.ultimaModificacion = r.getUltimaModificacion();
            abrir.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_JTableRecetasMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        //era para mostrar recetas pero daba errores. 
        
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       mostrarRecetas();
    }//GEN-LAST:event_formWindowOpened

    
    
    
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
                r1.setUltimaModificacion(rs.getString("ultima_modificacion"));
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
        
        //UNA VEZ LA TABLA ESTA RELLENADA, AHORA HACEMOOS QUE SE PUEDA ORDENAR X COLUMNA:
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(modelo);
        JTableRecetas.setRowSorter(sorter);
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtrasR;
    private javax.swing.JButton BtnCrearReceta;
    private javax.swing.JTable JTableRecetas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
