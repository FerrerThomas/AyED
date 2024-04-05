import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    List<T> data;

    public Queue(){
        this.data = new ArrayList<>();
    }

    public void enqueue(T dato){
        data.add(dato);
    }

    public T dequeue(){
        return data.remove(0);
    }

    public T head(){
        return data.get(0);
    }

    public boolena isEmpty(){
        return data.isEmpty();
    }

    public int size(){
        return data.size();
    }

    public String toString(){
        String datos = "| ";
        for (T i : data) {
            datos = datos + i + " | ";
        }
        return datos;
    }
    
}
