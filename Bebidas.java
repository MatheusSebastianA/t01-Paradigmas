public abstract class Bebidas implements ProdutoGameBar{
    //Atributos
    protected float preco;
    protected int quantidadeML;

    //Construtores
    public Bebidas(){

    }

    public Bebidas(float preco, int quantidadeML){
        this.setPreco(preco);
        this.setquantidadeML(quantidadeML);
    }

    //Métodos Get e Set
    public float getPreco(){
        return preco;
    }

    public int getquantidadeML(){
        return quantidadeML;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public void setquantidadeML(int quantidadeML){
        this.quantidadeML = quantidadeML;
    }

    //Métodos
    public abstract void confirmarPedido();
    public abstract void adicionarGelo();

}

