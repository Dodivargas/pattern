package app;

import commandsPerson.JumpPersonCommand;
import modelo.Person;
import command.Command;
import commandsPerson.RunPersonCommand;
import commandsPerson.WalkPersonCommand;

public class Main {

    public static void main(String[] args) {

        Person person = new Person ("Douglas", 100);
        Command walk = new WalkPersonCommand(person);
        Command run = new RunPersonCommand(person);
        Command jump = new JumpPersonCommand(person);

        walk.execute();
        run.execute();
        jump.execute();

    }
}
