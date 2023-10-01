public class RefrigeranteGuarana extends Refrigerantes{
    //Atributos
    private boolean diet; //
    
    //Construtores
    public RefrigeranteGuarana(){
        super();
    }

    public RefrigeranteGuarana(float preco, float mililitros, String marca, boolean diet){
        super(preco, mililitros, marca);
        this.setDiet(diet);
    }

    //Métodos Get e Set
    public boolean getDiet(){
        return diet;
    }
    
    public void setDiet(boolean diet){
        this.diet = diet;
    }


    //Métodos
    public void confirmarPedido(){
        System.out.print("O pedido foi um %s", this.marca);
        if(this.diet == true)
            System.out.print(" diet ");
        else
            System.out.print("não diet ");

        System.out.println("de %d mls. O preço é: %f", this.quantidadeML, this.preco);
    }

    public void adicionarGelo(){
        System.out.println("Adicionando gelo no Guaraná");
    }

    public void adicionarLaranja(){
        System.out.println("Adicionando laranja");
    }
}
