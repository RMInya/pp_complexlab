package command;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import reciever.menuCommands;

public class search implements Command {
    menuCommands menu;

    public search(menuCommands menu) {
        this.menu = menu;
    }

    @Override
    public void execute(BufferedWriter writer, BufferedReader reader) {
        menu.search();
    }
}
