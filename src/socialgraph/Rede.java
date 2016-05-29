/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialgraph;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Pedro
 */
public class Rede {
    private ArrayList<Pessoa> listaDePessoas;
    
    public Rede(){
        this.listaDePessoas = new ArrayList<>();
    }
    
    public void adicionarPessoa(Pessoa pessoa){
        getListaDePessoas().add(pessoa);
    }
    
    public void removerPessoa(Pessoa pessoa){
        getListaDePessoas().remove(pessoa);
    }
    
    public Pessoa findPessoa(String nome){
        for (Pessoa p : getListaDePessoas()) {
            if(p.getNome().equals(nome)){
                return p;
            }
        }
        return null;
    }

    /**
     * @return the listaDePessoas
     */
    public ArrayList<Pessoa> getListaDePessoas() {
        return listaDePessoas;
    }

    /**
     * @param listaDePessoas the listaDePessoas to set
     */
    public void setListaDePessoas(ArrayList<Pessoa> listaDePessoas) {
        this.listaDePessoas = listaDePessoas;
    }
}
