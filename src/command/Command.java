package command;

import java.io.BufferedReader;
import java.io.BufferedWriter;

public interface Command {
	public void execute(BufferedWriter writer, BufferedReader reader);
}