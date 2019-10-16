package MP03;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Lapiz> lapizs = new ArrayList<Lapiz>();


        for (int i = 0; i < 5; i++) {
            lapizs.add(new Lapiz());
        }

        System.out.println("Sin ordenar: "+ "\n");
        for (int i = 0; i <lapizs.size() ; i++) {
            System.out.println(lapizs.get(i));;
        }
        System.out.println();

        System.out.println("Sort por collections"+"\n");
        Collections.sort(lapizs);
        for (int i = 0; i <lapizs.size() ; i++) {
            System.out.println(lapizs.get(i));;
        }
        System.out.println();

        // Para ELiminar:
        System.out.println("Sort por color : ");
        System.out.println(lapizs.toString());

        System.out.println();

        System.out.println("Eliminar los repetidos : ");
        Set<Lapiz> hs = new HashSet<>();
        hs.addAll(lapizs);
        lapizs.clear();
        lapizs.addAll(hs);
        System.out.println(lapizs.toString());


        System.out.println();
        System.out.println("Sort por gruix : ");
        Collections.sort(lapizs, new Sortbygruix());
        System.out.println(lapizs.toString());

    }
}
