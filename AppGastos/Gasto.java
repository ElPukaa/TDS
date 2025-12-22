
public class Gasto {

    private String id; 
    private double importe;
    private LocalDate fecha; 
    private Categoria categoria; 
    private String descripcion;
    private MiembroCuenta pagador;

    String DESCRIPCION_POR_DEFECTO = "";
    Categoria CATEGORIA_POR_DEFECTO = Categoria.OTROS;



    public Gasto(String id, double importe, MiembroCuenta pagador, LocalDate fecha, Categoria categoria, String descripcion) {
        this.id = id; 
        this.importe = importe;
        this.pagador = pagador;
        this.fecha = fecha; 
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    public Gasto(String id, double importe, MiembroCuenta pagador) {
        this.(id, importe, LocalDate.now(), pagador, CATEGORIA_POR_DEFECTO, DESCRIPCON_POR_DEFECTO);
    }

    public String getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getimporte() {
        return importe;
    }

    public LocalDate getFecha(){
        return fecha; 
    }

    public Categoria getCategoria(){
        return Categoria; 
    }

    public MiembroCuenta getPagador() {
        return pagador;
    }

    

}