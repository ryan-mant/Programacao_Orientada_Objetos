public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        System.out.println("A area do quadrado é: " + quadrado.calcularArea(4.6,4.6));
        System.out.println("A area do triangulo é: " + triangulo.calcularArea(6.9,5.3));
    }
}