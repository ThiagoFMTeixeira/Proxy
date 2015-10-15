package br.edu.utfpr.app;

import br.edu.utfpr.model.Funcionario;
import br.edu.utfpr.model.Gerente;
import br.edu.utfpr.model.Pessoa;
import br.edu.utfpr.proxy.FolderProxy;

public class App {

    public static void main(String[] args) {
        
        
        Pessoa funcionario = new Funcionario("root", "123");
        Pessoa gerente = new Gerente("joao", "123", "Vendas");
        
        FolderProxy fp = FolderProxy.getInstance();
        
        fp.setPessoa(funcionario);
        fp.doSomething();

        fp.setPessoa(gerente);
        fp.doSomething();        
        
   }
    
}
