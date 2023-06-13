public class Estudiante extends Persona {
    private String semestre;
    //CONSTRUCTORES
    public Estudiante(int ci,
                      String nombre,
                      String apellido,
                      String direccion,
                      int telefono,
                      String semestre) {
        super(ci, nombre, apellido, direccion, telefono);
        //ATRIBUTOS PROPIOS DE LA CLASE ESTUDIANTE
        this.semestre=semestre;
    }


    //SETTERS Y GETTERS

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    //METODOS PROPIOS
    public void leer(){
        System.out.println("Este es el metodo leer");
    }

}
