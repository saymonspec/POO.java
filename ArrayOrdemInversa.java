import java.util.Scanner;

public class ArrayOrdemInversa {

    
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);

       
        int[] numeros = new int[5];

       
        System.out.println("Digite 5 números inteiros:");

        
        for (int i = 0; i < numeros.length; i++) {
           
            System.out.print("Número " + (i + 1) + ": ");
           
            numeros[i] = entrada.nextInt();
        }

        
        System.out.println();

       
        System.out.println("Números na ordem original:");
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.print(numeros[i] + " ");
        }

       
        System.out.println("\n");

       
        System.out.println("Números na ordem inversa:");
        
        for (int i = numeros.length - 1; i >= 0; i--) {
            
            System.out.print(numeros[i] + " ");
        }

        
        System.out.println();

        
        entrada.close();
    }
}
