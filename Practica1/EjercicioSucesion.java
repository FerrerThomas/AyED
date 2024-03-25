import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioSucesion {

    public List<Integer> calcularSucesion(int n){
        List<Integer> sucesion = new ArrayList<>();
        sucesion.add(n);
        if (n == 1) {
            return sucesion;
        }else{
            if (n % 2 == 0){
                sucesion.addAll(calcularSucesion(n/2));
            }else{
                sucesion.addAll(calcularSucesion(3*n+1));
            }
            return sucesion;
        }
    }

    public static void main(String[] args) {
        EjercicioSucesion ejer = new EjercicioSucesion();
        Scanner s = new Scanner(System.in);
        System.out.print("Ingresar numero a calcular: ");
        int num = s.nextInt();
        List<Integer> l = ejer.calcularSucesion(num);
        for (Integer i : l) {
            System.out.print(i);
            System.err.print("|");
        }
    }
}
