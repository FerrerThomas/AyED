import java.util.ArrayList;

public class Ejer3 {
    // pruebo el metodo ContadorArbol con enteros
    public static void main(String[] args) {
        BinaryTree<Integer> a = new BinaryTree<>(8);
        BinaryTree<Integer> b = new BinaryTree<>(14);
        BinaryTree<Integer> c = new BinaryTree<>(22);
        BinaryTree<Integer> d = new BinaryTree<>(5);
        BinaryTree<Integer> e = new BinaryTree<>(2);
        BinaryTree<Integer> f = new BinaryTree<>(6);

        a.addLeftChild(e);
        a.addRightChild(d);
        e.addLeftChild(c);
        e.addRightChild(b);
        d.addLeftChild(f);

        System.err.println("| PARES POR INORDEN |");
        ContadorArbol cont = new ContadorArbol();
        ArrayList<Integer> resultados = cont.numerosParesInOrden(a);    
        for (Integer num : resultados) {
            System.out.print(num+"|");
        }

        System.err.println();
        System.err.println("| PARES POR POSTORDEN |");
        ArrayList<Integer> resultados2 = cont.numerosParesPostOrden(a);
        for (Integer num : resultados2) {
            System.out.print(num+"|");
        }
    }
}
