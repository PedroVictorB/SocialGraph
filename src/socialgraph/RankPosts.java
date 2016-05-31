/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialgraph;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 *
 * @author Pedro
 */
public class RankPosts {
    private String keyString;
    private HashMap<Integer, Integer> posts;
    
    public RankPosts(){
        this.posts = new HashMap<>();
    }
    
    public void addToHash(Post post){
        this.getPosts().put(post.getPostID(), post.getLikeList().size());
    }

    /**
     * @return the keyString
     */
    public String getKeyString() {
        return keyString;
    }

    /**
     * @param keyString the keyString to set
     */
    public void setKeyString(String keyString) {
        this.keyString = keyString;
    }

    /**
     * @return the posts
     */
    public HashMap<Integer, Integer> getPosts() {
        return posts;
    }

    /**
     * @param posts the posts to set
     */
    public void setPosts(HashMap<Integer, Integer> posts) {
        this.posts = posts;
    }
}
