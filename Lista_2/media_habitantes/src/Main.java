import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite quantos habitantes participaram da pesquisa: ");
        Scanner leitor = new Scanner(System.in);
        int habitantes = leitor.nextInt();
        float somatorioSalario = 0;
        int somatorioFilhos = 0;
        float salario;
        int filho;
        float maiorSalario = 0;
        for (int contador = 0; contador < habitantes; contador++){
            System.out.println("Digite o " + (contador + 1) + "º salario");
            salario = leitor.nextFloat();
            System.out.println("Digite o numero de filhos referente ao habitante numero: " + (contador + 1));
            filho = leitor.nextInt();
            somatorioSalario = salario + somatorioSalario;
            somatorioFilhos = filho + somatorioFilhos;
            if (salario > maiorSalario){
                maiorSalario = salario;
            }
        }
        float mediaSalario = somatorioSalario / habitantes;
        int mediaFilhos = somatorioFilhos / habitantes;
        System.out.println("A media salarial foi : R$" + mediaSalario + "\n");
        System.out.println("A media de filhos foi : " + mediaFilhos + "\n");
        System.out.println("O maior salario foi : R$" + maiorSalario);


    }
}