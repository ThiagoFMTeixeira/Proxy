package br.edu.utfpr.model;

public class Funcionario extends Pessoa {

    public Funcionario(String login, String password) {
        super(login, password);
    }

    @Override
    public void update() {
        System.out.println("A " + this.getClass() + " esta sendo notificada das alterações.");
    }
    
}
