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
public class Gestionpoliza extends Vehiculo {
    protected String numpoliza,fechainicio,fechafin,cantcuota,formapago,tipocobertura;
    protected double montototal,montomaxgranizo;
    protected  String incluyegranizo ;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Gestionpoliza() {
    }

    @SuppressWarnings("empty-statement")
    public Gestionpoliza(String numpoliza, String fechainicio, String fechafin, String cantcuota, String formapago, String tipocobertura, double montototal, double montomaxgranizo, String incluyegranizo, String marca, String modelo, String anio, String nummotor, String numchasis, String color, String tipo, String nombre, String apellido, String documento, String mail, String domicilio, String telefono) {
        super(marca, modelo, anio, nummotor, numchasis, color, tipo, nombre, apellido, documento, mail, domicilio, telefono);
        this.numpoliza = numpoliza;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.cantcuota = cantcuota;
        this.formapago = formapago;
        this.tipocobertura = tipocobertura;
        this.montototal = montototal;
        this.montomaxgranizo = montomaxgranizo;
        this.incluyegranizo = incluyegranizo;
        ;
    }

    public String getNumpoliza() {
        return numpoliza;
    }

    public void setNumpoliza(String numpoliza) {
        this.numpoliza = numpoliza;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public String getCantcuota() {
        return cantcuota;
    }

    public void setCantcuota(String cantcuota) {
        this.cantcuota = cantcuota;
    }

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }

    public String getTipocobertura() {
        return tipocobertura;
    }

    public void setTipocobertura(String tipocobertura) {
        this.tipocobertura = tipocobertura;
    }

    public double getMontototal() {
        return montototal;
    }

    public void setMontototal(double montototal) {
        this.montototal = montototal;
    }

    public double getMontomaxgranizo() {
        return montomaxgranizo;
    }

    public void setMontomaxgranizo(double montomaxgranizo) {
        this.montomaxgranizo = montomaxgranizo;
    }

    public String isIncluyegranizo() {
        return incluyegranizo;
    }

    public void setIncluyegranizo( String incluyegranizo) {
        this.incluyegranizo = incluyegranizo;
    }

    @Override
    public String toString() {
        return "Gestionpoliza{" + "numpoliza=" + numpoliza + ", fechainicio=" + fechainicio + ", fechafin=" + fechafin + ", cantcuota=" + cantcuota + ", formapago=" + formapago + ", tipocobertura=" + tipocobertura + ", montototal=" + montototal + ", montomaxgranizo=" + montomaxgranizo + ", incluyegranizo=" + incluyegranizo + '}';
    }
    
    public void Cargarpoliza (){
        
        System.out.println(" ingrese el numero de poliza");
        setNumpoliza(leer.next());
        System.out.println("ingrese la fecha de inicio de la poliza");
        setFechainicio(leer.next());
        System.out.println("ingrese la fecha de finalizacion ");
        setFechafin(leer.next());
        System.out.println("ingrese la cantidad de cuotas de la poliza");
        setCantcuota(leer.next());
        System.out.println("ingrese la forma de pago ");
        setFormapago(leer.next());
        System.out.println("ingrese el monto total de la poliza ");
        setMontototal(leer.nextDouble());
        System.out.println("ingrese el monto maximo por granizo");
        setMontomaxgranizo(leer.nextDouble());
        System.out.println("ingrese el tipo de cobertura");
        setTipocobertura(leer.next());
        System.out.println("esta poliza incluye granizo?");
        setIncluyegranizo(leer.next());
        
          }
    
}  
