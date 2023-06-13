public class Main {
    public static void main(String[] args) {
        //SE GENERA ANA
        Doctora Ana= new Doctora(1728994562,"Ana","López","Oe 10-89-3",960452367,33, "Leo");
        //SE GENERA PABLO
        Emp_Publico Pablo=new Emp_Publico(1728991887, "Pablo","Juarez","Oe 55-56-1", 960457833,"123456");
        //SE GENERA MARITZA
        Futbolista Maritza=new Futbolista(1728992345,"Maritza","Zurita","Oe 78-89-2",956234545, 5);
        //SE GENERA MELANI
        Estudiante Melani=new Estudiante(1728564523,"Melanie","Suaréz","Oe 89-12-3",945782344,"Tercer Semestre");

        //INVOCACION DE LOS METODOS
        Ana.examinar();
        Pablo.trabajar();
        Maritza.correr();
        Melani.leer();
    }
}
