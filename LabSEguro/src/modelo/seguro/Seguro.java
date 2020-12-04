
package modelo.seguro;

public abstract class Seguro {
    private int numero;
    private String nombre;
    protected double prima;
    protected double comision;
    protected double cobertura;
    
    private static int secuencia;

    public Seguro(String nombre, double comision) {
        this.nombre = nombre;
        this.comision = comision;
        this.numero = ++secuencia;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public double getComision() {
        return comision;
    }

    public double getCobertura() {
        return cobertura;
    }
    
    public abstract void calcularPrima();
    public abstract void calcularCobertura();
    
    
}
