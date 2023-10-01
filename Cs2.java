public class Cs2 extends Fps{
    //Atributos
    private String inventario;

    //Construtores
    public Cs2(){

    }

    public Cs2(String arma, String mapa, String inventario){
        super(arma, mapa);
        this.setInventario(inventario);
    }

    //Métodos Get e Set
    public String getInventario() {
        return inventario;
    }

    public void setInventario(String inventario) {
        this.inventario = inventario;
    }

    //Métodos
    public void confirmarJogo(){
        System.out.printf("O jogo escolhido foi o Cs2, no mapa %s com a arma %s e com o inventario: %s\n", this.getMapa(), this.getArma(), this.getInventario());
    }
    
    public void trocarJogo(){
        System.out.println("Trocando para o jogo Lol");
    }

    public String trocarArma(String arma){
        System.out.printf("Trocando da arma %s para a arma %s\n", this.getArma(), arma);
        this.setArma(arma);
        return this.getArma();
    }
    public String trocarMapa(String mapa){
        System.out.printf("Trocando do mapa %s para o mapa %s\n", this.getMapa(), mapa);
        this.setMapa(mapa);
        return this.getMapa();
    }

}