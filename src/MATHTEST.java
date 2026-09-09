import java.util.Scanner;

public class MATHTEST {
    public static void main(String[] args) {
        while (true) {
            Scanner calc = new Scanner(System.in);
            double num1, num2, resultado;
            char operador;
            System.out.println("Digite o primeiro numero");
            num1 = calc.nextDouble();

            System.out.println("Escolha a operacao: (+, -, *, /, ^)");
            operador = calc.next().charAt(0);

            System.out.println("Digite o segundo numero");
            num2 = calc.nextDouble();

            switch (operador) {
                case '+':
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case '-':
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case '*':
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Erro: divisao por zero");
                    }
                    break;
                case '^':
                    resultado = Math.pow(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    System.out.println("Operador invalido");
            }
        }
    }
}