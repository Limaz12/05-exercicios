import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double HoraAula,PorcentagemINSS;
        double SalarioBruto,SalarioLiquido,ValordoDesconto;
        int HorasTrabalhadas;

        System.out.println("Digite o valor da Hora Aulas: ");
        HoraAula = sc.nextDouble();

        System.out.println("Digite o total de Horas Trabalhadas: ");
        HorasTrabalhadas = sc.nextInt();

        System.out.println("Digite a Porcentagem do INSS: ");
        PorcentagemINSS = sc.nextDouble();
        
        SalarioBruto = HoraAula * HorasTrabalhadas;

        ValordoDesconto = SalarioBruto * PorcentagemINSS /100;
        
        SalarioLiquido = SalarioBruto - ValordoDesconto;

        System.out.println("Valor do Salario Bruto é " + SalarioBruto);
        System.out.println("Valor do desconto do INSS é " + ValordoDesconto);
        System.out.println("Valor do Salario Liquido é " +
                String.format("%.2f", SalarioLiquido));
    }
}
