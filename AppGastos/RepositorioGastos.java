public Class RepositorioGastos{

    private Static RepositorioGastos INSTANCE;
    private List<Gasto> Gastos;
    private List<IObserver> observadores;

    public RepositorioGastos getInstance(){
        if(INSTANCE != null){
            return INSTANCE;
        }else(
            INSTANCE = new RepositorioGastos();
            return INSTANCE;
        )
    }

    public void registrarGasto(Gasto g){
        //implementar
    }

    public void eliminarGasto(Gasto g){
        //implementar
    }

    public List<Gasto> filtrarGastos(IFiltroGasto filtro){
        //implementar
    }
    

}