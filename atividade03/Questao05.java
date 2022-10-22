import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        for (int i = 1; i <= 5; i = i + 1) {
            System.out.print("Digite a idade: ");
            int idade = ler.nextInt();
            if (idade >= 18) {
                maior++;
            } else {
                menor++;
            }
        }
        System.out.println("A quantidade de maiors que são maiores ou iguais a 18 é de " +maior+ " e a queantidade de maiors menores de 18 anos é " +menor);
        ler.close();
    }
}