
package paquete02;

/**
 *
 * @author villa
 */
public class CiudadHospital {
    private String ciudad;
    private String provincia;
    
    public CiudadHospital(String n,String c){
        ciudad=n;
        provincia=c;
        
    
    }
 public void establecerCiudad(String x){
     ciudad=x;
 }   
 public void establecerProvincia(String x){
     provincia=x;
 }  
 public String obtenerCiudad(){
     return ciudad;
 }
 public String obtenerProvincia(){
     return provincia;
 }
  
}