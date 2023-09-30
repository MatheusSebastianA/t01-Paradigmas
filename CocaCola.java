public class CocaCola extends Refrigerantes{
    //Atributos
    private char tipo; //L = latinha, V = vidro, P = Pet
    
    //Construtores
    public CocaCola(){
        super();
    }

    public CocaCola(float preco, float mililitros, String marca, char tipo){
        super(preco, mililitros, marca);
        this.setTipo(tipo);
    }

    //Métodos Get e Set
    public char getTipo(){
        return tipo;
    }
    
    public void setTipo(char tipo){
        if(tipo == 'L' || tipo == 'V' || tipo == 'P')
            this.tipo = tipo;
    }
    
    
    //Métodos
    public void confirmarPedido(){
        System.out.println("O pedido foi uma %c de %s de %f mls. O preço é: %f", this.tipo, this.marca, this.quantidadeML, this.preco);
    }
    
    public void adicionarGelo(){
        System.out.println("Adicionando gelo na Coca-Cola");
    }

    public void adicionarLimão(){
        System.out.println("Adicionando limão na Coca-Cola");
    }
}
