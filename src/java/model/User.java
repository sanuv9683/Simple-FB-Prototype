/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Sanu Vithanage
 */
public class User {

    private String firstName;
    private String surName;
    private String email;
    private String password;
    private ArrayList<User> friends;
    private ArrayList<User> pendingRequests;
    private ArrayList<Messages> messageList;
   

    public User() {
    }

    public User(String firstName, String surName, String email, String password, ArrayList<User> friends, ArrayList<User> pendingRequests, ArrayList<Messages> messageList) {
        this.firstName = firstName;
        this.surName = surName;
        this.email = email;
        this.password = password;
        this.friends = friends;
        this.pendingRequests = pendingRequests;
        this.messageList = messageList;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the surName
     */
    public String getSurName() {
        return surName;
    }

    /**
     * @param surName the surName to set
     */
    public void setSurName(String surName) {
        this.surName = surName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the friends
     */
    public ArrayList<User> getFriends() {
        return friends;
    }

    /**
     * @param friends the friends to set
     */
    public void setFriends(ArrayList<User> friends) {
        this.friends = friends;
    }

    /**
     * @return the pendingRequests
     */
    public ArrayList<User> getPendingRequests() {
        return pendingRequests;
    }

    /**
     * @param pendingRequests the pendingRequests to set
     */
    public void setPendingRequests(ArrayList<User> pendingRequests) {
        this.pendingRequests = pendingRequests;
    }

    /**
     * @return the messageList
     */
    public ArrayList<Messages> getMessageList() {
        return messageList;
    }

    /**
     * @param messageList the messageList to set
     */
    public void setMessageList(ArrayList<Messages> messageList) {
        this.messageList = messageList;
    }

  

}
