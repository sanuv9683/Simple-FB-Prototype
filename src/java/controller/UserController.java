/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Messages;
import model.User;

/**
 *
 * @author Sanu Vithanage
 */
public class UserController {

    private ArrayList<User> userList;
    //  private ArrayList frndList;

    public UserController(ArrayList<User> userList) {
        this.userList = userList;
    }

    public boolean registerUser(String firstName, String lastName, String email, String password) {
        if (!checkUserExits(email)) {
            ArrayList<User> friends = new ArrayList<>();
            ArrayList<User> alPendingFriends = new ArrayList<>();
            ArrayList<Messages> messageList = new ArrayList<>();
            User newUser = new User(firstName, lastName, email, password, friends, alPendingFriends, messageList);
            userList.add(newUser);
            return true;
        }
        return false;
    }

    public boolean checkUserExits(String email) {
        return (searchUser(email) != null);
    }

    public User searchUser(String email) {
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public void sendFriendRequest(User to, User from) {

        // Check whether we already have sent the request
        if (!to.getPendingRequests().contains(from) && !to.getFriends().contains(from)) {
            to.getPendingRequests().add(from);
        }

    }

    public void accepetFriendRequest(User from, User accept) {

        // Check whether the "accepet" friend in the Friend request list
        if (from.getPendingRequests().contains(accept)) {

            from.getPendingRequests().remove(accept);

            accept.getFriends().add(from);
            from.getFriends().add(accept);

        }

    }

    public void SendMessage(User to, User from, String message) {
        String toUser = to.getEmail();
        String fromTo = from.getEmail();
        ArrayList<String> mes = new ArrayList<String>();
        mes.add(message);
        Messages newMessages = new Messages(fromTo, toUser, mes);
        to.getMessageList().add(newMessages);
        from.getMessageList().add(newMessages);

    }

}
