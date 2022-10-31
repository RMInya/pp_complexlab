package main;

import command.*;
import reciever.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CommandDriver {

	public static void main(String args[]) throws IOException {
		Control control = new Control();
		menuCommands com = new menuCommands();
		Scanner sc = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter(new FileWriter("myFile.txt", false));    

		while (true) {
			BufferedReader reader = new BufferedReader(new FileReader("myFile.txt"));
			System.out.println("\t\t" + "MENU");
			System.out.println(
					"1: New User\n2: search  by\n3: Save current users into file\n4: Show all saved users\n0: exit");
			int ko = sc.nextInt();
			if (ko == 0) {
				break;
			}
			if (ko == 1) {
				control.setCommand(new addUser(com));
				control.press(writer, reader);
			}
			if (ko == 2) {
				control.setCommand(new search(com));
				control.press(writer, reader);
			}
			if(ko == 3) {
				control.setCommand(new writeToFile(com));
				control.press(writer, reader);
			}
			if(ko == 4) {
				control.setCommand(new readFromFile(com));
				control.press(writer, reader);
			}
		}
	}
}