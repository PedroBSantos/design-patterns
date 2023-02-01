package com.head.first;

import com.head.first.definition.ConcreteColleagueOne;
import com.head.first.definition.ConcreteColleagueOneMessage;
import com.head.first.definition.ConcreteColleagueTwo;
import com.head.first.definition.ConcreteColleagueTwoMessage;
import com.head.first.definition.MediatorImpl;

public class App {

    public static void main(String[] args) {
        var mediator = new MediatorImpl();
        var colleagueOne = new ConcreteColleagueOne(mediator);
        var colleagueTwo = new ConcreteColleagueTwo(mediator);
        mediator.addColleague(colleagueOne);
        mediator.addColleague(colleagueTwo);
        mediator.send(new ConcreteColleagueTwoMessage());
        mediator.send(new ConcreteColleagueOneMessage());
    }
}
