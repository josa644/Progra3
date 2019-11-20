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
public class Alumno {
    public String NombreAlumno,ApellidoAlumno;
    public String Correo;
    public int anios;

    public Alumno() {
    }

    public Alumno(String NombreAlumno, String ApellidoAlumno, String Correo, int anios) {
        this.NombreAlumno = NombreAlumno;
        this.ApellidoAlumno = ApellidoAlumno;
        this.Correo = Correo;
        this.anios = anios;
        
    }

    public String getNombreAlumno() {
        return NombreAlumno;
    }

    public void setNombreAlumno(String NombreAlumno) {
        this.NombreAlumno = NombreAlumno;
    }

    public String getApellidoAlumno() {
        return ApellidoAlumno;
    }

    public void setApellidoAlumno(String ApellidoAlumno) {
        this.ApellidoAlumno = ApellidoAlumno;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    @Override
    public String toString() {
        return "-Alumno- " + "NombreAlumno: " + NombreAlumno + ", ApellidoAlumno: " + ApellidoAlumno + ", Correo: " + Correo + ", anios: " + anios ;
    }

    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.NombreAlumno);
        hash = 79 * hash + Objects.hashCode(this.ApellidoAlumno);
        hash = 79 * hash + Objects.hashCode(this.Correo);
        hash = 79 * hash + this.anios;
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
        final Alumno other = (Alumno) obj;
        if (this.anios != other.anios) {
            return false;
        }
        if (!Objects.equals(this.NombreAlumno, other.NombreAlumno)) {
            return false;
        }
        if (!Objects.equals(this.ApellidoAlumno, other.ApellidoAlumno)) {
            return false;
        }
        if (!Objects.equals(this.Correo, other.Correo)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
