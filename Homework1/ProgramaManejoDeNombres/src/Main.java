import java.util.Scanner;
//this is dev v.0.1
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "";
        String name;

        for (int i = 1; i <= 2; i++) {
            System.out.println("ingrese el nombre numero ".concat(String.valueOf(i)));
            name = scan.nextLine();
            result += ((name.toUpperCase().charAt(1)) + "." + name.substring(name.length() - 2) + "_");
        }
        System.out.println("ingrese el nombre numero 3");
        name =scan.nextLine();
        result += ((name.toUpperCase().charAt(1)) + "." + name.substring(name.length() - 2));
        System.out.println(result);
    }
}