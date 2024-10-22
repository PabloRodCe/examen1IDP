/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Student
 */
public abstract class Estado {
    Pedido pedido;

    public Estado(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public abstract String pendiente();
    public abstract String cancelado();
    public abstract String completado();
    public abstract String entregado();
    
}
