/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Jorge
 */
public class Maestro extends Usuario{
    public String NombreMaestro, ApellidoMaestro;
    public int edad;
    public ArrayList<Padre> Padres;
    public String clase;
    public int IdMaestro;

    public Maestro() {
    }

    public Maestro(String NombreMaestro, String ApellidoMaestro, int edad, ArrayList<Padre> Padres, String clase, String TipoUsuario, String Correo, String Contraseña) {
        super(TipoUsuario, Correo, Contraseña);
        this.NombreMaestro = NombreMaestro;
        this.ApellidoMaestro = ApellidoMaestro;
        this.edad = edad;
        this.Padres = Padres;
        this.clase = clase;
        this.IdMaestro = super.id;
    }

    public String getNombreMaestro() {
        return NombreMaestro;
    }

    public void setNombreMaestro(String NombreMaestro) {
        this.NombreMaestro = NombreMaestro;
    }

    public String getApellidoMaestro() {
        return ApellidoMaestro;
    }

    public void setApellidoMaestro(String ApellidoMaestro) {
        this.ApellidoMaestro = ApellidoMaestro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Padre> getPadres() {
        return Padres;
    }

    public void setPadres(ArrayList<Padre> Padres) {
        this.Padres = Padres;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getIdMaestro() {
        return IdMaestro;
    }

    public void setIdMaestro(int IdMaestro) {
        this.IdMaestro = IdMaestro;
    }

    public String getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(String TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "-Maestro- " + "NombreMaestro: " + NombreMaestro + ", ApellidoMaestro: " + ApellidoMaestro + ", edad: " + edad + ", Padres: " + Padres + ", clase: " + clase + ", IdMaestro: " + IdMaestro;
    }
    
    
     
    
    public void AgregarPadres(Padre padre){
     Padres.add(padre);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.NombreMaestro);
        hash = 37 * hash + Objects.hashCode(this.ApellidoMaestro);
        hash = 37 * hash + this.edad;
        hash = 37 * hash + Objects.hashCode(this.Padres);
        hash = 37 * hash + Objects.hashCode(this.clase);
        hash = 37 * hash + this.IdMaestro;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Maestro other = (Maestro) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (this.IdMaestro != other.IdMaestro) {
            return false;
        }
        if (!Objects.equals(this.NombreMaestro, other.NombreMaestro)) {
            return false;
        }
        if (!Objects.equals(this.ApellidoMaestro, other.ApellidoMaestro)) {
            return false;
        }
        if (!Objects.equals(this.clase, other.clase)) {
            return false;
        }
        if (!Objects.equals(this.Padres, other.Padres)) {
            return false;
        }
        return true;
    }
    
    

   

  

    
    
  
}
