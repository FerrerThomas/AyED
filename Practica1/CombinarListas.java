import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CombinarListas {
    
    public ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1,ArrayList<Integer> lista2){
        ArrayList<Integer> nueva = new ArrayList<Integer>(lista1);
		nueva.addAll(lista2);
		Collections.sort(nueva);
		return nueva;
    }

    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int num;

        System.out.println("---Lectura lista 1---");
        while ((num = s.nextInt()) != -1) {
            lista1.add(num);
        }
        System.out.println("---Lectura lista 2---");
        while ((num = s.nextInt()) != -1) {
            lista2.add(num);
        }
        System.out.println();
        System.out.println("--- Lista 1 ---");
        for (Integer i : lista1) {
            System.out.print(i);
            System.err.print("|");
        }
        System.out.println();
        System.out.println("--- Lista 2 ---");
        for (Integer i : lista2) {
            System.out.print(i);
            System.err.print("|");
        }

        ArrayList<Integer> listaNueva = new ArrayList<>();
        CombinarListas ejer = new CombinarListas();
        listaNueva = ejer.combinarOrdenado(lista1,lista2);

        System.out.println();
        System.out.println("--- Lista Combinada ---");
        for (Integer i : listaNueva) {
            System.out.print(i);
            System.err.print("|");
        }
    }
}
