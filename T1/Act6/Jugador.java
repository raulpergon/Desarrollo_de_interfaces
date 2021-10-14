/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Act6;

/**
 *
 * @author Raul
 */
public class Jugador {
    
    private String Nombre;
    private String Apellidos;
    private String Equipo;
    private int FechaAlta;
    private String Pais;

    public Jugador(String Nombre, String Apellidos, String Equipo, int FechaAlta, String Pais) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Equipo = Equipo;
        this.FechaAlta = FechaAlta;
        this.Pais = Pais;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public int getFechaAlta() {
        return FechaAlta;
    }

    public void setFechaAlta(int FechaAlta) {
        this.FechaAlta = FechaAlta;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    
    
    
    
}
