import java.util.LinkedList;
import java.util.Scanner;

public class SumaRecursiva {

    public int calcularSuma(LinkedList<Integer> l, int i){
        int total =0;
        if(i==l.size()-1){
            return total+= l.get(i);
        }else{
            total = l.get(i) + calcularSuma(l, i+1);
        }
        return total;
    }

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        int num;
        while ((num = s.nextInt()) != -1) {
            l.add(num);
        }
        System.out.println("--- Lista Original ---");
        for (Integer i : l) {
            System.out.print(i);
            System.err.print("|");
        }
        SumaRecursiva ejer = new SumaRecursiva();
        System.out.println();
        System.out.println("Suma total de la lista: "+ejer.calcularSuma(l,0));

    }
}