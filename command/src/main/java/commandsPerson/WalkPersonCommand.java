package commandsPerson;

import command.Command;
import modelo.Person;

public class WalkPersonCommand implements Command {

    private Person person;

    public WalkPersonCommand(Person person) {
        this.person = person;
    }

    @Override
    public void execute() {
        person.walk();
    }
}
