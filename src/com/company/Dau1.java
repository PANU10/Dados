package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Dau1 {

    public static int getRandomDouble(int min, int max){
        int x = (int) (Math.random()*((max-min)+1))+min;
        return x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List <Integer> arrlist = new ArrayList<>();

        System.out.println("Cuantas veces quieres tirar: ");
        int tira = in.nextInt();
        int dadoA;
        int dadoB;


        for (int i = 0; i < tira; i++) {
            dadoA = getRandomDouble(1,6);
            dadoB = getRandomDouble(1,6);
            arrlist.add(dadoA+dadoB);
        }

        for (int j = 2; j <= 12 ; j++) {
            System.out.println("El número "+j+" ha salido "+" --> "+Collections.frequency(arrlist, j));
        }

    }
}
