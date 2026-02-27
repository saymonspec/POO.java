
import java.util.Scanner; 

public class Calculadora2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&Centro Universitário UniAlfa&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&Curso: Análise e Desenvolvimento de Sistemas - ADS&&&&&");
        System.out.println("&&&&&&Disciplina: Programação Orientada a Objetos - Java&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&Professor: George Mendes Marra****&&&&&&&&&&&&");
        System.out.println("&Aluno(a):                                                   &");
        System.out.println("&Data:                                                       &");
        System.out.println("&&&&&&&&&&&&Programa Calculadora em Java. Versão: 2.0&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble(); 

        
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble(); 

        System.out.println(); 
        System.out.println("Escolha a operação:");
        System.out.println("1-Soma");
        System.out.println("2-Subtração");
        System.out.println("3-Multiplicação");
        System.out.println("4-Divisão");
        System.out.println("5-Raiz quadrada");
        System.out.println("6-Raiz cúbica");
        System.out.println("7-Logaritmo natural");
        System.out.println("8-Eleva ao quadrado");
        System.out.println("9-Calcula o seno");
        System.out.println();

        char operacao = scanner.next().charAt(0);

        double resultado; 

        
        switch (operacao) {
            case '1': 
                resultado = numero1 + numero2;
                break;
            case '2':
                resultado = numero1 - numero2;
                break;
            case '3': 
                resultado = numero1 * numero2;
                break;
            case '4': 
                if (numero2 == 0) { 
                    System.out.println("Erro: divisão por zero!");
                    return; 
                }
                resultado = numero1 / numero2;
                break;
            case '5': 
                resultado = Math.sqrt(numero1); 
                System.out.println("Raiz quadrada de " + numero1 + " é = " + resultado);
                resultado = Math.sqrt(numero2); 
                System.out.println("Raiz quadrada de " + numero2 + " é = " + resultado);
                return; 
            case '6': 
                resultado = Math.cbrt(numero1); 
                System.out.println("Raiz cúbica de " + numero1 + " é = " + resultado);
                resultado = Math.cbrt(numero2); 
                System.out.println("Raiz cúbica de " + numero2 + " é = " + resultado);
                return; 
            case '7': 
                resultado = Math.log(numero1); 
                System.out.println("Logaritmo natural de " + numero1 + " é = " + resultado);
                resultado = Math.log(numero2); 
                System.out.println("Logaritmo natural de " + numero2 + " é = " + resultado);
                return; 
            case '8': 
                resultado = Math.pow(numero1, 2); 
                System.out.println(+numero1 + " elevado ao quadrado é = " + resultado);
                resultado = Math.pow(numero2, 2); 
                System.out.println(+numero2 + " elevado ao quadrado é = " + resultado);
                return; 
            case '9': 
                resultado = Math.sin(numero1);
                System.out.println("Seno de " + numero1 + " é = " + resultado);
                resultado = Math.sin(numero2); 
                System.out.println("Seno de " + numero2 + " é = " + resultado);
                return; 
            default: 
                System.out.println("Operação inválida!");
                return; 
        }

        System.out.println("Resultado: " + resultado); 
        scanner.close();
    }
}
