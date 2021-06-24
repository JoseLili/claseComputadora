/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasecomputadora;

import ico.fes.componentes.Cpu;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author jose_
 */
public class ClaseComputadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Compósicion de Monitor 
        Monitor m1 = new Monitor("Hp ", "BTM121 ",  15);
        //Compósicion de Monitor 

        //Composicion de CPU
        Cpu cpu1 = new Cpu("Ryzen ", "3400g ", 5);
        //Composicion de CPU

        //Componente Teclado 
        Teclado t1 = new Teclado("CoolerMaster ", "Modelo: Sg3 ",
                    "con 105 teclas ", " con multimedia Si ");
        //Componente Teclado 
        
        //Componente Mouse
        Mouse mo1 = new Mouse("CooolerMaster ", "modelo: Sg31 ", "tipo: Optico ");
        //Componente Mouse
        
        //Impresion de computadora
        System.out.println("La computadora tiene un monitor: " + m1.getMarca() + 
                m1.getModelo() + "de: " + m1.getPulgadas() + " pulgadas," +
                         " con un procesador " + cpu1.getMarca() + "" + cpu1.getModelo() + 
                        cpu1.getVelocidadProcesador() + "GHz, " + "con un teclado " 
                        + t1.getMarca() + t1.getModelo() + t1.getNumeroDeTeclas() + 
                        t1.getMultimedia() + "con un mouse " + mo1.getMarca() + 
                mo1.getModelo() + mo1.getTipo());

    }

}
