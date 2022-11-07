package functional;

import java.io.BufferedWriter;
import java.io.IOException;

public class writeIntoFile {

        public static void writeToFile(BufferedWriter writer) throws IOException {
                writ(writer, addUserFunctional.userFinances);
                System.out.println(" Users add successfully! ");
        }

        public static void writ(BufferedWriter writer, addUserFunctional[] userFinances) throws IOException {
                for (int i = 0; i < userFinances.length; i++) {
                        writer.write("\t\tUser Name: " + userFinances[i].getName());
                        writer.newLine();
                        wrt(writer, userFinances[i].getmainWorkPlace(), userInfo.mainWorkPlace,
                                        userFinances[i].getmainWorkPlaceSum(), userFinances[i].getmainWorkPlaceTax(),
                                        calculate.mainWorkPlaceTaxpercent);
                        wrt(writer, userFinances[i].getadditionWorkPlace(), userInfo.additionWorkPlace,
                                        userFinances[i].getadditionWorkPlaceSum(),
                                        userFinances[i].getadditionWorkPlaceTax(),
                                        calculate.additionWorkPlaceTaxpercent);
                        wrt(writer, userFinances[i].getroyalties(), userInfo.royalties,
                                        userFinances[i].getroyaltiesSum(),
                                        userFinances[i].getroyaltiesTax(), calculate.royaltiesTaxpercent);
                        wrt(writer, userFinances[i].getsoldItems(), userInfo.soldItems,
                                        userFinances[i].getsoldItemsSum(),
                                        userFinances[i].getsoldItemsTax(), calculate.soldItemsTaxpercent);
                        wrt(writer, userFinances[i].getgotSurprise(), userInfo.gotSurprise,
                                        userFinances[i].getgotSurpriseSum(),
                                        userFinances[i].getgotSurpriseTax(), calculate.gotSurpriseTaxpercent);
                        wrt(writer, userFinances[i].getgotFromAbroad(), userInfo.gotFromAbroad,
                                        userFinances[i].getgotFromAbroadSum(),
                                        userFinances[i].getgotFromAbroadTax(), calculate.gotFromAbroadTaxpercent);
                        wrt(writer, userFinances[i].getgotChildBenefits(), userInfo.gotChildBenefits,
                                        userFinances[i].getgotChildBenefitsSum(),
                                        userFinances[i].getgotChildBenefitsTax(), calculate.gotChildBenefitsTaxpercent);
                        wrt(writer, userFinances[i].getmaterialHelp(), userInfo.materialHelp,
                                        userFinances[i].getmaterialHelpSum(),
                                        userFinances[i].getmaterialHelpTax(), calculate.materialHelpTaxpercent);
                        writer.write("Final Tax Sum is : " +
                                        userFinances[i].getFinalTaxSum() + "$");
                        writer.newLine();
                        writer.newLine();
                }
        }

        public static void wrt(BufferedWriter writer, String string, String n, int sum, int total, int Tax)
                        throws IOException {
                String comp = "Yes";
                if (string.equals(comp)) {
                        writer.write("| From " + n + " you got " + sum
                                        + "$ | " + Tax + "% Tax is "
                                        + total + "$ |");
                        writer.newLine();
                        writer.flush();
                }
        }
}
