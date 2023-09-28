public class SucoAbacaxi extends Sucos{
    //Atributos
    private boolean coado;
    
    //Construtores
    public SucoAbacaxi(){
        super();
    }

    public SucoAbacaxi(float preco, float mililitros, char tipo, boolean coado){
        super(preco, mililitros, tipo);
        this.setCoado(coado);
    }

    //Métodos Get e Set
    public boolean getCoado(){
        return coado;
    }
    
    public void setCoado(boolean coado) {
        this.coado = coado;
    }

    //Métodos
    public void confirmarPedido(){
        System.out.print("O pedido foi um suco de abacaxi");

        if(this.tipo == 'N')
            System.out.print(" natural ");
        else if (this.tipo == 'P')
            System.out.print(" de poupa ");
        
        if(this.coado == true)
            System.out.print(" coado ");
        else
            System.out.print("não coado ");
            
        System.out.println("de %f mls. O preço é: %f", this.quantidadeML, this.preco);
        
    }

    public void adicionarGelo(){
        System.out.println("Adicionando gelo no suco de Abacaxi");
    }

    public void adicionarAçucar(){
        System.out.println("Adicionando açucar no suco de Abacaxi");
    }

    public void adicionarHortela(){
        System.out.println("Adicionando Hortelã no suco de Abacaxi");
    }

}