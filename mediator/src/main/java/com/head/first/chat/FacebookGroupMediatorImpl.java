package com.head.first.chat;

import java.util.HashSet;
import java.util.Set;

public class FacebookGroupMediatorImpl implements FacebookGroupMediator {

    private Set<User> users;

    public FacebookGroupMediatorImpl() {
        this.users = new HashSet<>();
    }

    @Override
    public void sendMessage(String message, User messageSender) {
        this.users.forEach(user -> {
            if (!user.equals(messageSender)) {
                user.receive(message);
            }
        });
    }

    public boolean addUser(User user) {
        return this.users.add(user);
    }
}
