import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva um numero :");
        int num1 = ler.nextInt();
        System.out.println("Escreva outro numero :");
        int num2 = ler.nextInt();
        System.out.println("Os numeros entre " + num1 + " e " + num2 + " são:");
        if (num1 > num2) {
            for (int i = num1; i >= num2; i = i - 1) {
                System.out.println(i);
            }
        } else {
            for (int i = num1; i <= num2; i = i + 1) {
                System.out.println(i);
            }
        }
        ler.close();
    }
}