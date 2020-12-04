
package modelo.seguro;

public class SeguroArreglo {
    private Seguro seguros[];
    private int indice;

    public SeguroArreglo(int tamanho) {
        this.seguros = new Seguro[tamanho];
        this.indice = 0;
    }
    
    public boolean add(Seguro seguro){
       boolean result = false;
        if(!isLleno()){
            this.seguros[indice] = seguro;
            this.indice++;
            result = true;
        }
        return result;
    }

    private boolean isLleno() {
        boolean result = false;
        if(this.indice == this.seguros.length){
            result = true;
        }
        return result ;
    }

    @Override
    public String toString() {
        String result= "";
        for(Seguro seguro: this.seguros){
            result += seguro +"\n";
        }
        return result;
    }
    
    
}
