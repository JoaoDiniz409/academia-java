import java.util.Scanner;

public class AtividadeEstadio {

    public static void main(String[] args) {

        int valorClasseA = 50;
        int valorClasseB = 30;
        int valorClasseC = 20;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos bilhetes Classe A foram vendidos? ");
        int billhetesClasseA = sc.nextInt();

        System.out.println("Quantos bilhetes Classe B foram vendidos? ");
        int billhetesClasseB = sc.nextInt();

        System.out.println("Quantos bilhetes Classe C foram vendidos? ");
        int billhetesClasseC = sc.nextInt();

        double rendaTotalBilhetesA = billhetesClasseA * valorClasseA;
        double rendaTotalBilhetesB = billhetesClasseB * valorClasseB;
        double rendaTotalBilhetesC = billhetesClasseC * valorClasseC;

        System.out.printf("A renda gerada dos bilhetes Classe A %.2f%n", rendaTotalBilhetesA);
        System.out.printf("A renda gerada dos bilhetes Classe B %.2f%n", rendaTotalBilhetesB);
        System.out.printf("A renda gerada dos bilhetes Classe C %.2f%n", rendaTotalBilhetesC);

        sc.close();
    }
}
