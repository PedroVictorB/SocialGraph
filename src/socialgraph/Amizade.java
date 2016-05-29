/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialgraph;

/**
 *
 * @author Pedro
 */
public class Amizade {
    private Pessoa pessoa1;
    private Pessoa pessoa2;
    
    public Amizade(Pessoa pessoa1, Pessoa pessoa2){
        this.pessoa1 = pessoa1;
        this.pessoa2 = pessoa2;
    }

    /**
     * @return the pessoa1
     */
    public Pessoa getPessoa1() {
        return pessoa1;
    }

    /**
     * @param pessoa1 the pessoa1 to set
     */
    public void setPessoa1(Pessoa pessoa1) {
        this.pessoa1 = pessoa1;
    }

    /**
     * @return the pessoa2
     */
    public Pessoa getPessoa2() {
        return pessoa2;
    }

    /**
     * @param pessoa2 the pessoa2 to set
     */
    public void setPessoa2(Pessoa pessoa2) {
        this.pessoa2 = pessoa2;
    }
}
