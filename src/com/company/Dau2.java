package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Dau2 {

    static int getRandomDouble(int min, int max) {
        int x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }


    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int partidagnada;
        int partidaperdida;

        System.out.println("1. Tirar Dado: ");
        System.out.println("2. Salir: ");
        int opciones = tec.nextInt();
        if (opciones==1){
         //JUGAR
            boolean play=true;
            JocdeDaus miJuego = new JocdeDaus();
            while(play){
                miJuego.jugar();
                System.out.println("¿Quieres seguir jugando? 1 SI | 2 NO");
                opciones=tec.nextInt();
                if (opciones==2){
                    //MOSTRAR RESULTADOS
                    System.out.println("PARTIDAS JUGADAS: "+miJuego.partidas);
                    System.out.println("PARTIDAS PERDIDAS: "+miJuego.perdidos);
                    System.out.println("PARTIDAS GANADAS: "+miJuego.ganador);
                    play=false;
                }
            }
        }
        else{
            //salir
            System.out.println("OTRA VEZ JUGARAS");
        }
    }
}

class JocdeDaus{

    public Dado dadoA;
    public Dado dadoB;
    public Dado dadoC;
    int ganador;
    int partidas;
    int perdidos;

    public JocdeDaus() {
        dadoA = new Dado();
        dadoB = new Dado();
        dadoC = new Dado();
    }

    public void jugar() {
        dadoA.tirar();
        dadoA.imprimir();
        dadoB.tirar();
        dadoB.imprimir();
        dadoC.tirar();
        dadoC.imprimir();

        if (dadoA.getValor() == dadoB.getValor() && dadoA.getValor() == dadoC.getValor()) {
            ganador++;
        }
        else{
            perdidos++;
        }
        partidas++;
    }
}

class Dado {

    protected int valor;

    void tirar(){
        valor = Dau2.getRandomDouble(1,6);
    }

    void imprimir(){
        System.out.println("Dado: "+getValor());
    }

    int getValor(){
        return valor;
    }

}




