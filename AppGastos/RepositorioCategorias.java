import java.util.List;

public class RepositorioCategorias {
    
    public List<Categoria> categorias;
    private RepositorioCategorias INSTANCE;


    public RepositorioCategorias getInstance(){
         if(INSTANCE != null){
            return INSTANCE;
        }else{
            INSTANCE = new RepositorioCategorias();
            return INSTANCE;
        }
    }

    public void crearCategoria(Categoria c){
        
        Categoria cat = //o la creamos aqui o se hace una factoria
        categorias.add(cat);
    }

    public List<Categoria> getCategorias(){
        return categorias;
    }
}
