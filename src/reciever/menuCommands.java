package reciever;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
import functional.*;

public class menuCommands {
    public static int userscout;
    Scanner sc = new Scanner(System.in);

    public void addNewUser() {
        System.out.print("how many users will you have?");
        userscout = sc.nextInt();
        addUserFunctional.newClient(userscout);
    }

    public void search() {
       searchUser.searching();
    }

    public void wwrite(BufferedWriter writer) throws IOException {
        writeIntoFile.writeToFile(writer);
    }

    public void rread(BufferedReader reader) throws IOException {
        fileReader.fileRead(reader);
    }
}