package command;



import java.io.BufferedReader;
import java.io.BufferedWriter;

import reciever.menuCommands;

public class addUser implements Command {
	menuCommands menu;

	public addUser(menuCommands menu) {
		this.menu = menu;
	}

	@Override
	public void execute(BufferedWriter writer, BufferedReader reader) {
		menu.addNewUser();
	}
}