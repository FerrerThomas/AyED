public class Ejer3 {

    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[2];
        Profesor[] profesores = new Profesor[3];

        estudiantes[0] = new Estudiante("Tomas","Ferrer",3,"sadas@gdsfds.com","48 610");
        estudiantes[1] = new Estudiante("Facc","Fdsdsrer",3,"sdsa@gaafds.com","66 610");

        profesores[0] = new Profesor("Carlos","Menem","gmail.com",1,"unlp");
        profesores[1] = new Profesor("Pepe","Lotas","hotmail.com",3,"unlp");
        profesores[2] = new Profesor("Roberto","Tototo","mail.com",2,"unlp");

        System.out.println("Estudiantes: ");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i].tusDatos());
        }
        System.out.println();
        System.out.println("Proesores: ");
        for (int i = 0; i < profesores.length; i++) {
            System.out.println(profesores[i].tusDatos());
        }
    }
}
