/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author LENOVO
 */
public class Cliente {
    //Estos son los atributos de la clase.
    private String Nombre;
    private String Apellido;
    private String Cedula;
    private int Balance;
    //Estos son los constructores de la clase.
    public Cliente() {
    }
    
    public Cliente(String Nombre, String Apellido, String Cedula, int Balance) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Balance = Balance;
    }

    //Estos son los métodos get y set de cada atributo.
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }
}
