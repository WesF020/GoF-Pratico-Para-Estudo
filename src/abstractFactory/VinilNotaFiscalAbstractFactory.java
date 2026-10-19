package abstractFactory;
import model.VinilNotaFiscal;

public class VinilNotaFiscalAbstractFactory implements NotaFiscalAbstractFactory {

    @Override
    public VinilNotaFiscal createNotaFiscal() {
        return new VinilNotaFiscal();
    }
}
