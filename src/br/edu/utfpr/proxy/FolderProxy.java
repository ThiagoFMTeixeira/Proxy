package br.edu.utfpr.proxy;

import br.edu.utfpr.model.Folder;
import br.edu.utfpr.model.Gerente;
import br.edu.utfpr.model.Pessoa;

public class FolderProxy implements IFolder {
    
    private Folder folder;
    private Pessoa pessoa;
    private static FolderProxy instance;

    private FolderProxy() {  
        folder = new Folder();
    }
    
    public static FolderProxy getInstance() {
        if ( instance == null ){
            instance = new FolderProxy();
        }
        
        return instance;
    }
    
    @Override
    public void doSomething() {
        if ((pessoa.getLogin().equals("root")
                && pessoa.getPassword().equals("123")) 
                || pessoa instanceof Gerente){            
            folder.add(pessoa);
            folder.doSomething();
        } 
        else {
            System.out.println("Warning :: Access denied!");
        }
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
 
}
