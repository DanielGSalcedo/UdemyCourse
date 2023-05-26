import java.util.Scanner;
//this is main v.1.0
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        String name;
        for (int i = 1; i <= 3; i++) {
            System.out.println("ingrese el nombre numero ".concat(String.valueOf(i)));
            name = scan.nextLine();
            String substring = name.substring(name.length() - 2);
            result.append((i != 3) ? ((name.toUpperCase().charAt(1)) + "." + substring + "_") : "");
            result.append((i == 3) ? ((name.toUpperCase().charAt(1)) + "." + substring) : "");
        }
        System.out.println(result);
    }
}
