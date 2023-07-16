package view.commands;

import view.ConsoleUI;

public class AddHuman {
    private String description;
    private ConsoleUI consoleUI;

    public AddHuman(ConsoleUI consoleUI) {
        super(consoleUI, "Добавить нового человека");
    }

    public void execute() { 
        consoleUI.addHuman();
    }
}
