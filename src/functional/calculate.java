package functional;


public class calculate {
    //відсоток податку
    public static int mainWorkPlaceTaxpercent = 18, additionWorkPlaceTaxpercent = 18, royaltiesTaxpercent = 10,
            soldItemsTaxpercent = 20,
            gotSurpriseTaxpercent = 2,
            gotFromAbroadTaxpercent = 10,
            gotChildBenefitsTaxpercent = 4, materialHelpTaxpercent = 5;
    // (% * a)/100

    public static int calulateTax(int i) {
        int a = ((mainWorkPlaceTaxpercent * addUserFunctional.howMuchMoney[i].getmainWorkPlaceSum()) / 100);
        addUserFunctional.howMuchMoney[i].setMainWorkPlaceTax(a);
        int b = ((additionWorkPlaceTaxpercent * addUserFunctional.howMuchMoney[i].getadditionWorkPlaceSum()) / 100);
        addUserFunctional.howMuchMoney[i].setAdditionWorkPlaceTax(b);
        int c = ((royaltiesTaxpercent * addUserFunctional.howMuchMoney[i].getroyaltiesSum()) / 100);
        addUserFunctional.howMuchMoney[i].setRoyaltiesTax(c);
        int d = ((soldItemsTaxpercent * addUserFunctional.howMuchMoney[i].getsoldItemsSum()) / 100);
        addUserFunctional.howMuchMoney[i].setSoldItemsTax(d);
        int e = ((gotSurpriseTaxpercent * addUserFunctional.howMuchMoney[i].getgotSurpriseSum()) / 100);
        addUserFunctional.howMuchMoney[i].setGotSurpriseTax(e);
        int f = ((gotFromAbroadTaxpercent * addUserFunctional.howMuchMoney[i].getgotFromAbroadSum()) / 100);
        addUserFunctional.howMuchMoney[i].setGotFromAbroadTax(f);
        int g = ((gotChildBenefitsTaxpercent * addUserFunctional.howMuchMoney[i].getgotChildBenefitsSum()) / 100);
        addUserFunctional.howMuchMoney[i].setGotChildBenefitsTax(g);
        int h = ((materialHelpTaxpercent * addUserFunctional.howMuchMoney[i].getmaterialHelpSum()) / 100);
        addUserFunctional.howMuchMoney[i].setMaterialHelpTax(h);

        return a + b + c + d + e + f + g + h;
    }
}
