import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Pedir al usuario que escoja 3 números.
        System.out.println("Introduce 3 números entre 1 y 6 (separados por espacios):");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // 2. Si el usuario escoge un número fuera del rango, salir del programa.
        if (isLessThanOne(num1, num2, num3) || isHigherThanSix(num1, num2, num3)) {
            System.out.println("Error: Has introducido un número fuera del rango (1-6).");
            System.exit(0);
        }

        // 3. Si los números son correctos, pedir al usuario si desea lanzar dados.
        System.out.println("¿Deseas lanzar los dados? (si/no):");
        String respuesta = scanner.next();

        // 4. Si el usuario dice que no, salir del programa.
        if (!respuesta.equalsIgnoreCase("si")) {
            System.out.println("Has decidido no jugar. ¡Hasta luego!");
            System.exit(0);
        }

        // 5. Si el usuario dice que si, lanzar dados, hacer los cálculos que indiquen si el usuario ganó o perdió.
        int dado1 = rollDice();
        int dado2 = rollDice();
        int dado3 = rollDice();

        System.out.println("\nHas lanzado los dados и ha salido: " + dado1 + " " + dado2 + " " + dado3);

        // 6. Imprimir la suma de los números escogidos por el usuario y la suma de los números que salieron en los dados.
        int sumNumbers = num1 + num2 + num3;
        int sumDiceRolls = dado1 + dado2 + dado3;

        System.out.println("Tu suma: " + sumNumbers);
        System.out.println("Suma de los dados: " + sumDiceRolls);

        // 7. Imprimir si el usuario ganó o perdió.
        if (userWon(sumNumbers, sumDiceRolls)) {
            System.out.println("¡Felicidades, ganaste el juego! 🎉");
        } else {
            System.out.println("Lo siento, perdiste. ❌");
        }

        scanner.close();
    }


    /**
     * 
     * Function name: isLessThanOne
     * 
     * @param num1 (int)
     * @param num2 (int)
     * @param num3 (int)
     * @return (boolean)
     * 
     * Inside the function:
     * 1. check if numbers are less than 1
     */
    
    // Escribe tu código aquí
    public static boolean isLessThanOne(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }


    /**
     * 
     * Function name: isHigherThanSix
     * 
     * @param num1 (int)
     * @param num2 (int)
     * @param num3 (int)
     * @return (boolean)
     * 
     * Inside the function:
     * 1. Check if numbers are greater than 6
     */

    // Escribe tu código aquí
    public static boolean isHigherThanSix(int num1, int num2, int num3) {
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }


    /**
     * 
     * Function name: userWon
     * 
     * @param sumNumbers (int)
     * @param sumDiceRolls (int)
     * @return (boolean)
     * 
     * Inside the function:
     * 1. check if user numbers are greater than computer numbers and the difference between user numbers and computer numbers are less than 5. 
     */

    // Escribe tu código aquí
    public static boolean userWon(int sumNumbers, int sumDiceRolls) {
        return (sumNumbers > sumDiceRolls && (sumNumbers - sumDiceRolls) < 5);
    }


    /**
     * Function name: rollDice
     * 
     * @return (int)
     * 
     * Inside the function:
     * 1. get random number between 1 and 6
     */

    // Escribe tu código aquí
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

}
