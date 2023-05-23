/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author villa
 */
public class Enfermero {
    //Un efermero o enfermera tiene las siguientes características: nombre, tipo (nombramiento, contrato) y sueldo mensual.
    private String nEnfermero;
    private String tipo;
    private double sMensualEnf;
    
    public Enfermero(String n,String t,double s){
        nEnfermero=n;
        tipo=t;
        sMensualEnf=s;
    
    }
 public void establecerNombreEnfermero(String x){
     nEnfermero=x;
 }   
 public void establecerTipo(String x){
     tipo=x;
 }  
 public void establecerSalarioMensualEnf(double x){
     sMensualEnf=x;
 }
 public String obtenerNombreEnfermero(){
     return nEnfermero;
 }
 public String obtenerTipo(){
     return tipo;
 }
 public double obtenerSalarioMensualEnf(){
    return sMensualEnf;
 }  
}
