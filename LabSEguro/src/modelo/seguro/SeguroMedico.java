
package modelo.seguro;


public class SeguroMedico  extends Seguro{
    private int edad;

    public SeguroMedico(String nombre, double comision, int edad, double prima) {
        super(nombre, comision);
        this.edad = edad;
        this.prima =prima;
        calcularPrima();
        calcularCobertura();
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public void calcularPrima() {
        if(this.edad >= 60){
            this.prima = 3*this.prima;
        }else {
            if(this.edad >=40){
                this.prima = 2*this.prima;
            }
        }
    }

    @Override
    public void calcularCobertura() {
        int prima = (int)this.prima;
        if(this.edad >= 60){
            prima = prima/3;
        }else {
            if(this.edad >=40){
                prima = prima/2;
            }
        }
        switch(prima){
            case 20  :  this.cobertura =  5000;break;
            case 40  :  this.cobertura = 10000;break;
            case 60  :  this.cobertura = 20000;break;
            case 80  :  this.cobertura = 40000;break;
            case 100 :  this.cobertura = 80000;break;
        }
        
    }

    @Override
    public String toString() {
        return  "#Poliza: "+getNumero() +
                "Prima: "+ this.prima +
                "Cobertura: "+this.cobertura +
                "edad: " + edad ;
    }
    
    
}
