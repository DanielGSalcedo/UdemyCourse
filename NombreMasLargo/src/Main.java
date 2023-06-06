import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       String name1 = JOptionPane.showInputDialog("ingrese su nombre completo");
       String name2 = JOptionPane.showInputDialog("ingrese su nombre completo");
       String name3 = JOptionPane.showInputDialog("ingrese su nombre completo");
       String longest = (name1.substring(0,name1.indexOf(" ")).length()-1 > name2.substring(0,name2.indexOf(" ")-1).length()) ? name1 : name2;
       longest = (longest.substring(0,longest.indexOf(" ")).length()-1 > name3.substring(0,name3.indexOf(" ")).length()-1)?longest:name3;
        System.out.println(longest.concat(" tiene el nombre más largo"));
    }
}



