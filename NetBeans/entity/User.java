/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Administrator
 */
public class User {
    private int user_num;
    private String user_id;
    private String user_password;

    public int getUser_name() {
        return user_num;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getUser_password() {
        return user_password;
    }



    public void setUser_name(int user_num) {
        this.user_num = user_num;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
    
    
}
