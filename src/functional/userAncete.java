package functional;

import java.util.Scanner;

public class userAncete {
    public static void ancete(int temp) {
        int x = 0;
        addUserFunctional.counter = 0;
        while (x < temp) {
            System.out.println("Client questionnaire: ");
            Scanner sc = new Scanner(System.in);
            String mp, ap, ro, si, gs, gfa, gcb, mh;
            int mps = 0, aps = 0, ros = 0, sis = 0, gss = 0, gfas = 0, gcbs = 0, mhs = 0;
            System.out.println("Hello what is your name?");
            String name = sc.nextLine();
            System.out.print("Do you have mainWorkPlace: Yes or No? ");
            mp = sc.nextLine();
            mps = check(mp, mps);
            System.out.print("Do you have additionalWorkPlace : Yes or No? ");
            ap = sc.nextLine();
            aps = check(ap, aps);
            System.out.print("Do you have royalties: Yes or No? ");
            ro = sc.nextLine();
            ros = check(ro, ros);
            System.out.print("Do you have soldItems: Yes or No? ");
            si = sc.nextLine();
            sis = check(si, sis);
            System.out.print("Do you have gotSurprise: Yes or No? ");
            gs = sc.nextLine();
            gss = check(gs, gss);
            System.out.print("Do you have gotFromAbroad: Yes or No? ");
            gfa = sc.nextLine();
            gfas = check(gfa, gfas);
            System.out.print("Do you have gotChildBenefits: Yes or No? ");
            gcb = sc.nextLine();
            gcbs = check(gcb, gcbs);
            System.out.print("Do you have materialHelp: Yes or No? ");
            mh = sc.nextLine();
            mhs = check(mh, mhs);
            addUserFunctional.userFinances[addUserFunctional.counter] = new addUserFunctional(mp, ap, ro, si, gs, gfa, gcb, mh);
            addUserFunctional.userFinances[addUserFunctional.counter] = new addUserFunctional(mps, aps, ros, sis, gss, gfas, gcbs, mhs);
            addUserFunctional.userFinances[addUserFunctional.counter].setName(name);
            addUserFunctional.counter++;
            x++;
        }       
    }
    
    public static int check(String word, int money) {
        Scanner sc = new Scanner(System.in);
        String comp = "Yes";
        if (word.equals(comp)) {
            System.out.print("How much money you got?: ");
            money = sc.nextInt();
            return money;
        } else {
            return money;
        }
    }
}
