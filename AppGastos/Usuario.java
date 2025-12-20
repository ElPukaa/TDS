public class Usuario{

    Private String nombreUsuario; 
    List<Cuentas> cuentas;
    List<Notificacion> notificaciones;
    

    public Usuario(String nombre) {
        this.nombreUsuario = nombre;
    }

    public Usuario(String nombre, List<Cuentas> cuentas, List<Notificacion> notificaciones){
        this.nombreUsuario = nombre;
        this.cuentas = cuentas;
        this.notificaciones = notificaciones;
    }

    //getters
    public String getNombreUsuario(){
        return nombreUsuario;
    }

    public void verDashboard(){
        //implementar

    }
    

    
    
}