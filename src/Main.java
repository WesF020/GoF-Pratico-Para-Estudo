import abstractFactory.NotaFiscalAbstractFactory;
import abstractFactory.VinilNotaFiscalAbstractFactory;
import factory.ProductStore;
import factory.VinilStore;
import model.NotaFiscal;
import model.Product;
import observer.Cliente;
import observer.Promocao;
import observer.Subject;
import singleton.StoreManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        NotaFiscalAbstractFactory nota = new VinilNotaFiscalAbstractFactory();
        ProductStore productStore = new VinilStore(nota);
        Cliente marcos = new Cliente("marcos");
        Cliente wesley = new Cliente("wesley");
        Promocao novaPromocao = new Promocao();
        Product product = productStore.orderProduct("vinil");

        novaPromocao.registerObserver(wesley);
        novaPromocao.adicionarPromocao("Hot Rats - Frank Zappa");
        StoreManager.getInstance().listSales();


    }
}