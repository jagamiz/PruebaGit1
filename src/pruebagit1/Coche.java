/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pruebagit1;

/**
 *
 * @author igo 
 */
public class Coche {
    private int nroPuertas;
    private int nroRuedas;

    public Coche(int nroPuertas, int nroRuedas) {
        System.out.println("Constructor");
        this.nroPuertas = nroPuertas;
        this.nroRuedas = nroRuedas;
    }

    public int getNroPuertas() {
        return nroPuertas;
    }

    public void setNroPuertas(int nroPuertas) {
        this.nroPuertas = nroPuertas;
    }

    public int getNroRuedas() {
        return nroRuedas;
    }

    public void setNroRuedas(int nroRuedas) {
        this.nroRuedas = nroRuedas;
    }
    
}
