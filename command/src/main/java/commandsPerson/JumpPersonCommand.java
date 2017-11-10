package commandsPerson;

import command.Command;
import modelo.Person;

public class JumpPersonCommand implements Command {

    private Person person;

    public JumpPersonCommand(Person person) {
        this.person = person;
    }

    @Override
    public void execute() {
        person.jump();
    }
}
