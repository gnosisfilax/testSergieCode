public class Matrices {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int Index = 0; Index < numeros.length; Index++ ){

            System.out.println(numeros[Index]);

        }

        for (int numero : numeros) {
            System.out.println(numero);
            
        }

    }
    
}
