package functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import reciever.menuCommands;

public class searchUser {
    public static String[] arr1 = new String[menuCommands.userscout + 10];
    static int co;
    public static void searching() {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Select Search parameter 1: by Tax $; 2: by first name letter; 3: by Tax,reversed; 4: sort by Tax");
        int l = sc.nextInt();
        if (l == 1) {   //пошук за діапазоном фінальної суми податку
            userIn();
            emp();
        }
        if (l == 2) {   //пошук за 1 буквою імені
            userIn2();
            emp();
        }
        if (l == 3) {   //знайти всіх користовачів по фінальній сумі відсортованих з ріверсом
            System.out.println("Sorted by Tax Sum, reversed");
            List<addUserFunctional> sor = Arrays.asList(addUserFunctional.userFinances);
            sor.sort(Comparator.comparingInt(addUserFunctional::getFinalTaxSum).reversed());
            for (int i = 0; i < menuCommands.userscout; i++) {
                System.out.println((i + 1) + " | " + addUserFunctional.userFinances[i].getName() + " "
                        + addUserFunctional.userFinances[i].getFinalTaxSum() + " $");
            }
            sortmaybeFullInfo();
        }
        if (l == 4) {    //знайти всіх користовачів по фінальній сумі відсортованих 
            System.out.println("Sorted by Tax Sum");
            List<addUserFunctional> sor = Arrays.asList(addUserFunctional.userFinances);
            sor.sort(Comparator.comparingInt(addUserFunctional::getFinalTaxSum));
            for (int i = 0; i < menuCommands.userscout; i++) {
                System.out.println((i + 1) + " | " + addUserFunctional.userFinances[i].getName() + " "
                        + addUserFunctional.userFinances[i].getFinalTaxSum() + " $");
            }
            sortmaybeFullInfo();
        }
    }

    public static void userIn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("search parameter: (exmpl: 20 56)");
        int diapazone1 = sc.nextInt();
        int diapazone2 = sc.nextInt();
        co = 0;
        for (int i = 0; i < menuCommands.userscout; i++) {
            if (diapazone1 <= addUserFunctional.userFinances[i].getFinalTaxSum()
                    && diapazone2 >= addUserFunctional.userFinances[i].getFinalTaxSum()) {
                arr1[i] = addUserFunctional.userFinances[i].getName();
                co++;
                System.out.println((co+1) + ": Found User: " + addUserFunctional.userFinances[i].getName()
                + " his Tax Sum is " + addUserFunctional.userFinances[i].getFinalTaxSum() + " $");
            }
        }
    }

    public static void userIn2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select letter");
        char letter = sc.next().charAt(0);
        co = 0;
        for (int i = 0; i < menuCommands.userscout; i++) {
            String first = addUserFunctional.userFinances[i].getName();
            char comp = first.charAt(0);
            if (letter == comp) {
                arr1[i] = addUserFunctional.userFinances[i].getName();
                co++;
                System.out.println((co+1) + ": Found User: " + addUserFunctional.userFinances[i].getName()
                        + " his Tax Sum is " + addUserFunctional.userFinances[i].getFinalTaxSum() + " $");
            }
        }
    }

    public static void maybeFullInfo() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("select user to show fullInfo; 0 to stop");
            int temp1 = sc.nextInt();
            if (temp1 != 0 || temp1 > co) {
                int k = 0;
                while (arr1[temp1 - 1] != addUserFunctional.userFinances[k].getName()) {
                    k++;
                }
                userInfo.anceteOutPut(addUserFunctional.userFinances,k);
            } else {
                System.out.println("not searching index");
                break;
            }
        }
    }

    public static void sortmaybeFullInfo() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("select user to show fullInfo; 0 to stop");
            int temp1 = sc.nextInt();
            if (temp1 != 0 || temp1 > menuCommands.userscout) {
                userInfo.anceteOutPut(addUserFunctional.userFinances ,temp1 - 1);
            } else {
                System.out.println("not searching index");
                break;
            }
        }
    }

    public static void emp(){
        if(arr1[0] != null){
            maybeFullInfo();
            arr1 = new String[menuCommands.userscout + 10];
        } else {
            System.out.println("No users found");
        }
    }
}
