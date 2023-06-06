import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hola porfavor ingrese cuantos litros hay en el estanque de gasolina");
        double litros = scan.nextDouble();
        String estado = (litros == 70)?"Estanque lleno"
                :(litros >= 60 && litros< 70)?"Estanque casi lleno"
                :(litros >= 40 && litros< 60)?"Estanque 3/4"
                :(litros >= 35 && litros< 40)?"Medio Estanque"
                :(litros >= 20 && litros< 35)?"Suficiente"
                :(litros >= 1 && litros< 20)?"Insuficiente":"Valor no valido";
        System.out.println(estado);
    }
}