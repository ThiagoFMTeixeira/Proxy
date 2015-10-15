package br.edu.utfpr.model;

public class Gerente extends Pessoa {

    private String departamento;

    public Gerente(String login, String password, String departamento) {
        super(login, password);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void update() {
        System.out.println("A " + this.getClass() + " esta sendo notificada das alterações.");
    }

}
