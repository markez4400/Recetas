package Classes;

/**
 *
 * @author markez
 */
public class Receta {
    
    protected int       id;
    protected String    nombre;
    protected String    tipo;
    protected String    ingredientes;
    protected String    preparacion;
    protected String    fecha;
    protected int       activa;

    public Receta(int id, String nombre, String tipo, String ingredientes, String preparacion, String fecha, int activa) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
        this.fecha = fecha;
        this.activa = activa;
    }
    
    public Receta(){ //constructor vacio
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getActiva() {
        return activa;
    }

    public void setActiva(int activa) {
        this.activa = activa;
    }
    
    
    
}
