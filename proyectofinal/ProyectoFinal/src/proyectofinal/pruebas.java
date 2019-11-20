/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Padre> ps1=new ArrayList<Padre>();
        Alumno al=new Alumno("Jorge Eliu", "Gonzalez Fierro", "Supergonzalez360@gmail.com", 19);
       
        Padre p1=new Padre("Jesus Manuel", "Gonzalez Chinchillas", 36, al, "Padre", "Chichillas_29@gmail.com", "JorgeEliu");
        Maestro m1=new Maestro("Alberto Suan", "Yosequien Fierro", 23, ps1, "Quimica", "Profesor", "ChimichangaHot_20@gmail.com", "NachosBuey");
        Padre p2=new Padre("Jesus Manuel", "Gonzalez Chinchillas", 36, al, "Padre", "Chichillas_29@gmail.com", "JorgeEliu");
        m1.AgregarPadres(p1);
        
        
        System.out.println(al.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(m1.toString());
    }
    
}
