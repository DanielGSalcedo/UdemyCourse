import java.util.Scanner;
//this is main v.1.0
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
<<<<<<< Updated upstream
        StringBuilder result = new StringBuilder();
        String name;
        for (int i = 1; i <= 3; i++) {
            System.out.println("ingrese el nombre numero ".concat(String.valueOf(i)));
            name = scan.nextLine();
            String substring = name.substring(name.length() - 2);
            result.append((i != 3) ? ((name.toUpperCase().charAt(1)) + "." + substring + "_") : "");
            result.append((i == 3) ? ((name.toUpperCase().charAt(1)) + "." + substring) : "");
=======
        String result ="";
        //this is develop v.0.1

        for( int i = 1;i<=3;i++){
        System.out.println("ingrese el primer nombre");
        String name = scan.nextLine();
        result += ((name.toUpperCase().charAt(1))+"."+name.substring(name.length()-2)+"_");
>>>>>>> Stashed changes
        }
        System.out.println(result);
    }

}
