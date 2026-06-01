public class BuiltInFunctions {
    public static void main(String[] args) {

        //Ejecuta aquí todos los métodos creados e imprime en la terminal. 
        System.out.println("--- Probando Métodos ---");
        
        //Ejercicio 1: Ejecuta printMessage
        printMessage("Hola FemCoder!");

        //Ejercicio 2: Ejecuta getLength
        System.out.println("Longitud de texto: " + getLength("Java"));

        //Ejercicio 3: Ejecuta convertToLowercase
        System.out.println("Texto en minúsculas: " + convertToLowercase("JAVA"));

        //Ejercicio 4: Ejecuta findPrefix
        System.out.println("¿Empieza con 'Pre'?: " + findPrefix("Prefijo", "Pre"));

        //Ejercicio 5: Ejecuta replaceCharacters
        System.out.println("Texto con caracteres reemplazados: " + replaceCharacters("Hola FemCoder!", 'o', 'u'));

        //Ejercicio 6: Ejecuta getsSquareRoot
        System.out.println("Raíz cuadrada de 16: " + getsSquareRoot(16));

        //Ejercicio 7: Ejecuta getPower
        System.out.println("8 elevado a la 2: " + getPower(8, 2));

        //Ejercicio 8: Ejecuta getRandomNumber
        System.out.println("Número aleatorio: " + getRandomNumber());

        //Ejercicio 9: Ejecuta maxNumber
        System.out.println("Número mayor: " + maxNumber(10, 20));
    }

    //Ejercicio 1:
    /**
     * Function name: printMessage
     * 
     * @param message (String)
     * 
     * Inside the function:
     * 1. Find a java built-in function that prints the message on the console.
    */
    public static void printMessage(String message) {
        System.out.println(message);
    }
    
    //Ejercicio 2:
    /**
     * Function name: getLength
     * 
     * @param message (String)
     * @return (int)
     * 
     * Inside the function:
     * 1. Find a built-in function that returns the length of a string.
     */
    public static int getLength(String message) {
        return message.length();
    }

    //Ejercicio 3:
    /**
     * Function name: convertToLowercase
     * 
     * @param message (String)
     * @return (String)
     * 
     * Inside the function:
     * 1. Find a built-in function that converts a string to lowercase.
     */
    public static String convertToLowercase(String message) {
        return message.toLowerCase();
    }

    //Ejercicio 4:
    /**
     * Function name: findPrefix
     * 
     * @param message (String)
     * @param prefix (String)
     * @return (boolean)
     * 
     * Inside the function:
     * 1. Find a built-in function that checks if a string starts with a specified prefix.
     */
    public static boolean findPrefix(String message, String prefix) {
        return message.startsWith(prefix);
    }

    //Ejercicio 5:
    /**
     * Function name: replaceCharacters
     * 
     * @param message (String)
     * @param oldChar (char)
     * @param newChar (char)
     * @return (String)
     * 
     * Inside the function:
     * 1. Find a built-in function that replaces all occurrences of a specified character in a string with another character.
     */
    public static String replaceCharacters(String message, char oldChar, char newChar) {
        return message.replace(oldChar, newChar);
    }

    //Ejercicio 6:
    /**
     * Function name: getsSquareRoot
     * 
     * @param number (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. Find a built-in function that calculates the square root of a number.
     */
    public static double getsSquareRoot(double number) {
        return Math.sqrt(number);
    }

    //Ejercicio 7:
    /**
     * Function name: getPower
     * 
     * @param base (double)
     * @param exponent (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. Find a built-in function that calculates the power of a number.
     */
    public static double getPower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    //Ejercicio 8:
    /**
     * Function name: getRandomNumber
     *
     * @return (double)
     * 
     * Inside the function:
     * 1. Find a built-in function that generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
     */
    public static double getRandomNumber() {
        return Math.random();
    }

    //Ejercicio 9:
    /**
     * Function name: maxNumber
     * 
     * @param number1 (int)
     * @param number2 (int)
     * @return (int)
     * 
     * Inside the function:
     * 1. Find a built-in function that returns the larger of two numbers.
     */
    public static int maxNumber(int number1, int number2) {
        return Math.max(number1, number2);
    }
}
