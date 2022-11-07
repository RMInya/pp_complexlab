package functional;

public class userInfo {
        public static String mainWorkPlace = " main work place ", additionWorkPlace = " addition work place ",
                        royalties = " royalties ", soldItems = " sold items ", gotSurprise = " Surprise ",
                        gotFromAbroad = " abroad ",
                        gotChildBenefits = " child benefits ", materialHelp = " material help ";

        public static void anceteOutPut(addUserFunctional[] userFinances, int i) {
                System.out.println("\tUser Name" + userFinances[i].getName());
                output(userFinances[i].getmainWorkPlace(), mainWorkPlace,
                                userFinances[i].getmainWorkPlaceSum(),
                                userFinances[i].getmainWorkPlaceTax(), calculate.mainWorkPlaceTaxpercent);
                output(userFinances[i].getadditionWorkPlace(), additionWorkPlace,
                                userFinances[i].getadditionWorkPlaceSum(),
                                userFinances[i].getadditionWorkPlaceTax(), calculate.additionWorkPlaceTaxpercent);
                output(userFinances[i].getroyalties(), royalties,
                                userFinances[i].getroyaltiesSum(),
                                userFinances[i].getroyaltiesTax(), calculate.royaltiesTaxpercent);
                output(userFinances[i].getsoldItems(), soldItems,
                                userFinances[i].getsoldItemsSum(),
                                userFinances[i].getsoldItemsTax(), calculate.soldItemsTaxpercent);
                output(userFinances[i].getgotSurprise(), gotSurprise,
                                userFinances[i].getgotSurpriseSum(),
                                userFinances[i].getgotSurpriseTax(), calculate.gotSurpriseTaxpercent);
                output(userFinances[i].getgotFromAbroad(), gotFromAbroad,
                                userFinances[i].getgotFromAbroadSum(),
                                userFinances[i].getgotFromAbroadTax(), calculate.gotFromAbroadTaxpercent);
                output(userFinances[i].getgotChildBenefits(), gotChildBenefits,
                                userFinances[i].getgotChildBenefitsSum(),
                                userFinances[i].getgotChildBenefitsTax(), calculate.gotChildBenefitsTaxpercent);
                output(userFinances[i].getmaterialHelp(), materialHelp,
                                userFinances[i].getmaterialHelpSum(),
                                userFinances[i].getmaterialHelpTax(), calculate.materialHelpTaxpercent);
                System.out.println("Final Tax Sum is : " +
                                userFinances[i].getFinalTaxSum() + "$");
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
