public class Categoria {
    
    private String nombre;
    private String descripcion;
    private Enum color;
    private Static String DESCRIPCION_POR_DEFECTO = "Categoria sin descripcion."

    public Categoria(String nombre, String descripcion, Enum color){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.color=color;
    }

    public Categoria(String nombre, Enum color){
        super(nombre, DESCRIPCION_POR_DEFECTO, color);
    }

}
