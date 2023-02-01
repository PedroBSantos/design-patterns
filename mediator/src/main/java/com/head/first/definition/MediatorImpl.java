package com.head.first.definition;

import java.util.HashSet;
import java.util.Set;

public class MediatorImpl implements Mediator {

    private Set<Colleague> colleagues;

    public MediatorImpl() {
        this.colleagues = new HashSet<>();
    }

    @Override
    public void send(Message message) {
        this.colleagues.forEach(colleague -> colleague.receive(message));
    }

    @Override
    public void addColleague(Colleague colleague) {
        if (colleague == null) {
            return;
        }
        this.colleagues.add(colleague);
    }
}
