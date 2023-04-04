import java.util.Scanner;

public class Main {
    public static String categoria(int idade){
        if (idade > 4 && idade < 8){
            return "Infantil A";
        } 
        else if (idade > 7 && idade < 11) {
            return "Infantil B";
        }
        else if (idade > 10 && idade < 14) {
            return "Juvenil A";
        }
        else if (idade > 13 && idade < 18) {
            return "Juvenil B";
        }
        else if (idade > 17) {
            return "Adulto";

        }
        return "Numero invalido, digite somente numeros acima de 5!";

    }
    public static void main(String[] args) {
        System.out.println("Digite sua idade para verificar sua categoria: ");
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        String resultado = categoria(numero);
        System.out.println("Categoria: " + resultado);


    }
}