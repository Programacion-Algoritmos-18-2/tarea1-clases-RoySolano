/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Salas
 */
public class Estudiante {
    String nombre_apellido;
    String cedula;
    int edad;
    double altura;
    
    public void obtener_datos(String n_a, String cd, int ed, double alt){
        nombre_apellido = n_a;
        cedula = cd;
        edad = ed;
        altura = alt;
    }
    
    public void presentar_datos(){
        System.out.printf("Nombre: %s\n"
                + "Cédula de identidad: %s\n"
                + "Edad: %d\n"
                + "Altura (m): %.2f",nombre_apellido,cedula,edad,altura);
    }
}
