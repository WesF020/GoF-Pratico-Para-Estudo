package observer;

import java.util.ArrayList;
import java.util.List;

public class Promocao implements Subject {
    private List<Observer> observers;
    private String produto;

    public Promocao() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(produto);
        }
    }

    public void adicionarPromocao(String produto) {
        this.produto = produto;
        notifyObservers();
    }

}
