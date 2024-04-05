import java.util.ArrayList;

public class ContadorArbol {

    private ArrayList<Integer> calcularInOrden(BinaryTree<Integer> arbol, ArrayList<Integer> lista){
    
        if (arbol.hasLedfChild()){
            calcularInOrden(arbol.getLeftChild(), lista); // calculo en el izquierdo
        }
        if ((arbol.getData() % 2) ==0) { // si es par agrego a la lista
            lista.add(arbol.getData());
        }
        if (arbol.hasRightChild()) {
            calcularInOrden(arbol.getRightChild(), lista); // calculo en el derecho
        }
        return lista;
    }

    private ArrayList<Integer> calcularPostOrden(BinaryTree<Integer> arbol, ArrayList<Integer> lista){
        if (arbol.hasLedfChild()){
            calcularPostOrden(arbol.getLeftChild(), lista);
        }
        if (arbol.hasRightChild()){
            calcularPostOrden(arbol.getRightChild(), lista);
        }
        if ((arbol.getData() % 2) == 0){
            lista.add(arbol.getData());
        }
        return lista;
    }

    
    public ArrayList<Integer> numerosParesInOrden(BinaryTree<Integer> arbol){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        calcularInOrden(arbol,lista);
        return lista;
    } 

        
    public ArrayList<Integer> numerosParesPostOrden(BinaryTree<Integer> arbol){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        calcularPostOrden(arbol,lista);
        return lista;
    } 
}
