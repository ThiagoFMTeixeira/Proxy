package br.edu.utfpr.observer;

public interface Subject {
    
    
    public void add(Object o);
    public void remove(Object o);
    public void notifyObservers();
}
