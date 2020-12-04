
package modelo.seguro;


public class SeguroVivienda extends Seguro{
    private String direccion;
    private double valor;
    private float porcentaje;

    public SeguroVivienda(String direccion, double valor, float porcentaje,
            String nombre, double comision) {
        super(nombre, comision);
        this.direccion = direccion;
        this.valor = valor;
        this.porcentaje = porcentaje;
        calcularPrima();
        calcularCobertura();
    }

    public String getDireccion() {
        return direccion;
    }

    public double getValor() {
        return valor;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    @Override
    public void calcularPrima() {
        if(this.porcentaje == 100){
            this.prima = this.valor*0.05;
        }else {
            this.prima = this.valor*(this.porcentaje *0.05)/100;
        }
    }

    @Override
    public void calcularCobertura() {
        if(this.porcentaje == 100){
            this.cobertura = this.valor;
        }else {
            this.cobertura = this.valor*this.porcentaje/100;
        }
    }

    @Override
    public String toString() {
        return  "#Poliza: "+getNumero() +
                "\t Prima: "+ this.prima +
                "\t Cobertura: "+this.cobertura +
                "\t valor: " + valor +
                "\t Porcentaje : "+this.porcentaje + 
                "\t Direccion : "+this.direccion;
    }
    
    
   
    
}
