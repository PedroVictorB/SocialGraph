/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialgraph;

import java.util.ArrayList;

/**
 *
 * @author Pedro
 */
public class Pessoa {
    private String nome;
    private ArrayList<Post> posts;
    private ArrayList<Pessoa> listaDeAmigos;
    private ArrayList<Like> personLikeList;
    public boolean visitado = false;
    
    public Pessoa(String nome){
        this.nome = nome;
        this.posts = new ArrayList<>();
        this.listaDeAmigos = new ArrayList<>();
        this.personLikeList = new ArrayList<>();
    }
    
    public boolean friendLikedPost(Pessoa p){
        return this.posts.stream().anyMatch((post) -> (post.hasPessoa(p)));
    }
    
    public void adicionarPost(Post post){
        getPosts().add(post);
    }
    
    public void adicionarAmigo(Pessoa amigo){
        getListaDeAmigos().add(amigo);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the posts
     */
    public ArrayList<Post> getPosts() {
        return posts;
    }

    /**
     * @param posts the posts to set
     */
    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    /**
     * @return the listaDeAmigos
     */
    public ArrayList<Pessoa> getListaDeAmigos() {
        return listaDeAmigos;
    }

    /**
     * @param listaDeAmigos the listaDeAmigos to set
     */
    public void setListaDeAmigos(ArrayList<Pessoa> listaDeAmigos) {
        this.listaDeAmigos = listaDeAmigos;
    }

    /**
     * @return the likeList
     */
    public ArrayList<Like> getLikeList() {
        return personLikeList;
    }

    /**
     * @param likeList the likeList to set
     */
    public void setLikeList(ArrayList<Like> likeList) {
        this.personLikeList = likeList;
    }
    
}
