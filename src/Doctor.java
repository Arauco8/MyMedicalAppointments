public class Doctor {
    //Atributos
    static int id = 0; //autoincrement cuando la variable es de tipo static cualquier cambio repercute en todos los objetos creados. Le da un scoope global
    String name;
    String speciality;

    // Método Constructor
    // Crea nueva instancias de una clase
    // tiene el mimsmo nombre de la clase que inicializa
    // usa la palabra reservada new para invocarlo
    Doctor(String name){
        // Instrucciones que se ejecutan al crear/instanciar
        // un nuevo objeto con la clase Doctor...
        System.out.println("Construyendo el Objeto Doctor");
        id++;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor:" +id);
    }

}
