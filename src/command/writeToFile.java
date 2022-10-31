package command;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import reciever.menuCommands;

public class writeToFile implements Command {
	menuCommands menu;

	public writeToFile(menuCommands menu) {
		this.menu = menu;
	}

	@Override
	public void execute(BufferedWriter writer, BufferedReader reader) {
        try {
            menu.wwrite(writer);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}