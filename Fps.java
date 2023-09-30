public abstract class Fps implements Jogos{
    //Atributos
    protected String arma, mapa;

    //Construtores
    public Fps(){

    }

    public Fps(String arma, String mapa){
        this.setArma(arma);
        this.setMapa(mapa);
    }

    //Métodos Get e Set
    public String getArma() {
        return arma;
    }

    public String getMapa() {
        return mapa;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void setMapa(String mapa) {
        this.mapa = mapa;
    }

    //Métodos
    public abstract String trocarArma(String arma);
    public abstract String trocarMapa(String mapa);
}