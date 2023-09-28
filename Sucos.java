public abstract class Sucos extends Bebidas{
    //Atributos
    protected char tipo;//N = natural e P = poupa

    //Construtores
    public Sucos(){
        super();
    }

    public Sucos(float preco, float mililitros, char tipo){
        super(preco, mililitros);
        this.setTipo(tipo);
    }

    //Métodos Get e Set
    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        if(tipo == 'N' || tipo == 'P')
            this.tipo = tipo;
    }

    //Métodos
    public abstract void confirmarPedido();
    public abstract void adicionarGelo();

}