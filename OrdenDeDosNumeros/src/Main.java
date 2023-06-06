import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num1,num2,numM;
        System.out.println("ingrese el primer numero");
        num1 = scan.nextInt();
        System.out.println("ingrese el primer numero");
        num2 = scan.nextInt();
        System.out.println("el orden de los numeros de mayor a menor : "+num1+" y "+num2+" es "+Math.max(num1,num2)+"-"+Math.min(num1,num2));
    }
}