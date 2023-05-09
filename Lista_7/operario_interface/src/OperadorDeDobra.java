public class OperadorDeDobra implements Operario{
    private String nome;
    private String areaDeServico;
    private int intervalo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaDeServico() {
        return areaDeServico;
    }

    public void setAreaDeServico(String areaDeServico) {
        this.areaDeServico = areaDeServico;
    }

    public int getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(int intervalo) {
        this.intervalo = intervalo;
    }

    public OperadorDeDobra(){

    }
    public OperadorDeDobra(String nome, String areaDeServico, int intervalo){
        this.nome = nome;
        this.areaDeServico = areaDeServico;
        this.intervalo = intervalo;
    }


    @Override
    public void trabalhar() {
        System.out.println("O " + getNome() + " da area de: " + getAreaDeServico() + ". Começou seu expediente: dobra*, dobra*, dobra*. E foi almoçar por "
                + getIntervalo() + " minutos");
    }
}
