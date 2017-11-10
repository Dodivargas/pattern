package commandsPerson;

import command.Command;
import modelo.Person;

public class RunPersonCommand implements Command {

    private Person person;


    public RunPersonCommand(Person person) {
        this.person = person;
    }


    @Override
    public void execute() {
        person.run();
    }
}
