import java.util.Queue;

public class BinaryTree<T> {
    private T data;
    private BinaryTree<T> leftChild;
    private BinaryTree<T> rightChild;
    
    public BinaryTree(){
    }

    public BinaryTree(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryTree<T> getLeftChild() {
        return leftChild;
    }

    public BinaryTree<T> getRightChild() {
        return rightChild;
    }
    
    public void addLeftChild(BinaryTree<T> hijo){ // agregar hijo izquierdo
        this.leftChild = hijo;
    }

    public void addRightChild(BinaryTree<T> hijo){ // agregar hijo derecho
        this.rightChild = hijo;
    }

    public void removeLeftChild(){ // borrar hijo izquierdo
        this.leftChild = null;
    }

    public void removeRightChild(){ // borrar hijo derecho
        this.rightChild = null;
    }

    public boolean isEmpty(){ //esta vacio, es decir no tiene datos dentro
        return this.data == null;
    }

    public boolean isLeaf(){ //es hoja, es decir no tiene hijos
        return ((this.leftChild == null) && (this.rightChild == null) );
    }
    
    public boolean hasLedfChild(){ //tiene hijo izquierdo
        return (this.leftChild != null);
    }

    public boolean hasRightChild(){ //tiene hijo derecho
        return (this.rightChild != null);
    }

    public String toString(){
        return this.getData().toString();
    }

    public int contarHojas(){
        int cantHI=0;
        int cantHD=0;
        if (isLeaf()){ // si no tiene hijos es una hoja
            return 1;
        }
        else{
            if (hasLedfChild()){
                cantHI = this.leftChild.contarHojas(); //cuento hijos izquierdos
            }
            if(hasRightChild()){
                cantHD = this.rightChild.contarHojas(); // cuento hijos derechos
            }
        }
        return cantHI + cantHD;
    }

    public BinaryTree<T> espejo(){
        if (isEmpty()){
            return new BinaryTree<>(); // retorno el arbol vacio
        }
        else{   // creo el arbol con 
            BinaryTree<T> arbolEspejo = new BinaryTree<T>(this.getData());
            if (hasLedfChild()) {
                arbolEspejo.addLeftChild(getLeftChild().espejo()); // voy creando espejos y se van acumuando 
            } 
            if (hasRightChild()) {
                arbolEspejo.addRightChild(getRightChild().espejo()); // lo mismo con los hijos derechos
            }
            return arbolEspejo;
        }
    }
    /* 
    public void entreNiveles(int n, int m){ // buscar como se hace
        Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
        cola.enqueue(this);
        cola.enqueue(null);
        while (!cola.isEmpty()) {
            ab = cola.dequeue();
            if (ab != null) {
                System.out.print(ab.getData());
                if (ab.hasLeftChild()) {
                    cola.enqueue(ab.getLeftChild());
                }
                if (ab.hasRightChild()) {
                    cola.enqueue(ab.getRightChild());
                }
            } else if (!cola.isEmpty()) {
                System.out.println();
                cola.enqueue(null);
            }
        }
    }
    */
}