public abstract class Moba implements Jogos{
    //Atributos
    protected String heroi, poder;

    //Construtores
    public Fps(){

    }

    public Fps(String heroi, String poder){
        this.setheroi(heroi);
        this.setpoder(poder);
    }

    //Métodos Get e Set
    public String getheroi() {
        return heroi;
    }

    public String getpoder() {
        return poder;
    }

    public void setheroi(String heroi) {
        this.heroi = heroi;
    }

    public void setpoder(String poder) {
        this.poder = poder;
    }

    //Métodos
    public abstract String trocarHeroi(String heroi);
    public abstract void usarPoder();
}