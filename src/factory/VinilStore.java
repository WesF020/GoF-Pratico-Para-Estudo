package factory;

import abstractFactory.NotaFiscalAbstractFactory;
import model.Product;
import model.Vinil;


public class VinilStore extends ProductStore {

    public VinilStore(NotaFiscalAbstractFactory nota) {
        super(nota);
    }

    @Override
    protected Product createProduct(String type) {

        if (type.equals("vinil")) {
            return new Vinil(nota);
        } else {
            return null;
        }
    }

}
