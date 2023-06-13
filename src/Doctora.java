public class Doctora extends Persona {
    private int edad;
    private String signo;

    //CONSTRUCTOR
    public Doctora(int ci,
                   String nombre,
                   String apellido,
                   String direccion,
                   int telefono,
                   int edad,
                   String signo) {
        super(ci, nombre, apellido, direccion, telefono);
        //ATRIBUTOS PROPIOS DE DOCTORA
        this.edad=edad;
        this.signo=signo;
    }

    //SETTER Y GETTERS
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    //METODOS PROPIOS
    public void examinar(){
        System.out.println("Este es el métoodo Examinar");
    }
}
