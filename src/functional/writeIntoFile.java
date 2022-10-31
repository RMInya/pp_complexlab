package functional;

import java.io.BufferedWriter;
import java.io.IOException;

public class writeIntoFile {

    public static void writeToFile(BufferedWriter writer) throws IOException {
        for (int i = 0; i < addUserFunctional.howMuchMoney.length; i++) {
            writer.write("\t\tUser Name: " + addUserFunctional.howMuchMoney[i].getName());
            writer.newLine();
            wrt(writer, addUserFunctional.isMoney[i].getmainWorkPlace(), userInfo.mainWorkPlace,
                    addUserFunctional.howMuchMoney[i].getmainWorkPlaceSum(),
                    addUserFunctional.howMuchMoney[i].getmainWorkPlaceTax(), calculate.mainWorkPlaceTaxpercent);
            wrt(writer, addUserFunctional.isMoney[i].getadditionWorkPlace(), userInfo.additionWorkPlace,
                    addUserFunctional.howMuchMoney[i].getadditionWorkPlaceSum(),
                    addUserFunctional.howMuchMoney[i].getadditionWorkPlaceTax(), calculate.additionWorkPlaceTaxpercent);
            wrt(writer, addUserFunctional.isMoney[i].getroyalties(), userInfo.royalties,
                    addUserFunctional.howMuchMoney[i].getroyaltiesSum(),
                    addUserFunctional.howMuchMoney[i].getroyaltiesTax(), calculate.royaltiesTaxpercent);
            wrt(writer, addUserFunctional.isMoney[i].getsoldItems(), userInfo.soldItems,
                    addUserFunctional.howMuchMoney[i].getsoldItemsSum(),
                    addUserFunctional.howMuchMoney[i].getsoldItemsTax(), calculate.soldItemsTaxpercent);
            wrt(writer, addUserFunctional.isMoney[i].getgotSurprise(), userInfo.gotSurprise,
                    addUserFunctional.howMuchMoney[i].getgotSurpriseSum(),
                    addUserFunctional.howMuchMoney[i].getgotSurpriseTax(), calculate.gotSurpriseTaxpercent);
            wrt(writer, addUserFunctional.isMoney[i].getgotFromAbroad(), userInfo.gotFromAbroad,
                    addUserFunctional.howMuchMoney[i].getgotFromAbroadSum(),
                    addUserFunctional.howMuchMoney[i].getgotFromAbroadTax(), calculate.gotFromAbroadTaxpercent);
            wrt(writer, addUserFunctional.isMoney[i].getgotChildBenefits(), userInfo.gotChildBenefits,
                    addUserFunctional.howMuchMoney[i].getgotChildBenefitsSum(),
                    addUserFunctional.howMuchMoney[i].getgotChildBenefitsTax(), calculate.gotChildBenefitsTaxpercent);
            wrt(writer, addUserFunctional.isMoney[i].getmaterialHelp(), userInfo.materialHelp,
                    addUserFunctional.howMuchMoney[i].getmaterialHelpSum(),
                    addUserFunctional.howMuchMoney[i].getmaterialHelpTax(), calculate.materialHelpTaxpercent);
            writer.write("Final Tax Sum is : " +
                    addUserFunctional.howMuchMoney[i].getFinalTaxSum() + "$");
            writer.newLine();
            writer.newLine();
        }
        System.out.println(" Users add successfully! ");
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
