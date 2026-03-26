import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Numero,Meio;

        System.out.println("Digite seu Numero de 3 digitos ");
        Numero = sc.nextInt();

        Meio = Numero % 100/10;

        System.out.println("Seu Numero com apenas o valor do meio é " + Meio);
    }
}
