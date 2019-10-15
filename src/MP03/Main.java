package MP03;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {

        ArrayList<Lapiz> lapizs = new ArrayList<Lapiz>();
        lapizs.add(new Lapiz(101,11));
        lapizs.add(new Lapiz(103, 15));
        lapizs.add(new Lapiz(106, 16));
        lapizs.add(new Lapiz(105, 15));

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
        System.out.println("Sort por gruix :" + "\n");
        Collections.sort(lapizs, new Sortbygruix());

        System.out.println(lapizs.toString());


    }
}
