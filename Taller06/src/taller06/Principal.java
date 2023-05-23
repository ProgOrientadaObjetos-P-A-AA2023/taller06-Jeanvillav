
package taller06;

import paquete02.CiudadHospital;
import paquete02.Enfermero;
import paquete02.Hospital;
import paquete02.Medico;
import java.util.Scanner;
/**
 *
 * @author villa
 */
public class Principal {
    public static void main(String[] args) {
        //Por cada entidad hospitalaria se necesita algunos atributos tales como: nombre del hospital, ciudad del hospital, 
        //número de especialidades, conjunto de médicos, conjunto de enfermeros o enfermeras, 
        //total de sueldos a cancelar por mes del personal del hospital, dirección del hospital.


        // listado de variables para ingreso de datos por teclado
        Scanner entrada = new Scanner(System.in);
        String nombreH,direccionH,ciudadH;
        String provinciaH;
        int numeroE,cMed,cEnf;
        
      
        

        // Ingreso de valores por teclado
/*    
HOSPITAL ZARUMA
Dirección: Barrio Central
Ciudad: Zaruma 
Provincia: El Oro
Número de especialidades: 7
Listado de médicos
- Richard Obrien - sueldo: 1000 - Pediatría
- Jacob Mcintyre - sueldo: 1100 - General
- Craig Alexander - sueldo: 1200 - Pediatría
- John Hernandez - sueldo: 1000 - Internista

Listado de enfermeros(as)
- William Bradshaw - sueldo: 800 - contrato
- Jennifer Muñoz - sueldo: 700 - contrato
- Jeffrey Bryant - sueldo: 1000 - nombramiento

Total de sueldos a pagar por mes: 13600
 */
         System.out.println("Ingrese el nombre del Hospital");
        nombreH = entrada.nextLine();
         System.out.println("Ingrese la direccion del Hospital");
        direccionH = entrada.nextLine();
        System.out.println("Ingrese la ciudad del Hospital");
        ciudadH = entrada.nextLine();
        System.out.println("Ingrese la provincia del Hospital");
        provinciaH = entrada.nextLine();
        
        CiudadHospital ciudad = new CiudadHospital (ciudadH,provinciaH);  
        
        System.out.println("Ingrese numero de especialidades del Hospital");
        numeroE = entrada.nextInt();
        System.out.println("Ingrese la cantidad de Medicos a ingresar");
        cMed = entrada.nextInt();
        System.out.println("Ingrese la cantidad de Enfermeros a ingresar");
        cEnf = entrada.nextInt();
        
        Medico[] medicos = new Medico [cMed];
        Enfermero [] enfermeros = new Enfermero [cEnf];
        
        String nombre;

        String especialidad;
        String tipo;
        double sueldoMensual;
   
        entrada.nextLine();
        
        for (int i=0; i<cMed; i++) {
            System.out.println("Ingrese el nombre del médico "+(i+1)+" :");
            nombre = entrada.next();
            

            
            System.out.println("Ingrese la especialidad:");
            especialidad = entrada.next();
            
            System.out.println("Ingrese el sueldo mensual del médico "+(i+1)+" :");
            sueldoMensual = entrada.nextDouble();
            
            medicos[i]= new Medico(nombre,especialidad,
                    sueldoMensual);
       
        }
        
        entrada.nextLine();
        
        for (int i=0; i<cEnf; i++) {
            System.out.println("Ingrese el nombre del enfermero "+(i+1)+" :");
            nombre = entrada.next();
            

            
            System.out.println("Ingrese el tipo (nombramiendo o contrato):");
            tipo = entrada.next();
            
            System.out.println("Ingrese el sueldo mensual del enfermero "+(i+1)+" :");
            sueldoMensual = entrada.nextDouble();
            
            enfermeros[i]= new Enfermero(nombre,tipo,
                    sueldoMensual);
          
        }    

  
       
        Hospital hospital = new Hospital(nombreH,direccionH,ciudad,
                medicos,enfermeros,numeroE);

        
    
        hospital.calcularSueldos(medicos, enfermeros);
        

        System.out.printf("\n%s\n", hospital);
         hospital.calcularSueldos(medicos, enfermeros);
        
    
        System.out.printf("\n%s\n", hospital);
    }
}