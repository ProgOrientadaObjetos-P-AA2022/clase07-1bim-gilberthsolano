/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;




/**
 *
 * @author gilbertsolanosotomayor
 */
public class EscribiriArchivoSe {
     private String nombreArchivo;
    private Hospital registroHospital;
    private ObjectOutputStream salida;
    private ArrayList<Hospital> listaHospital = new ArrayList<>();
    
    public EscribiriArchivoSe(String nomArchivo) {
        nombreArchivo = nomArchivo;

        establecerListaHospitales(); // obtener los valores (objetos)
        // que tiene el archivo.
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaHospitales().size() > 0) {
                for (int i = 0; i < obtenerListaHospitales().size(); i++) {
                    establecerRegistroHospital(obtenerListaHospitales().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }  
        public void establecerNombreArchivo(String c) {
        nombreArchivo = c;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public void establecerRegistroHospital(Hospital h) {
        registroHospital = h;
    }

    public Hospital obtenerRegistroHospital() {
        return registroHospital;
    }

    public void establecerSalida() {
      
        try {
            
            salida.writeObject(registroHospital);

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void establecerListaHospitales() {
           LecturaArchivoSe l = 
                new LecturaArchivoSe(obtenerNombreArchivo());
        l.establecerHospitales();
        listaHospital = l.obtenerHospitales();

    }

    public ArrayList<Hospital> obtenerListaHospitales() {
        return listaHospital;
    }

    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");

        } // fin de catch
    }
    
    
}
