import java.util.Map;
import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {
        Map<String, Integer> edades = new HashMap<>();

        //HashMap con capacidad inicial 20.
        Map<Integer, String> estudiantes = new HashMap<>(20);

        //HashMap ocn capacidad inicial 10 y factor de carga 0.6.
        Map<String, Double> precios = new HashMap<> (10, 0.6f);

        //Anadir entradas put(clave, valor)
        edades.put("Ana", 25);
        edades.put("Ana", 26);  //sobreescribe 25 por 26
        edades.put("Jose", 32);
        edades.put("Eduardo", 24);
        edades.putIfAbsent("Luis", 25); //anade solo si luis no existe.
        System.out.println("------------------------------------");
        System.out.println(edades);


        //Obtener valores
        int edadAna = edades.get("Ana");
        int edadPredeterminada = edades.getOrDefault("Pedro", 20);
        System.out.println("------------------------------------");
        System.out.println(edadAna);
        System.out.println(edadPredeterminada);


        //Eliminar Entradas
        System.out.println("------------------------------------");
        edades.remove("Luis");
        edades.remove("Ana", 27); //Elimina solo si clave-valor coinciden
        System.out.println(edades);


        //Verificar Existencia
        System.out.println(edades.containsKey("Ana"));  //true
        System.out.println(edades.containsValue(30)); //false


        //Iteracion HashMap
        System.out.println("------------------------------------");

        //clave:
        for (String clave : edades.keySet()) {
            System.out.println(clave);
        }

        System.out.println("------------------------------------");
        //valor:
        for (Integer valor : edades.values()) {
            System.out.println(valor);
        }

        System.out.println("------------------------------------");
        //Entradas clave-valor:
        for (HashMap.Entry<String, Integer> entrada : edades.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }


        System.out.println("------------------------------------");
        //lambda:
        edades.forEach((clave, valor) -> System.out.println(clave + ": " + valor));


        //Metodos utiles:

        System.out.println("------------------------------------");
        //compute, modifica el valor asociado a una clave
        edades.compute("Ana", (clave, valor) -> valor + 1);
        System.out.println(edades);

        System.out.println("------------------------------------");
        //merge, combina valores si la clave existe
        edades.merge("Ana", 2, (viejo, nuevo) -> viejo + nuevo);
        System.out.println(edades);

        System.out.println("------------------------------------");
        //getOrDefault, evita NullPointerException, devuelve un valor por defecto en caso de que no exista la clave
        System.out.println(edades.getOrDefault("Cesar", 0));


        HashMap<Integer, Persona> personas = new HashMap<>();

        System.out.println("------------------------------------");
        personas.put(1, new Persona(1, "Cesar", 20));
        personas.put(2, new Empleado(2, "Eduardo", 20, 31112));
        System.out.println(personas);

    }

}
