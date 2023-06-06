import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroUno = 0,numeroDos = 0,resultado = 0;
        boolean esNegativo1 = false, esNegativo2 = false;
        System.out.println("Ingrese el numero uno multiplicar");
        numeroUno = scanner.nextInt();
        esNegativo1 = numeroUno < 0;
        System.out.println("Ingrese el numero dos multiplicar");
        numeroDos = scanner.nextInt();
        esNegativo2 = numeroDos < 0;
        for (int i = 0; i < Math.abs(numeroDos); i++) {
            resultado += Math.abs(numeroUno);
        }
        String signoNegativo = (esNegativo1^esNegativo2)?"el resultado es -"+resultado:"el resultado es "+resultado;
        System.out.println(signoNegativo);
    }
}