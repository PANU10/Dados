package MP03;

import java.util.Comparator;


public class Lapiz implements Comparable<Lapiz>  {
    int color;
    int gruix;

    public Lapiz(int size, int color) {
        this.gruix = size;
        this.color = color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public int getGruix() {
        return gruix;
    }

    public void setGruix(int gruix) {
        this.gruix = gruix;
    }



    @Override
    public String toString() {
        return "Lapiz{" +
                "size=" + gruix +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Lapiz lapiz) {
        if (this.color > lapiz.color) return 1;
        else if (this.color < lapiz.color) return -1;
        return 0;
    }
}

class Sortbygruix implements Comparator<Lapiz>{
    @Override
    public int compare(Lapiz t1, Lapiz t2) {
        if (t1.getGruix() > t2.getGruix()) return 1;
        else if (t1.getGruix() < t2.getGruix()) return -1;
        return 0;
    }
}
//class SortbySize implements Comparator<Lapiz>{
//
//    @Override
//    public int compare(Lapiz s1, Lapiz s2) {
//        return s1.size.compareTo(s2.size);
//    }
//}




//public class Lapiz implements Comparable<Lapiz>{
//    int size;
//    int color;
//
//    public Lapiz(int size, int color) {
//        this.size = size;
//        this.color = color;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Lapiz lapiz = (Lapiz) o;
//        return size == lapiz.size &&
//                color == lapiz.color;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(size, color);
//    }
//
//    @Override
//    public int compareTo(Lapiz lapiz) {
//        if (this.equals(lapiz)) return 1;
//        else return 0;
//    }
//
//    public int getSize() {
//        return size;
//    }
//
//    public void setSize(int size) {
//        this.size = size;
//    }



