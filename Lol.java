public class Lol extends Moba{
    //Atributos
    private String build;

    //Construtores
    public Lol(){

    }

    public Lol(String heroi, String poder, String build){
        super(heroi, poder);
        this.setBuild(build);
    }

    //Métodos Get e Set
    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    //Métodos
    public void confirmarJogo(){
        System.out.printf("O jogo escolhido foi o Lol, com o herói %s de poder %s e build: %s\n", this.getheroi(), this.getpoder(), this.getBuild());
    }
    
    public void trocarJogo(){
        System.out.println("Trocando para o jogo Cs2");
    }

    public String trocarHeroi(String heroi){
        System.out.printf("Trocando do herói %s para o herói %s\n", this.getheroi(), heroi);
        this.setheroi(heroi);
        return this.getheroi();
    }

    public void usarPoder(){
        System.out.printf("Usando o poder %s!\n", this.getpoder());
    }
}