/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package king.application;

/**
 *
 * @author xavierloera
 */
public class Reward {
    private String name;
    private int cost;
    private boolean earned;
    private int claims; 
    public void Reward(String name, int cost){
        this.name = name;
        this.cost = cost;
        earned = false;
        this.claims = 1;
            }
    public void Reward(String name, int cost,int claims){
        this.name = name;
        this.cost = cost;
        earned = false;
        this.claims = claims;
            }    
}
