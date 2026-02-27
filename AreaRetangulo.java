import java.util.Scanner;


public class AreaRetangulo {

   
    public static void main(String[] args) {

       
        Scanner input = new Scanner(System.in);

        
        System.out.print("Digite o valor da base do retângulo: ");
        double base = input.nextDouble(); // Lê a base

        System.out.print("Digite o valor da altura do retângulo: ");
        double altura = input.nextDouble(); // Lê a altura

      
        double area = base * altura;

       
        System.out.println("\n📐 Cálculo da Área do Retângulo 📐");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);

       
        input.close();
    }
}
