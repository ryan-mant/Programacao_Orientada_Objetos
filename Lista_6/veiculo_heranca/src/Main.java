public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(1,200,60);
        carro.setVelocidadeAtual(120);
        carro.acelerar(carro.getVelocidadeAtual());
        carro.utilizarHabilidadeEspecial();
        carro.ligarFarol();
        carro.desacelerar(carro.getVelocidadeAtual());

        Moto moto = new Moto(2, 210,90);
        moto.setVelocidadeAtual(100);
        moto.acelerar(moto.getVelocidadeAtual());
        moto.utilizarHabilidadeEspecial();
        moto.ligarFarol();
        moto.desacelerar(moto.getVelocidadeAtual());



    }
}