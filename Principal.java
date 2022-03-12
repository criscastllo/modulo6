/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import helpers.Doctor;
import helpers.Deportista;
/**
 *
 * @author Cristian Castillo
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

Deportista de = new Deportista();
Doctor doc = new Doctor();


System.out.println("Nombres de personajes, Oficios y profesiones \t \n");
System.out.println(de.getPersona());
System.out.println(de.getDeportista());
System.out.println("");
System.out.println(doc.getPersona());
System.out.println(doc.getDeportista());

    }
}
