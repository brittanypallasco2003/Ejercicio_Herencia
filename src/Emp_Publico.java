public class Emp_Publico extends Persona{
    private String num_Telf_Ep;

    //CONSTRUCTOR
    public Emp_Publico(int ci,
                       String nombre,
                       String apellido,
                       String direccion,
                       int telefono,
                       String num_Telf_Ep) {
        super(ci, nombre, apellido, direccion, telefono);
        //ATRIBUTOS PROPIOS DE EMPLEADO
        this.num_Telf_Ep=num_Telf_Ep;
    }


    //SETTERS Y GETTERS
    public String getNum_Telf_Ep() {
        return num_Telf_Ep;
    }

    public void setNum_Telf_Ep(String num_Telf_Ep) {
        this.num_Telf_Ep = num_Telf_Ep;
    }

    //METODOS PROPIOS
    public void trabajar(){
        System.out.println("Este es el metodo trabajar");
    }

}
