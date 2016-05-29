/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialgraph;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Pedro
 */
public class Post {
    private ArrayList<String> keyList;
    private ArrayList<Pessoa> likeList;
    
    public Post(){
        this.keyList = new ArrayList<>();
        this.likeList = new ArrayList<>();
    }
    
    public void adicionarKey(String str){
        getKeyList().add(str);
    }
    
    public void removerKey(String str){
        getKeyList().remove(str);
    }
    
    public boolean hasKey(String str){
        return getKeyList().contains(str);
    }
    
    public void like(Pessoa pessoa){
        getLikeList().add(pessoa);
    }
    
    public void unlike(Pessoa pessoa){
        getLikeList().remove(pessoa);
    }

    /**
     * @return the keyList
     */
    public ArrayList<String> getKeyList() {
        return keyList;
    }

    /**
     * @param keyList the keyList to set
     */
    public void setKeyList(ArrayList<String> keyList) {
        this.keyList = keyList;
    }

    /**
     * @return the likeList
     */
    public ArrayList<Pessoa> getLikeList() {
        return likeList;
    }

    /**
     * @param likeList the likeList to set
     */
    public void setLikeList(ArrayList<Pessoa> likeList) {
        this.likeList = likeList;
    }
    
}
