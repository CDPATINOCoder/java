import java.util.*;

public class HashSets {

    public static void main(String[] args){

        //HashSet vacio de Strings
        Set<String> nombres = new HashSet<>();

        //HashSet con capacidad inicial de 20
        Set<Integer> numeros = new HashSet<>(20);

        //HashSet con capacidad 10 y factor de carga 0.5
        Set<Double> precios = new HashSet<>(10, 0.5f);

        //insercion de elementos
        Set<Persona> personas = new HashSet<>();
        personas.add(new Persona(1, "Cesar", 20));
        personas.add(new Persona(2, "Cesar", 20));
        personas.add(new Persona(3, "Matheo", 21));
        personas.add(new Persona(4, "Dani", 20));
        nombres.add("Cesar");
        nombres.add("Mathe");
        nombres.add("Dani");
        nombres.add("Carlos");
        nombres.add("Cesar");

        System.out.println("----------------------");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        //eliminar elementos
        personas.remove(new Persona(1, "Cesar", 20));
        nombres.remove("Mathe");
        nombres.remove("Dani");

        System.out.println("----------------------");
        for(String nombre : nombres){
            System.out.println(nombre);
        }

        //Verificar Existencia
        System.out.println("-----------Existencia-----------");
        System.out.println(nombres.contains("Mathe"));
        System.out.println(nombres.contains("Cesar"));
        System.out.println(personas.contains(new Persona(1, "Cesar", 20)));

        //tamano y vacio
        System.out.println("----------------------");
        System.out.println(personas.size());
        System.out.println(nombres.isEmpty());
        System.out.println(numeros.isEmpty());

        //iterator
        System.out.println("----------------------");
        Iterator<Persona> iterator = personas.iterator();
        while(iterator.hasNext()){
            Persona persona = iterator.next();
            System.out.println(persona);
        }

        //remove con iterator
        System.out.println("----------------------");
        Iterator<String> iterator2 = nombres.iterator();
        while(iterator2.hasNext()){
            String nombre = iterator2.next();
            if(nombre.equals("Cesar")){
                iterator2.remove();
            }
        }

        //convertir a otras colecciones
        //de hashset a arraylist
        ArrayList<String> listaNombres = new ArrayList<>(nombres);
        //de array a hashSet
        Integer[] array = {1, 2, 3, 3};
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(array));
        System.out.println(hashSet);
        //arraylist a hashSet
        HashSet<Persona> personasLista = new HashSet<>(personas);
        System.out.println(personasLista);

    }

}
