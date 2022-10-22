import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Escreva uma mensagem: ");
        String msg = ler.nextLine();
        System.out.println("Nº de vezes que a palavra deverá se repetir");
        int num = ler.nextInt();
        for (int i = 1; i <= num; i = i + 1) {
            System.out.println(msg);
        }
        ler.close();
    }
}