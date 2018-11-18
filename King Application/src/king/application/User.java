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
public class User {
    private String password;
    private String username;
    private String name;
    private static int xp;
    private static int level;
    private static int next_level;
    public void User(String name,String username,String password){
        this.password = password;
        this.name = name;
        this.username = username;
        xp=0;
        level=1;
        next_level =100;
    }
    public static void XPgain(int x){
        xp += x;

    }
    public static void levelcheck(){
        if (xp > next_level){
            level +=1;
            xp = xp-next_level;
            next_level = 2 * next_level+next_level;
        }
    }
    
}
