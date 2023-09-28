//Funcion suma, recepciona dos numeros de entrada y muestra el resultaod por pantalla
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int salida = 3;
            int number1 = 0;
            int number2 = 0;
            do{
                //SELECCION DE OPERACIÓN (SUMA, RESTA, DIVISION, MULTIPLICACION Y SALIDA)
                System.out.println("Ingrese la operación que desea realizar: ");
                System.out.println("S para sumar, R para restar, M para multiplicar, D para dividir o C para cerrar");
                String operation = scan.next().toUpperCase();

                if (!operation.equals("C")){
                    //ENTRADA DE NUMEROS
                    System.out.println("Ingrese un número entero: ");
                    number1 = scan.nextInt();
                    System.out.println("Ingrese otro número entero: ");
                    number2 = scan.nextInt();
                }


                switch (operation) {
                    case "S" -> {
                        //Función suma
                        int suma = number1 + number2;
                        System.out.println("Resultado: " + suma);
                    }
                    case "R" -> {
                        //Función resta
                        int resto = number1 - number2;
                        System.out.println("Resultado: " + resto);
                    }
                    case "M" -> {
                        //Función multiplicación
                        int multiplo = number1 * number2;
                        System.out.println("Resultado: " + multiplo);
                    }
                    case "D" -> {
                        //La división por cero no será válida
                        if (number2 != 0) {
                            int division = number1 / number2;
                            System.out.println("Resultado: " + division);

                        } else {
                            //Si se intenta, lanza un mensaje de error
                            System.out.println("Error! No es posible dividir por 0 ");
                        }
                    }

                    case "C" -> salida = 0;

                    //si no se ingresa una entrada válida da error
                    default -> System.out.println("Error! Entrada no válida, intente nuevamente");
                }
            } while(salida !=0);

            //DESPEDIDA
            System.out.println("Adios! Vuelve pronto (:");

         scan.close();
        }
}
