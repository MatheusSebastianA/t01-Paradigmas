public class SucoMorango extends Sucos{
    //Atributos
    private boolean comLeite;
    
    //Construtores
    public SucoMorango(){
        super();
    }

    public SucoMorango(float preco, float mililitros, char tipo, boolean comLeite){
        super(preco, mililitros, tipo);
        this.setcomLeite(comLeite);
    }

    //Métodos Get e Set
    public boolean getcomLeite(){
        return comLeite;
    }
    
    public void setcomLeite(boolean comLeite) {
        this.comLeite = comLeite;
    }


    //Métodos
    public void confirmarPedido(){
        System.out.print("O pedido foi um suco de morango");
        if(this.tipo == 'N')
            System.out.print(" natural");
        else if (this.tipo == 'P')
            System.out.print(" de poupa");

        if(this.comLeite == true)
            System.out.print(" com leite ");
        else
            System.out.print(" sem leite ");

        System.out.println("de %f mls. O preço é: %f", this.quantidadeML, this.preco);
    }
    
    public void adicionarGelo(){
        System.out.println("Adicionando gelo no suco de morango");
    }

    public void adicionarAcucar(){
        System.out.println("Adicionando açucar");
    }

    public void adicionarLaranja(){
        System.out.println("Adicionando Laranja");
    }
    
}
