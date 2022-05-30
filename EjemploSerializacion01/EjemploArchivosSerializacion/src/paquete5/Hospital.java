/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    String nombre;
    int numeroCamas;
    double presupuesto;
    
    
    public Hospital(){
        
    }
    public Hospital(String n, int nu, double c){
        nombre=n;
        numeroCamas=nu;
        presupuesto=c;
        
    }
    public void establecerNombre(String c){
        nombre=c;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public void establecerNumeroCamas(int c){
        numeroCamas=c;
        
    }
    public int obtenerNumeroCamas(){
        return numeroCamas;
    }
    public void establecerPresupuesto(double c){
        presupuesto=c;
    }
    public double obtenerPresupuesto(){
        return presupuesto;
    }
     @Override
    public String toString() {
        String h= "Hospital";
        h = String.format("%s\n Nombre: %s\n Numero de Camas: %d\n Presupuesto: %.2f\n", h, obtenerNombre(),
                obtenerNumeroCamas(), obtenerPresupuesto());
        return h;
    }
}