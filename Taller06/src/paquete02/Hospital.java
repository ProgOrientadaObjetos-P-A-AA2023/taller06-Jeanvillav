/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author villa
 */
public class Hospital {
//nombre del hospital, ciudad del hospital, número de especialidades, conjunto de médicos, conjunto de enfermeros o enfermeras,
    //total de sueldos a cancelar por mes del personal del hospital, dirección del hospital.
private String nHospital;
private CiudadHospital cHospital;
private int nEspecialidades;
private Medico[] cMedicos;
private Enfermero[] cEnfermeros;
private double sueldoTotal;
private String direccion;

public Hospital(String n, String d, CiudadHospital c, Medico[] med, Enfermero[] cE, int ne) {
        nHospital=n;
        cHospital=c;
        nEspecialidades=ne;
        cMedicos =med;
        cEnfermeros=cE;
        
}
public void establecerNombreHospital (String n){
    nHospital=n;
}
public void establecerCiudadHospital(CiudadHospital c) {
cHospital = c;
}

public CiudadHospital obtenerCiudadHospital() {
return cHospital;
}
public void establecerMedicos(Medico[] c) {
cMedicos = c;
}

public Medico[] obtenerMedicos() {
return cMedicos;
}
public void establecerEnfermeros(Enfermero[] c) {
cEnfermeros = c;
}

public Enfermero[] obtenerEnfermeros() {
return cEnfermeros;
}

public void establecerEspecialidades(int n) {
nEspecialidades = n;
}

public void establecerConjuntoMedicos(Medico[] c) {
cMedicos = c;
}
public void calcularSueldoTotal(){
    sueldoTotal=4;
}

public void establecerDireccion(String d){
    direccion=d;
}


public String obtenerNombreHospital(){
    return nHospital;
}
public int obtenerNumeroEspecialidades(){
    return nEspecialidades;
}
public double obtenerSueldoTotal(){
    return sueldoTotal;
}
public String obtenerDireccion(){
    return direccion;
}

 public void calcularSueldos(Medico[] a, Enfermero[] b) {
        double s1=0;
        double s2=0;
        for (int i=0;i<a.length;i++) {
            s1 += a[i].obtenerSalarioMensualMed();
        }
        for (int i=0;i<b.length;i++) {
            s2 += b[i].obtenerSalarioMensualEnf();
        }
        sueldoTotal = s1+s2;
    }
    

    @Override
    public String toString(){
        /*  HOSPITAL ZARUMA
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
               
        String cadena = String.format("HOSPITAL %S\nDirección: %s\n"
                + "Ciudad: %s\nProvincia: %s\nNúmero de especialidades: %d\n",
                obtenerNombreHospital(),obtenerDireccion(),obtenerCiudadHospital().obtenerCiudad(),
                obtenerCiudadHospital().obtenerProvincia(),obtenerNumeroEspecialidades());
        
        cadena = String.format("%sListado de médicos\n",cadena);
        
        for (int i = 0; i < obtenerMedicos().length; i++) {
            cadena = String.format("%s- %s - %.2f - %s\n",
                    cadena, 
                    obtenerMedicos()[i].obtenerNombreDoctor(),
                    obtenerMedicos()[i].obtenerSalarioMensualMed(),
                    obtenerMedicos()[i].obtenerEspecialidad());
        }
        
        cadena = String.format("%s\nListado de enfermeros(as)\n",cadena);
        
        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            cadena = String.format("%s- %s - %.2f - %s\n", 
                    cadena, 
                    obtenerEnfermeros()[i].obtenerNombreEnfermero(),      
                    obtenerEnfermeros()[i].obtenerSalarioMensualEnf(),
                    obtenerEnfermeros()[i].obtenerTipo());
        }
        
        cadena = String.format("%s\nTotal de Sueldos a pagar: %.2f",
                cadena, obtenerSueldoTotal());
        return cadena;
    }
}
