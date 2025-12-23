public Abstract Class Cuenta{

    private String id;
    private String nombre;
    private LocalDate fechaCreacion;
    private List<MiembroCuenta> miembros;
    private List<Gasto> gastos;

    //getters
    public String getId() {
        return this.id;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public LocalDate getFechaCreacion(){
        return this.fechaCreacion;
    }

    protected List<MiembroCuenta> getMiembrosCuenta(){
        return this.miembros;
    }

    protected List<Gasto> getGastos(){
        return this.gastos;
    }

    //metodos
    public void agregarGasto(Gasto g){
        //implementar
    }

    public void borrarGasto(Gasto g){
        //implementar
    }

    public Double calcularSaldos(){
        //implementar en cada clase
    }


}