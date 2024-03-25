public class Profesor {
    private String nombre;
    private String apellido;
    private String email;
    private Integer catedra;
    private String facultad;
    
    public Profesor() {
    }

    public Profesor(String nombre, String apellido, String email, Integer catedra, String facultad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.catedra = catedra;
        this.facultad = facultad;
    }

    public String tusDatos(){
        String aux = this.nombre+" "+this.apellido+" "+this.email+" "+this.catedra+" "+this.facultad;
        return aux;
    }
    
}
