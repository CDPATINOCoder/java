import java.util.List;
import java.util.LinkedList;

public class LinkedLists {

    public static void main (String[] args) {

        List<Persona> list = new LinkedList<>();

        list.add(new Persona(1, "Cesar", 20));
        list.add(new Persona(2, "Bob", 30));
        list.add(new Empleado(3, "Diana", 40, 240000));

        //insercion en la primera posicion
        list.add(0, new Persona(4, "Carlos", 23));

        //insercion en la ultima posicion
        list.add(4, new Persona(5, "Dani", 23));

        //insercion en el medio
        list.set(2, new Persona(6, "Mathias", 22));

        for(Persona persona:list) {
            System.out.println(persona);
        }

        System.out.println(list.get(2));

        //Metodos comunes
        //add()
        //get()
        //set()
        //remove()
        //size()
        //contains()
        //clear()
        //iterator


    }

}
