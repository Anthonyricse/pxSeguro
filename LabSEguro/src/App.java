import general.Sistema;
import controlador.ControladorInicio;
import modelo.Pais;
import modelo.Region;
import modelo.Usuario;
import modelo.seguro.Seguro;
import modelo.seguro.SeguroMedico;
import modelo.seguro.SeguroVivienda;
import utils.Email;
import vista.frmIniciar;

public class App {
    
    public static void main(String[] args){
        
        Sistema.usuarios.add( new Usuario("jzavaleta", "secreto", "jzavaletac@unmsm.edu.pe"));
        Sistema.usuarios.add( new Usuario("jperez", "123456","algo2.20202@gmail.com"));
        Sistema.usuarios.add( new Usuario("abartra", "secreto","algo2.20202@gmail.com"));
        Sistema.usuarios.add( new Usuario("fisi", "secreto","algo2.20202@gmail.com"));
        
        
        Sistema.regiones.add( new Region("AMERICA DEL SUR", "AM-SUR"));
        Sistema.regiones.add( new Region("AMERICA DEL NORTE", "AM-NOR"));
        Sistema.regiones.add( new Region("EUROPA", "EU"));
        Sistema.regiones.add( new Region("ASIA", "AS"));
        
        Sistema.seguros.add( new SeguroMedico("Juan Perez", 0.15, 30, 20));
        Sistema.seguros.add( new SeguroVivienda("Calle de la Palmera 541", 
                                        200000, 100, "Jose Diaz", 0.15));
        
        Sistema.seguros.add( new SeguroMedico("Carlos Flores", 0.15, 55, 40));
        Sistema.seguros.add( new SeguroVivienda("Calle de la Paz 111", 
                                        100000, 50, "Maria Cardenas", 0.15));
        
        Sistema.seguros.add( new SeguroMedico("Jorge Zavaleta", 0.15, 65, 80));
        System.out.println("Seguros Registrados:\n"+ Sistema.seguros);
        //Sistema.seguros.add( new Seguro("Juan Perez", 0.15));
        
        
        
        
        frmIniciar fInicio = new frmIniciar();
        ControladorInicio controlador = new ControladorInicio(Sistema.usuarios, fInicio);
        controlador.iniciar();
        
    }  
}
