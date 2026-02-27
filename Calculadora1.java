import java.util.Scanner; 

public class Calculadora1 {

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
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 == 0) {
                    System.out.println("Erro: divisão por zero!");
                    return;
                }
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }

        System.out.println("Resultado: " + resultado); 
        scanner.close(); 
    }
}

