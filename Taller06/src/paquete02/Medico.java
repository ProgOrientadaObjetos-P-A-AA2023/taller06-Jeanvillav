/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author villa
 */
public class Medico {
    //Un médico se lo considera con atributos como: nombre del doctor, especialidad, sueldo mensual.
    private String nDoctor;
    private String especialidad;
    private double sMensualMed;
    
    public Medico(String n,String e,double s){
        nDoctor=n;
        especialidad=e;
        sMensualMed=s;
    
    }
 public void establecerNombreDoctor(String x){
     nDoctor=x;
 }   
 public void establecerEspecialidad(String x){
     especialidad=x;
 }  
 public void establecerSalarioMensualMed(double x){
     sMensualMed=x;
 }
 public String obtenerNombreDoctor(){
     return nDoctor;
 }
 public String obtenerEspecialidad(){
     return especialidad;
 }
 public double obtenerSalarioMensualMed(){
    return sMensualMed;
 }  
}

