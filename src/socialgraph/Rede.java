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
    private ArrayList<Amizade> listaDeAmizades;
    private ArrayList<RankPosts> rankDePosts;

    public Rede() {
        this.listaDePessoas = new ArrayList<>();
        this.listaDeAmizades = new ArrayList<>();
        this.rankDePosts = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        getListaDePessoas().add(pessoa);
    }

    public void adicionarAmizade(Pessoa pessoa1, Pessoa pessoa2) {
        getListaDeAmizades().add(new Amizade(pessoa1, pessoa2));
    }

    public void adicionarRankPost(String key, Post p) {
        for (RankPosts rp : getRankDePosts()) {
            if(rp.getKeyString().equals(key)){
                rp.addToHash(p);
                return;
            }
        }
        RankPosts rank = new RankPosts();
        rank.setKeyString(key);
        rank.addToHash(p);
        rankDePosts.add(rank);
    }
    
    public Pessoa findPessoaPost(Integer postID){
        for(Pessoa p : this.getListaDePessoas()){
            for(Post post : p.getPosts()){
                if(post.getPostID() == postID){
                    return p;
                }
            }
        }
        return null;
    }

    public void removerPessoa(Pessoa pessoa) {
        getListaDePessoas().remove(pessoa);
    }

    public Pessoa findPessoa(String nome) {
        for (Pessoa p : getListaDePessoas()) {
            if (p.getNome().equals(nome)) {
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

    /**
     * @return the listaDeAmizades
     */
    public ArrayList<Amizade> getListaDeAmizades() {
        return listaDeAmizades;
    }

    /**
     * @param listaDeAmizades the listaDeAmizades to set
     */
    public void setListaDeAmizades(ArrayList<Amizade> listaDeAmizades) {
        this.listaDeAmizades = listaDeAmizades;
    }

    /**
     * @return the rankDePosts
     */
    public ArrayList<RankPosts> getRankDePosts() {
        return rankDePosts;
    }

    /**
     * @param rankDePosts the rankDePosts to set
     */
    public void setRankDePosts(ArrayList<RankPosts> rankDePosts) {
        this.rankDePosts = rankDePosts;
    }
}
