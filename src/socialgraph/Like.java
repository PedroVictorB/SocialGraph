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
public class Like {
    private String key;
    private int count = 0;
    
    public Like(String key){
        this.key = key;
    }
    
    public void incrementCount(){
        this.setCount(this.getCount() + 1);
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }
    
}
