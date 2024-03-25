import java.util.Scanner;

public class Ejer7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String num = s.next();
        for (int j = 0; j < num.length(); j++) {
            System.out.println(" "+num.charAt(j));
        }
        TestArrayList tt = new TestArrayList();
        System.out.println(tt.getClass());
    }

    public static void incisoD(){
        

    }
}
