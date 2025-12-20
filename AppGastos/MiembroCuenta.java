
public class MiembroCuenta {

    private String alias; //
    private Double saldo; //este será el saldo acumulado sea positivo o negativo 
    private double porcentajeParticipacion; 

    MiembroCuenta(String alias, Double saldo, double porcentajeParticipacion) {
        this.alias = alias;
        this.saldo = saldo;
        this.porcentajeParticipacion = porcentajeParticipacion;
    }

    //Getters
    public String getAlias() {
        return alias;
    }
    public Double getSaldo() {
        return saldo;
    }
    public double getPorcentajeParticipacion() {
        return porcentajeParticipacion;
    }
    
    public double setPorcentajeParticipacion(Double n) {
        
        if(n >= 0.0 && n <= 100.0){
            this.porcentajeParticipacion = n;
        }else {
            System.out.println("Porcentaje no valido");
        }
    }


    //metodos 

    incrementarSaldo(Double cantidad) {
        this.saldo += cantidad;
    }

    decrementarSaldo(Double cantidad) {
        this.saldo -= cantidad;
    }



}