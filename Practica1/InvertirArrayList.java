import java.util.ArrayList;
import java.util.Scanner;

public class InvertirArrayList {
    
    public  void invertirArrayList(ArrayList<Integer> l,int i,int j){
        if (i > j){
            return;
        }else{
            int aux = l.get(j);
            l.set(j,l.get(i));
            l.set(i,aux);
            invertirArrayList(l, i+1, j-1);
        }
    }

    public static void main(String[] args) {
        InvertirArrayList ejercicio = new InvertirArrayList();
        ArrayList<Integer> l = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int num;
        System.err.print("Ingrese numeros: ");
        while ( (num = s.nextInt()) != -1){
            l.add(num);
        }
        System.out.println("--- Lista Original ---");
        for (Integer i : l) {
            System.out.print(i);
            System.err.print("|");
        }

        System.out.println();
        System.out.println("--- Lista Invertida ---");
        ejercicio.invertirArrayList(l,0,l.size()-1);
        for (Integer i : l) {
            System.out.print(i);
            System.err.print("|");
        }
    }
}
