package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import command.Command;

public class Control {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void press(BufferedWriter writer, BufferedReader reader){
        command.execute(writer, reader);
    }
}
