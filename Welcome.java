//Inicializa la clase Welcome
//Crea el método main

public class Welcome {
    
    // --- BLOQUE DE EJECUCIÓN (main) ---
    public static void main(String[] args) {
        //Ejercicio 1: Ejecuta el método greeting 
        mainGreeting();

        //Ejecuta el método greetingCoder 
        greetingCoder("Siuzanna");
    }

    // --- BLOQUE EJERCICIO 1 ---
    //Ejercicio 1: Define el método greeting que imprima en terminal ¡Hola FemCoder!
    public static void mainGreeting() {
        System.out.println("¡Hola FemCoder!");
    }

    // --- BLOQUE EJERCICIO 2 ---
    //Ejercicio 2: Define el método greetingCoder que reciba un nombre y que imprima en terminal ¡Hola <name>!
    public static void greetingCoder(String name) {
        System.out.println("¡Hola " + name + "!");
    }

} // Cierre de la clase Welcome
