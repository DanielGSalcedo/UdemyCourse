import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola ingrese 1 para actualizar, 2 para eliminar, 3 para crear, 4 para listar y 5 para salir.");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("Actualizando");
            case 2 -> System.out.println("Eliminado con exito");
            case 3 -> System.out.println("Crear con exito");
            case 4 -> System.out.println("Listado con exito de los datos");
            case 5 -> System.out.println("Ha salido del sistema con exito");
            default -> System.out.println("Opcion no valida");
        }
    }
}