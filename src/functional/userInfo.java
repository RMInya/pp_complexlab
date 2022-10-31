package functional;

public class userInfo {
    public static String mainWorkPlace = " main work place ", additionWorkPlace = " addition work place ",
            royalties = " royalties ", soldItems = " sold items ", gotSurprise = " Surprise ",
            gotFromAbroad = " abroad ",
            gotChildBenefits = " child benefits ", materialHelp = " material help ";

    public static void anceteOutPut(int i) {
        System.out.println("\tUser Name" + addUserFunctional.howMuchMoney[i].getName()); 
        output(addUserFunctional.isMoney[i].getmainWorkPlace(), mainWorkPlace,
                addUserFunctional.howMuchMoney[i].getmainWorkPlaceSum(),
                addUserFunctional.howMuchMoney[i].getmainWorkPlaceTax(), calculate.mainWorkPlaceTaxpercent);
        output(addUserFunctional.isMoney[i].getadditionWorkPlace(), additionWorkPlace,
                addUserFunctional.howMuchMoney[i].getadditionWorkPlaceSum(),
                addUserFunctional.howMuchMoney[i].getadditionWorkPlaceTax(), calculate.additionWorkPlaceTaxpercent);
        output(addUserFunctional.isMoney[i].getroyalties(), royalties,
                addUserFunctional.howMuchMoney[i].getroyaltiesSum(),
                addUserFunctional.howMuchMoney[i].getroyaltiesTax(), calculate.royaltiesTaxpercent);
        output(addUserFunctional.isMoney[i].getsoldItems(), soldItems,
                addUserFunctional.howMuchMoney[i].getsoldItemsSum(),
                addUserFunctional.howMuchMoney[i].getsoldItemsTax(), calculate.soldItemsTaxpercent);
        output(addUserFunctional.isMoney[i].getgotSurprise(), gotSurprise,
                addUserFunctional.howMuchMoney[i].getgotSurpriseSum(),
                addUserFunctional.howMuchMoney[i].getgotSurpriseTax(), calculate.gotSurpriseTaxpercent);
        output(addUserFunctional.isMoney[i].getgotFromAbroad(), gotFromAbroad,
                addUserFunctional.howMuchMoney[i].getgotFromAbroadSum(),
                addUserFunctional.howMuchMoney[i].getgotFromAbroadTax(), calculate.gotFromAbroadTaxpercent);
        output(addUserFunctional.isMoney[i].getgotChildBenefits(), gotChildBenefits,
                addUserFunctional.howMuchMoney[i].getgotChildBenefitsSum(),
                addUserFunctional.howMuchMoney[i].getgotChildBenefitsTax(), calculate.gotChildBenefitsTaxpercent);
        output(addUserFunctional.isMoney[i].getmaterialHelp(), materialHelp,
                addUserFunctional.howMuchMoney[i].getmaterialHelpSum(),
                addUserFunctional.howMuchMoney[i].getmaterialHelpTax(), calculate.materialHelpTaxpercent);
        System.out.println("Final Tax Sum is : " +
                addUserFunctional.howMuchMoney[i].getFinalTaxSum() + "$");
    }

    public static void output(String string, String n, int sum, int total, int Tax) {
        String comp = "Yes";
        if (string.equals(comp)) {
            System.out.println("----------------------------------------------------");
            System.out.println("| From " + n + " you got " + sum
                    + "$ | " + Tax + "% Tax is "
                    + total + "$ |");
            System.out.println("----------------------------------------------------");
        }
    }
}
