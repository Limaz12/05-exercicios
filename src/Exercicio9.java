import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Numero,Unidade,Dezena,Centena,Inverso;

        System.out.println("Digite seu Numero de 3 digitos ");
        Numero = sc.nextInt();

        Unidade = Numero % 10;
        Dezena = Numero / 10 % 10 ;
        Centena = Numero / 100 ;
        Inverso = Unidade * 100 + Dezena * 10 + Centena;

        System.out.println("Seu Numero Invertido é " + Inverso);
    }
}
