/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author Jorge
 */
public class Usuario {
    public String TipoUsuario;
    public String Correo;
    public String Contraseña;
    public static int id;

    public Usuario() {
    }

    
    public Usuario(String TipoUsuario, String Correo, String Contraseña) {
        this.TipoUsuario = TipoUsuario;
        this.Correo = Correo;
        this.Contraseña = Contraseña;
        this.id++; 
    }
    
    
   
    
    
    
}
