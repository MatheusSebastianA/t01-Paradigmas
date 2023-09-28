public abstract class Bebidas implements GameBar{
    //Atributos
    protected float preco, quantidadeML;

    //Construtores
    public Bebidas(){

    }

    public Bebidas(float preco, float quantidadeML){
        this.setPreco(preco);
        this.setquantidadeML(quantidadeML);
    }

    //Métodos Get e Set
    public float getPreco(){
        return preco;
    }

    public float getquantidadeML(){
        return quantidadeML;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public void setquantidadeML(float quantidadeML){
        this.quantidadeML = quantidadeML;
    }

    //Métodos
    public abstract void confirmarPedido();
    public abstract void adicionarGelo();

}
