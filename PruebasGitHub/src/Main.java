import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //this si the develop version
        Scanner scan = new Scanner(System.in);

        System.out.println("Hey sup?, what's your name?");
        String name = scan.nextLine();
        System.out.println("Hey ".concat(name).concat(" what's your age ?"));
        int age = scan.nextInt();

        if (age < 18 ){
            System.out.println("so, you are still a kid ");
        }else {
            System.out.println("so, you are an adult that's great");
        }
    }
}