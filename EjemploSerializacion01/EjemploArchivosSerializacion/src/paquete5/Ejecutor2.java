/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete5;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Ejecutor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nomH = "data/hospitales.data";

        String hospital_Buscar = "Ignacio";
        Hospital hospital_Buscado;
        LecturaArchivoSe lectura = new LecturaArchivoSe(nomH);
        lectura.establecerIdentificador(hospital_Buscar);
        lectura.establecerHospitalBuscado();
        hospital_Buscado = lectura.obtenerHospitalBuscado();
        if (hospital_Buscar != null) {
            System.out.println(hospital_Buscar);
        } else {
            System.out.println("Hospital no encontrado");
        }
    }

}
