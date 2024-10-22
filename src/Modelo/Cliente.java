/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Student
 */
public class Cliente {
<<<<<<< Updated upstream
   private int id;
   private String nombre;
   private String apellido;
   String Torden;

    public Cliente(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
=======
    
    private int id;
    private int telefono;
    private String Nombre;

    public Cliente(int id, int telefono, String Nombre) {
        this.id = id;
        this.telefono = telefono;
        this.Nombre = Nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
>>>>>>> Stashed changes
    }

    public int getId() {
        return id;
    }

<<<<<<< Updated upstream
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
   
=======
    public int getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return Nombre;
    }
    
    
>>>>>>> Stashed changes
}
