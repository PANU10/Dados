package MP03;

import java.util.Comparator;
import java.util.Objects;


public class Lapiz implements Comparable<Lapiz>  {
    int color;

    int gruix;

    public Lapiz(int size, int color) {
        this.gruix = size;
        this.color = color;
    }

    public Lapiz() {
        setColor();
        setGruix();
    }

    public void setColor() {
        this.color =  (int)(Math.random()*100)+1;
    }

    public void setGruix() {
        this.gruix =  (int)(Math.random()*7)+1;
    }

    public int getColor() {
        return color;
    }

    public int getGruix() {
        return gruix;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lapiz lapiz = (Lapiz) o;
        return color == lapiz.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
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

class Sortbycolor implements Comparator<Lapiz>{

    @Override
    public int compare(Lapiz t1, Lapiz t2) {
        if (t1.getColor() > t2.getGruix()) return 1;
        else if (t1.getColor() < t2.getColor()) return -1;
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




