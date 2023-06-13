public class Persona {
    //ATRIBUTOS DE LA SUPERCLASE
    private int ci;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;

    //CONSTRUCTOR
    public Persona(int ci, String nombre, String apellido, String direccion, int telefono) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //SETTERS Y GETTERS
    public int getCi() {return ci;}

    public void setCi(int ci) {this.ci = ci;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellido() {return apellido;}

    public void setApellido(String apellido) {this.apellido = apellido;}

    public String getDireccion() {return direccion;}

    public void setDireccion(String direccion) {this.direccion = direccion;}

    public int getTelefono() {return telefono;}

    public void setTelefono(int telefono) {this.telefono = telefono;}

    //METODOS DE LA SUPERCLASE
    public void caminar(){
        System.out.println("Este es el método de caminar que pertenece a la clase persona");
    }
    public void trabajar(){
        System.out.println("Este es el método de trabajar que pertenece a la clase persona");
    }

}
