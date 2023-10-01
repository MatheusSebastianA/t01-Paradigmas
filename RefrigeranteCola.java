public class RefrigeranteCola extends Refrigerantes{
    //Atributos
    private char tipo; //L = latinha, V = vidro, P = Pet
    
    //Construtores
    public RefrigeranteCola(){
    }

    public RefrigeranteCola(float preco, int mililitros, String marca, char tipo){
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
        System.out.printf("O pedido foi uma %c de %s de %d mls. O preço é: %f\n", this.tipo, this.marca, this.quantidadeML, this.preco);
    }
    
    public void adicionarGelo(){
        System.out.printf("Adicionando gelo na Coca-Cola\n");
    }

    public void adicionarLimão(){
        System.out.printf("Adicionando limão na Coca-Cola\n");
    }
}
