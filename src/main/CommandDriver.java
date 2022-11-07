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
				addUser addUser = new addUser(com);
				addUser.execute(writer, reader);
			}
			if (ko == 2) {
				search search = new search(com);
				search.execute(writer, reader);
			}
			if(ko == 3) {
				writeToFile writeToFile = new writeToFile(com);
				writeToFile.execute(writer, reader);
			}
			if(ko == 4) {
				readFromFile readFromFile = new readFromFile(com);
				readFromFile.execute(writer, reader);
			}
		}
	}
}