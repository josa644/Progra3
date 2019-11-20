/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.Objects;

/**
 *
 * @author Jorge
 */
public class Padre extends Usuario{
    public String NombrePadre, ApellidoPadre;
    public int edad;
    public Alumno alumno;
    public int Idpadre;
    public Padre() {
    }

    public Padre(String NombrePadre, String ApellidoPadre, int edad, Alumno alumno, String TipoUsuario, String Correo, String Contraseña) {
        super(TipoUsuario, Correo, Contraseña);
        this.NombrePadre = NombrePadre;
        this.ApellidoPadre = ApellidoPadre;
        this.edad = edad;
        this.alumno = alumno;
        this.Idpadre = super.id;
    }

    
    public String getNombrePadre() {
        return NombrePadre;
    }

    public void setNombrePadre(String NombrePadre) {
        this.NombrePadre = NombrePadre;
    }

    public String getApellidoPadre() {
        return ApellidoPadre;
    }

    public void setApellidoPadre(String ApellidoPadre) {
        this.ApellidoPadre = ApellidoPadre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public int getIdpadre() {
        return Idpadre;
    }

    public void setIdpadre(int Idpadre) {
        this.Idpadre = Idpadre;
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
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.NombrePadre);
        hash = 97 * hash + Objects.hashCode(this.ApellidoPadre);
        hash = 97 * hash + this.edad;
        hash = 97 * hash + Objects.hashCode(this.alumno);
        hash = 97 * hash + this.Idpadre;
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
        final Padre other = (Padre) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (this.Idpadre != other.Idpadre) {
            return false;
        }
        if (!Objects.equals(this.NombrePadre, other.NombrePadre)) {
            return false;
        }
        if (!Objects.equals(this.ApellidoPadre, other.ApellidoPadre)) {
            return false;
        }
        if (!Objects.equals(this.alumno, other.alumno)) {
            return false;
        }
        return true;
    }

    public Padre(String NombrePadre, String ApellidoPadre, int edad, Alumno alumno, int Idpadre) {
        this.NombrePadre = NombrePadre;
        this.ApellidoPadre = ApellidoPadre;
        this.edad = edad;
        this.alumno = alumno;
        this.Idpadre = Idpadre;
    }

    @Override
    public String toString() {
        return "-Padre- " + "NombrePadre: " + NombrePadre + ", ApellidoPadre: " + ApellidoPadre + ", edad: " + edad + ", alumno: " + alumno + ", Idpadre: " + Idpadre;
    }
 
       
    

    
    
    
   
    
}
