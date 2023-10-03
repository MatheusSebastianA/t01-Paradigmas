import java.utils.*;

public class Principal{
    public static void main(String[] args) {
        Bebida b = new RefrigeranteCola (10, 500,  "Coca",  'L');
        Comida c = new SanduicheFrango ( "Brioche", true, true, false);
        Jogo j = new Cs2 ("Mirage","AK-47", "Lótus Selvagem");
        int precoTotal = 0;
        ArrayList<ProdutoGameBar> a = new ArrayList<ProdutoGameBar>();
        a.add(b);
        a.add(c);
        a.add(j);
        for (ProdutoGameBar p: a){
            precoTotal += p.calcularPreco();
        }
        System.out.printf("%d", precoTotal);
    }
}
