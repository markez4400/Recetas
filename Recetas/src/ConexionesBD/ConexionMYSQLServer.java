package ConexionesBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class ConexionMYSQLServer {
    
    public static final String BD = "recetas_menus";//base de datos a la que accedera el programa
    public static final String USER = "root";
    public static final String CLAVE = "1234"; //nuevo pass mysql server
    public static final String URL = "jdbc:mysql://localhost:3306/" + BD; //localizacion de la base de datos
    
    
    public static Connection conectar()  //probar que no sea de tipo void i sea de tipo Connection
    {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);

           
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        
        return con;
    }
    
    public static void borrarReceta(String SQL, Connection con) {
        int resultado = 0; 
        try {

                Statement st = con.createStatement();
                int rs = st.executeUpdate(SQL);

                if (rs == 1) {
                    resultado = 1;
                    if (resultado == 1) {
                        JOptionPane.showMessageDialog(null, "Se ha borrado la receta.");
                        //AQUI YA ESTA REGISTRADO, SI QUIERO PONER QUE VUELVA DIRECTAMENTE HA DE SER AQUI!!!
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha podido borrar la receta.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
            }
    }
    
    
    public static void crearReceta(String SQL, Connection con) {
        int resultado = 0; 
        try {

                Statement st = con.createStatement();
                int rs = st.executeUpdate(SQL);

                if (rs == 1) {
                    resultado = 1;
                    if (resultado == 1) {
                        JOptionPane.showMessageDialog(null, "Receta creada.");
                        //AQUI YA ESTA REGISTRADO, SI QUIERO PONER QUE VUELVA DIRECTAMENTE HA DE SER AQUI!!!
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha podido crear la receta.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
            }
    }
    
    
    public static boolean actualizarReceta(String SQL, Connection con) {
        boolean correcto = false;
        int resultado = 0; 
        try {

                Statement st = con.createStatement();
                int rs = st.executeUpdate(SQL);

                if (rs == 1) {
                    resultado = 1;
                    if (resultado == 1) {
                        JOptionPane.showMessageDialog(null, "Se ha actualizado la receta.");
                        correcto = true;
                        //AQUI YA ESTA REGISTRADO, SI QUIERO PONER QUE VUELVA DIRECTAMENTE HA DE SER AQUI!!!
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha podido actualizar la receta.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
            }
        return correcto;
    }
    
    
}