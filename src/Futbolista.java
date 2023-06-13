public class Futbolista extends Persona{
    private int num_horas_entrena;
    //CONSTRUCTOR
    public Futbolista(int ci,
                      String nombre,
                      String apellido,
                      String direccion,
                      int telefono,
                      int num_horas_entrena) {
        super(ci, nombre, apellido, direccion, telefono);
        //ATRIBUTOS PROPIOS DE FUTBOLISTA
        this.num_horas_entrena=num_horas_entrena;
    }

    //SETTER Y GETTERS
    public int getNum_horas_entrena() {
        return num_horas_entrena;
    }

    public void setNum_horas_entrena(int num_horas_entrena) {
        this.num_horas_entrena = num_horas_entrena;
    }

    //METODOS PROPIOS
    public void correr(){
        System.out.println("Este es el metodo correr");
    }
}
