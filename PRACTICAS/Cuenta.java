package PRACTICAS;

public class Cuenta {
    //  Declarar atributos
    private String titular;
    private double cantidad;

    //  Declarar constructores
    public Cuenta(String titular){
        this(titular, 0);       //  Sobrecarga (predeterminado)
    }

    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        if (this.cantidad < 0){
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }

    //  Declarar e iniciar métodos
    //  método para el titular
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    //  método para la cantidad
    public double getCantidad(){
        return cantidad;
    }
    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }

    /**
     * INGRESAR
     * Método para ingresar dinero a la cuenta 
     * sólo si la cantidad es positiva
     */
    public void ingresar(double cantidad){
        if (cantidad > 0){
            this.cantidad += cantidad;
        }
    }

    /**
     * RETIRAR
     * Método para retirar dinero de la cuenta
     * sólo si el saldo de la cuenta no es igual o menor que cero
     */
    public void retirar(double cantidad){
        if (this.cantidad - cantidad < 0){
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }

    /**
     * ESTADO
     * Método que muestra el estado de la cuenta
     */
    public String toString(){
        return "El titular " + titular + " tiene " + cantidad + " pesos mexicanos (MXN) en su cuenta.";
    }
}
