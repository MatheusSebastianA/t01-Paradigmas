public abstract class Refrigerante extends Bebidas{
    //Atributos
    protected String marca;// Coca ou Guarana

    //Construtores
    public Refrigerante(){
        super();
    }

    public Refrigerante(float preco, float mililitros, String marca){
        super(preco, mililitros);
        this.setMarca(marca);
    }

    //Métodos Get e Set
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    //Métodos
    public abstract void confirmarPedido();
    public abstract void adicionarGelo();

}