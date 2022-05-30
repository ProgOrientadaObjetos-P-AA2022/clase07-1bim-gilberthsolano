/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Ejecutor {

    public static void main(String[] args) {

        Hospital h1 = new Hospital("Isidro Ayora", 200, 1000000);

        String nomH = "data/hospitales.data";

        EscribiriArchivoSe e = new EscribiriArchivoSe(nomH);
        e.establecerRegistroHospital(h1);
        e.establecerSalida();

        e.cerrarArchivo();
        LecturaArchivoSe lap = new LecturaArchivoSe(nomH);
        lap.establecerHospitales();
        System.out.println(lap);
    }

}
