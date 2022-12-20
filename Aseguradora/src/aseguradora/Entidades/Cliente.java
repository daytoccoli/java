/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aseguradora.Entidades;

import java.util.Scanner;

/**
 *
 * @author Dayan
 */
public class Cliente {
    protected String nombre, apellido,documento,mail,domicilio,telefono;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String documento, String mail, String domicilio, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", mail=" + mail + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
    public void CrearCliente (){
        System.out.println("ingrese el nombre del cliente");
        setNombre(leer.next());
        System.out.println("ingrese el apellido del cliente");
        setApellido(leer.next());
        System.out.println("ingrese el dni del cliente");
        setDocumento(leer.next());
        System.out.println("ingrese el mail del cliente");
        setMail(leer.next());
        System.out.println("ingrese el domicilio del cliente");
        setDomicilio(leer.next());
        System.out.println("ingrese el telefono del cliente");
        setTelefono(leer.next());
        
        
    }
    
  
}
