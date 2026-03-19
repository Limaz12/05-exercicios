import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double SalarioMinimo,ValorQuilowatt,Conta;
        int Qtdquilowatt;

        System.out.println("Digite o valor do salário mínimo ");
        SalarioMinimo = sc.nextDouble();

        System.out.println("Digite a quantidade de quilowatt ");
        Qtdquilowatt = sc.nextInt();

        ValorQuilowatt = SalarioMinimo / 7 / 100;

        Conta = Qtdquilowatt * ValorQuilowatt;

        System.out.println("Valor da Conta é " + Conta);
        System.out.println("Valor do quilowatt é " + ValorQuilowatt);
        System.out.println("Valor da conta com 10% de desconto é " + Conta * 0.90);
    }
}
