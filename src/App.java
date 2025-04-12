import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Imprimiendo mensaje default de Java
        System.out.println("Hello, World!");

        // Condicionales
        int edad = 18;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else if (edad < 0) {
            System.out.println("No puedes tener edad negativa");
        } else {
            System.out.println("Eres menor de edad");
        }

        // Switch

        //Scanner scanner = new Scanner(System.in);

        System.out.println("Menú de bebidas:");
        System.out.println("1.- Cáfe");
        System.out.println("2.- Té");
        System.out.println("3.- Agua");
        System.out.println("Elige una opción");

        int option = 1;
       
        //int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("El café es rico");
                break;
            case 2:
                System.out.println("El Té es rico");
                break;
            case 3:
                System.out.println("El Agua es rico");
                break;

            default:
                System.out.println("opcion no válida");
                break;
        }

        //scanner.close();

    // Ciclo for

    for (int i = 1; i <=3; i++){
        for (int j = 1; j<=3;j++){
            for(int k = 1; k <= 3; k++){

            System.out.print("i: " );
            System.out.print(i);
            System.out.print(" j: ");
            System.out.print(j);
            System.out.print(" k: ");
            System.out.println(k);

            }
        }
    }

    // While & do While
    int i = 1;
    while (i <= 3){
        System.out.println(i);
        i++;
    }

    int j = 1;

    do {
        System.out.println(j);
        j++;
    } while(j <= 3);  

    }
}
