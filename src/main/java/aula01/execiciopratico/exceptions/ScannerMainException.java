package aula01.execiciopratico.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerMainException {

    public static void main(String[] args) {


        try{
            Scanner entradaTeclado = new Scanner(System.in);
            int num1, num2, divisao;

            System.out.println("Digite o primeiro valor: ");
            num1 = entradaTeclado.nextInt();

            System.out.println("Digite o segundo valor: ");
            num2 = entradaTeclado.nextInt();

            divisao = num1 / num2;

            System.out.println("O resultado da divisão é: " + divisao);

        }catch (ArithmeticException exception) {
            System.out.println("Não é posivel dividir numeros por 0");
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("É permitido somente numeros");
        }
    }
}
