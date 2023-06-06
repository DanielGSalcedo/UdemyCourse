import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double promedioT = 0,nota,promedioA=0,promedioB=0;
        int unos =0,notasA=0,notasB=0;
        System.out.println("vamos a calcular el promedio de 20 notas del estudiante entre 1 y 7");
        notas:
        for(int i = 0; i < 20; i++) {
            do {
                System.out.println("Ingrese la nota del estudiante N° " + (i + 1));
                nota = scanner.nextDouble();
                if (nota == 0) break notas;
            }while(nota < 1 || nota > 7);
            if(nota == 1) unos++;
            if(nota >= 5) {notasA++; promedioA += nota;}
            if (nota < 4) {notasB++; promedioB += nota;}
            promedioT += nota/20;
            if (i == 19){
                promedioA /= notasA;
                promedioB /= notasB;
                System.out.println("El promedio total es: " + promedioT);
                System.out.println("El promedio de notas mayores o iguales a 5 es: " + promedioA);
                System.out.println("El promedio de notas menores a 4 es: " + promedioB);
                System.out.println("La cantidad de notas igual a 1 es: " + unos);
            }
        }
    }
}