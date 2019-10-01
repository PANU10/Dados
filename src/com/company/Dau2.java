package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Dau2 {

    public static void main(String[] args) {

    }
    public static int getRandomDouble(int min, int max){
        int x = (int) (Math.random()*((max-min)+1))+min;
        return x;
    }

    class Dado {
        int valor = getRandomDouble(1,6);
    }

    class JocdeDaus{

        public Dado dadoA;
        public Dado dadoB;
        public Dado dadoC;

        public JocdeDaus() {
          dadoA = new Dado();
          dadoB = new Dado();
          dadoC = new Dado();

        }
    }
}

