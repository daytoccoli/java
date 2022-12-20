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
public class Gestioncuota extends Gestionpoliza {
    protected Integer numcuotas;
    protected double montocuota;
    protected String pagado;
    protected  String fechavencimiento;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Gestioncuota() {
    }

    public Gestioncuota(Integer numcuotas, double montocuota, String pagado, String fechavencimiento, String numpoliza, String fechainicio, String fechafin, String cantcuota, String formapago, String tipocobertura, double montototal, double montomaxgranizo, String incluyegranizo, String marca, String modelo, String anio, String nummotor, String numchasis, String color, String tipo, String nombre, String apellido, String documento, String mail, String domicilio, String telefono) {
        super(numpoliza, fechainicio, fechafin, cantcuota, formapago, tipocobertura, montototal, montomaxgranizo, incluyegranizo, marca, modelo, anio, nummotor, numchasis, color, tipo, nombre, apellido, documento, mail, domicilio, telefono);
        this.numcuotas = numcuotas;
        this.montocuota = montocuota;
        this.fechavencimiento = fechavencimiento;
        this.pagado=pagado;
    }

    public Integer getNumcuotas() {
        return numcuotas;
    }

    public void setNumcuotas(Integer numcuotas) {
        this.numcuotas = numcuotas;
    }

    public double getMontocuota() {
        return montocuota;
    }

    public void setMontocuota(double montocuota) {
        this.montocuota = montocuota;
    }

    public String isPagado() {
        return pagado;
    }

    public void setPagado(String pagado) {
        this.pagado = pagado;
    }

    public String getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(String fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    @Override
    public String toString() {
        return "Gestioncuota{" + "numcuotas=" + numcuotas + ", montocuota=" + montocuota + ", pagado=" + pagado + ", fechavencimiento=" + fechavencimiento + '}';
    }

    
    public void Cuota (){
        System.out.println("ingrese el numero de cuota");
        setNumcuotas(leer.nextInt());
        System.out.println("ingrese el monto de la cuota");
        setMontocuota(leer.nextDouble());
        System.out.println("ingrese fecha de vencimiento");
        setFechavencimiento(leer.next());
        System.out.println("Se encuentra al dia?");
        setPagado(leer.next());
        
                
    }
    
    
    
}
