public Class RepositorioGastos{

    private Static RepositorioGastos INSTANCE;
    private List<Gasto> gastos;
    private List<IObserver> observadores;

    public RepositorioGastos getInstance(){
        if(INSTANCE != null){
            return INSTANCE;
        }else{
            INSTANCE = new RepositorioGastos();
            return INSTANCE;
        }
    }

    public List<Gasto> getGastos(){
        return gastos;
    }

    public List<IObserver> getObservadores(){
        return observadores;
    }

    public void registrarGasto(Gasto g){
        gastos.add(g);
    }

    public void eliminarGasto(Gasto g){
        //implementar
    }

    public List<Gasto> filtrarGastos(IFiltroGasto filtro){
        //implementar
    }
    

}