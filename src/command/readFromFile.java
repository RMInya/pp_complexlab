package command;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import reciever.menuCommands;

public class readFromFile implements Command {
    menuCommands menu;

    public readFromFile(menuCommands menu) {
        this.menu = menu;
    }

    @Override
    public void execute(BufferedWriter writer, BufferedReader reader){
        try {
            menu.rread(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
