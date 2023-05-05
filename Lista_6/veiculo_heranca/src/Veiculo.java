public abstract class Veiculo {
    private int id;
    private int velocidadeAtual;
    private int velocidadeMaxima;
    private int precisaoEmCurvas;
    private boolean estaComFarolLigado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getPrecisaoEmCurvas() {
        return precisaoEmCurvas;
    }

    public void setPrecisaoEmCurvas(int precisaoEmCurvas) {
        this.precisaoEmCurvas = precisaoEmCurvas;
    }

    public boolean isEstaComFarolLigado() {
        return estaComFarolLigado;
    }

    public void setEstaComFarolLigado(boolean estaComFarolLigado) {
        this.estaComFarolLigado = estaComFarolLigado;
    }

    public Veiculo(){

    }
    public Veiculo(int id, int velocidadeMaxima, int precisaoEmCurvas){
        this.id = id;
        this.velocidadeMaxima = velocidadeMaxima;
        this.precisaoEmCurvas = precisaoEmCurvas;
    }

    public void acelerar(int velocidadeAtual){
        System.out.println("Acelerando... A velocidade atual é de: " + velocidadeAtual);
    }
    public void desacelerar(int velocidadeAtual){
        for (int i = velocidadeAtual; i > 0; i--) {
            velocidadeAtual--;
        }
        System.out.println("Desacelerando... Velocidade atual é de: " + velocidadeAtual + "\n");
    }
    public void ligarFarol(){
        setEstaComFarolLigado(true);
        System.out.println("O farol foi ligado");
    }
    public abstract void utilizarHabilidadeEspecial();

}
