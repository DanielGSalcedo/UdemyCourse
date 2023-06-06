import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minN = Integer.MAX_VALUE ,n;
        do {
            System.out.println("Hola porfavor ingrese el numero de numeros a comparar estos deben ser minimo 10");
            n = scan.nextInt();
        }while (n < 10);

        for (int i = 0;i< n; i++){
            System.out.println("Ingrese el numero " + (i+1));
            int numero = scan.nextInt();
            minN = Math.min(numero, minN);
        }
        String result = (minN < 10 )? "El numero "+minN+" menor es menor a 10" : "El numero "+minN+" menor es igual  o mayor a 10";
        System.out.println(result);
    }
}