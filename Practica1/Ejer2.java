import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ingresa numero wuachin (fin = 0): ");
        int n = s.nextInt();
        while (n>0) {
            int [] vector = new int[n];
            for(int i=1; i<=n; i++){
                vector[i-1] = n*i;
                System.out.println(vector[i-1]);
            }
            System.out.println();
            System.out.print("ingresa numero wuachin (fin = 0): ");
            n = s.nextInt();
        }
    }
}
