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
public class Messages {
    private String from;
    private String to;
    private ArrayList<String> messages;

    public Messages() {
    }

    public Messages(String from, String to, ArrayList<String> messages) {
        this.from = from;
        this.to = to;
        this.messages = messages;
    }

    /**
     * @return the from
     */
    public String getFrom() {
        return from;
    }

    /**
     * @param from the from to set
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * @return the to
     */
    public String getTo() {
        return to;
    }

    /**
     * @param to the to to set
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * @return the messages
     */
    public ArrayList<String> getMessages() {
        return messages;
    }

    /**
     * @param messages the messages to set
     */
    public void setMessages(ArrayList<String> messages) {
        this.messages = messages;
    }
    
    
}
