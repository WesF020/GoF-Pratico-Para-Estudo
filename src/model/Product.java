package model;

import abstractFactory.NotaFiscalAbstractFactory;

public abstract class Product {

    protected NotaFiscalAbstractFactory nota;

    protected String name;
    protected Double price;

    public Product(NotaFiscalAbstractFactory nota) {
        this.nota = nota;
    }

    public void getProduct() {
        System.out.println("Product:" + name);
    }
    public void getPrice() {
        System.out.println("Price: R$ " + price);
    }
    public String getName() {return name;}

    public void printNotaFiscal() {
        System.out.println(nota.createNotaFiscal().applyNotaFiscal());
    }

}
