package functional;
public class calculate {
    // відсоток податку
    public static int mainWorkPlaceTaxpercent = 18, additionWorkPlaceTaxpercent = 18, royaltiesTaxpercent = 10,
            soldItemsTaxpercent = 20,
            gotSurpriseTaxpercent = 2,
            gotFromAbroadTaxpercent = 10,
            gotChildBenefitsTaxpercent = 4, materialHelpTaxpercent = 5;
    // (% * a)/100

    public static void calulateTax(addUserFunctional userFinances[]) {
        for (int i = 0; i < userFinances.length; i++) {
            int a = ((mainWorkPlaceTaxpercent * userFinances[i].getmainWorkPlaceSum()) / 100);
            userFinances[i].setMainWorkPlaceTax(a);
            int b = ((additionWorkPlaceTaxpercent * userFinances[i].getadditionWorkPlaceSum()) / 100);
            userFinances[i].setAdditionWorkPlaceTax(b);
            int c = ((royaltiesTaxpercent * userFinances[i].getroyaltiesSum()) / 100);
            userFinances[i].setRoyaltiesTax(c);
            int d = ((soldItemsTaxpercent * userFinances[i].getsoldItemsSum()) / 100);
            userFinances[i].setSoldItemsTax(d);
            int e = ((gotSurpriseTaxpercent * userFinances[i].getgotSurpriseSum()) / 100);
            userFinances[i].setGotSurpriseTax(e);
            int f = ((gotFromAbroadTaxpercent * userFinances[i].getgotFromAbroadSum()) / 100);
            userFinances[i].setGotFromAbroadTax(f);
            int g = ((gotChildBenefitsTaxpercent * userFinances[i].getgotChildBenefitsSum()) / 100);
            userFinances[i].setGotChildBenefitsTax(g);
            int h = ((materialHelpTaxpercent * userFinances[i].getmaterialHelpSum()) / 100);
            userFinances[i].setMaterialHelpTax(h);
            int temp = a + b + c + d + e + f + g + h;
            userFinances[i].setFinalTaxSum(temp);
        }
    }
}
