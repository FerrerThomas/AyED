public class Ejer1{
    public static void main(String[] args) {
        int a = 2;
        int b = 10;

        System.out.println("Calculo por FOR");
        calculoFor(a,b);

        System.out.println("Calculo por WHILE");
        calculoWhile(a,b);
        
        System.out.println("Calculo sin estructuras");
        calculoLibre(a,b);

    }

    public static void calculoFor(int a, int b) {
        for(int i=a; i<=b; i++){
            System.out.println(i);
      }
    }

    public static void calculoWhile(int a, int b) {
        int i = a;
        while (i<=b) {
            System.out.println(i);
            i++;
        }
    }

    public static void calculoLibre(int a, int b){
        if (a<=b){
            System.out.println(a);
            a++;
            calculoLibre(a, b);
        }
    }
}