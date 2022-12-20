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
public class Vehiculo extends Cliente {
    protected String marca,modelo,anio,nummotor,numchasis,color,tipo;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String anio, String nummotor, String numchasis, String color, String tipo, String nombre, String apellido, String documento, String mail, String domicilio, String telefono) {
        super(nombre, apellido, documento, mail, domicilio, telefono);
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.nummotor = nummotor;
        this.numchasis = numchasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getNummotor() {
        return nummotor;
    }

    public void setNummotor(String nummotor) {
        this.nummotor = nummotor;
    }

    public String getNumchasis() {
        return numchasis;
    }

    public void setNumchasis(String numchasis) {
        this.numchasis = numchasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", nummotor=" + nummotor + ", numchasis=" + numchasis + ", color=" + color + ", tipo=" + tipo + '}';
    }
    
    public void CargarVehiculo(){
        System.out.println("ingrese la marca del vehiculo");
        setMarca(leer.next());
        System.out.println("ingrese el modelo del vehiculo");
        setModelo(leer.next());
        System.out.println("ingrese el anio del vehiculo");
        setAnio(leer.next());
        System.out.println("ingrese el numero de motor");
        setNummotor(leer.next());
        System.out.println("ingrese el numero de chasis");
        setNumchasis(leer.next());
        System.out.println("ingrese el color del vehiculo");
        setColor(leer.next());
        System.out.println("que tipo de vehiculo es ");
        setTipo(leer.next());
        
        
        
    }
}
