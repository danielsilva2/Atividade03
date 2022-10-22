import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int chances = 5;
        do {
            System.out.println("Digite a plavara correta: ");
            String senha = new String(ler.nextLine());
            chances = chances - 1;
            if (senha.equals("Java-2022")) {
                System.out.println("Palavra Ok");
            } else
                System.out.println("Palavra Errada");
        } while (chances > 0);
        System.out.println("Excedeu o limite de tentativas");
        ler.close();
    }
}