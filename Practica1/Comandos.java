import java.util.ArrayList;
import java.util.LinkedList;

public class Comandos {

    public static void main(String[] args) {
        int dato=7;
    
        //declaracion de Arraylist de enteros
        ArrayList<Integer> name = new ArrayList<Integer>();

        //declaracion de LinkedList de enteros
        LinkedList<Integer> name2 = new LinkedList<>();

        //agrega el dato a la lista (al final)
        name.add(dato);

        //agrega el dato en la posicion "n"
        name.add(n,dato);

        //devuelve la cantidad de elementos de la lista
        name.size();

        //devuelve el elemento que esta en la "n" de la lista
        name.get(n);
        
        //comprueba si el elemento pasado por parametro existe en la lista
        name.contains(dato);

        //devuelve la posicion de la primera ocurrencia con el dato pasado
        name.indexOf(dato);

        //devuelve la posicion de la ultima ocurrencia con el dato pasado
        name.lastIndexOf(dato);

        //borra el dato de la posicion "n" de la lista
        name.remove(n);

        //borra la primera ocurrencia con el dato pasado como parametro
        name.remove(dato);

        //borra todos los elementos de la lista
        name.clear();

        //comprueba si la lista esta vacia, devulve true si esta vacia, false si tiene datos
        name.isEmpty();

        //clonar un Arraylist
        ArrayList arrayListCopia = (ArrayList) name.clone();

        //pasar el ArrayList a un Array 
        Object[] array = name.toArray();

        //cargo un ArrayList por teclado
        System.out.println("Integrese una secuencia de nuemros (corte -1): ");
        while ( (dato = s.nextInt()) != -1){
            name.add(dato);
        }

        //imprimo un Arraylist
        System.out.println("--- ArrayList ---");
        for (Integer i : name) {
            System.out.print(i);
            System.err.print("|");
        }
    }
}
