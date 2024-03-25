import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class TestArrayList {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num;

        ArrayList<Integer> listaEnteros = new ArrayList<>();
        // leo numeros y los agrego a la lista de enteros
        System.out.println("Creando ArrayList");
        System.out.print("Ingrese un numero (el corte es -1): ");
        while ((num = s.nextInt()) != -1) {
            listaEnteros.add(num);
        }
        // imprimo dicha lista
        for (Integer i : listaEnteros) {
            System.out.println(i);
        }


        LinkedList<Integer> listaEnteros2 = new LinkedList<>();
        //leo numeros y los agrego a la lista de enteros
        System.out.println("Creando LinkedList");
        System.out.print("Ingrese un numero (el corte es -1): ");
        while ((num = s.nextInt()) != -1) {
            listaEnteros2.add(num);
        }
        // imprimo dicha lista
        for (Integer i : listaEnteros2) {
            System.out.println(i);
        }

        // genero lista
        ArrayList<Estudiante> listEstudiantes = new ArrayList<>();
        generarListaEstudiantes(listEstudiantes);
        
        // imprimo la original
        System.out.println();
        System.out.println("-----Lista Original-----");
        imprimirListaEstudiantes(listEstudiantes);

        // creo copia de la lista e imprimo las dos
        ArrayList<Estudiante> copiaListEst = new ArrayList<Estudiante>(listEstudiantes);
        // imprimo la copia
        System.out.println();
        System.out.println("-----Lista Trucha xd-----");
        imprimirListaEstudiantes(copiaListEst);
        
        // modifico el email del segundo estudiantes en al lista copiada
        copiaListEst.get(1).setEmail("tomas.ferrer@hotmail.com");
        
        // imprimo copia modiicada
        System.out.println();
        System.out.println("-----Lista Trucha Modificada xd-----");
        imprimirListaEstudiantes(copiaListEst);

        // agrego un estudiante a la lista original
        agregarEstudiante(listEstudiantes);
        // la imprimo
        System.out.println();
        System.out.println("-----Lista Original +1 Estudiante-----");
        imprimirListaEstudiantes(listEstudiantes);

        //imprimo si es capicua o no
        System.out.println();
        boolean capicua = esCapicua(listaEnteros);
        if (capicua){
            System.out.println("| La secuencia de numero es capicua |");
        }else{
            System.out.println("| La secuencia de numeros no es capicua |");
        }


    }
    // comparo el primero con el ultimo y asi hasta llegar al del medio
    public static boolean esCapicua(ArrayList<Integer> l){
        boolean result = true;
        int i = 0;
        int j = l.size()-1;
        while (i < j) { 
            if (!l.get(i).equals(l.get(j))) { 
                result = false; 
                break; 
            }
            i++; 
            j--;
        } 
        return result;
    }

    public static void agregarEstudiante(ArrayList<Estudiante> l){
        boolean encontre = false;
        Estudiante e = new Estudiante("Facu","Lamber",29,"gggttt@gmai.com","66 732");
        // Estudiante e = new Estudiante("Tomas","Ferrer",2,"sadas@gdsfds.com","48 610");
        for (Estudiante est : l) {
            if (e.getEmail().equals(est.getEmail())){
                System.out.println("Este estudiantes ya estaba cargado");
                encontre = true;
                break;
            }
        }
        if (!encontre){
            l.add(e);
        }
    }

    //Imprimo la lista pasada
    public static void imprimirListaEstudiantes(ArrayList<Estudiante> l){
        for (Estudiante est : l) {
            System.out.println(est.tusDatos());
        }
    }

    //Genero lista de estudiantes (en este caso 3 estudiantes)
    public static void generarListaEstudiantes(ArrayList<Estudiante> listEstudiantes){
        Estudiante e;
        for (int i = 0; i <3; i++) {
            e = new Estudiante("Tomas","Ferrer",i,"sadas@gdsfds.com","48 610");
            listEstudiantes.add(e);
        }
    }




    
}
