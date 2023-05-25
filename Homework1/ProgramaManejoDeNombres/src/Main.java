import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("ingrese el primer nombre");
        String name1 = scan.nextLine();
        System.out.println("ingrese el segundo nombre");
        String name2 = scan.nextLine();
        System.out.println("ingrese el terccer nombre");
        String name3 = scan.nextLine();

        System.out.println((name1.toUpperCase().charAt(1))+"."+name1.substring(name1.length()-2)+"_"
                +(name2.toUpperCase().charAt(1))+"."+name2.substring(name2.length()-2)+"_"+(name3.toUpperCase().charAt(1))+"."
                +name3.substring(name3.length()-2));

    }
}