import java.util.Scanner;

public class Calculadora3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado;

        switch (operacao) {
            case '+':
                resultado = somar(numero1, numero2); 
                break;
            case '-':
                resultado = subtrair(numero1, numero2); 
                break;
            case '*':
                resultado = multiplicar(numero1, numero2); 
                break;
            case '/':
                if (numero2 == 0) {
                    System.out.println("Erro: divisão por zero!");
                    return;
                }
                resultado = dividir(numero1, numero2); 
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }

    
    
   
    public static double somar(double num1, double num2) {
        return num1 + num2;
    }
   
    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }
   
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    
    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }
}

