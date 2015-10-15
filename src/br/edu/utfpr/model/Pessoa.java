package br.edu.utfpr.model;

import br.edu.utfpr.observer.Observer;

public abstract class Pessoa implements Observer {
    
    private String login;
    private String password;

    public Pessoa(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
