package br.edu.utfpr.model;

import br.edu.utfpr.observer.Observer;
import br.edu.utfpr.observer.Subject;
import br.edu.utfpr.proxy.IFolder;
import java.util.ArrayList;

public class Folder implements IFolder, Subject {
    
    private ArrayList<Observer> aList;

    public Folder(ArrayList<Observer> aList) {
        this.aList = aList;
    }

    public Folder() {
        this.aList = new ArrayList<>();
    }
    
    
    @Override
    public void doSomething() {
        System.out.println("Realizando alterações na pasta.");
        this.notifyObservers();
    }

    @Override
    public void add(Object o) {
        this.aList.add((Observer) o);
    }

    @Override
    public void remove(Object o) {
        this.aList.remove((Observer) o);
    }

    @Override
    public void notifyObservers() {
        for (Observer obj : aList){
            obj.update();
        }
    }
    
}
