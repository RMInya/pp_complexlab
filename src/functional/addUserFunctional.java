package functional;

import reciever.menuCommands;

public class addUserFunctional {
    public String mainWorkPlace, additionWorkPlace, royalties, soldItems, gotSurprise, gotFromAbroad,
            gotChildBenefits, materialHelp, Name;
    public int mainWorkPlaceSum = 0, additionWorkPlaceSum = 0, royaltiesSum = 0, soldItemsSum = 0,
            gotSurpriseSum = 0,
            gotFromAbroadSum = 0,
            gotChildBenefitsSum = 0, materialHelpSum = 0, FinalTaxSum = 0;

    public int mainWorkPlaceTax = 0, additionWorkPlaceTax = 0, royaltiesTax = 0, soldItemsTax = 0,
            gotSurpriseTax = 0,
            gotFromAbroadTax = 0,
            gotChildBenefitsTax = 0, materialHelpTax = 0;
    public static addUserFunctional[] isMoney;
    public static addUserFunctional[] howMuchMoney;
    public static int counter = 0;

    public addUserFunctional(String mp, String ap, String ro, String si, String gs, String gfa,
            String gcb, String mh) {
        this.mainWorkPlace = mp;
        this.additionWorkPlace = ap;
        this.royalties = ro;
        this.soldItems = si;
        this.gotSurprise = gs;
        this.gotFromAbroad = gfa;
        this.gotChildBenefits = gcb;
        this.materialHelp = mh;
    }

    public addUserFunctional(int mps, int aps, int ros, int sis, int gss, int gfas,
            int gcbs, int mhs) {
        this.mainWorkPlaceSum = mps;
        this.additionWorkPlaceSum = aps;
        this.royaltiesSum = ros;
        this.soldItemsSum = sis;
        this.gotSurpriseSum = gss;
        this.gotFromAbroadSum = gfas;
        this.gotChildBenefitsSum = gcbs;
        this.materialHelpSum = mhs;
    }

    public void setName(String n) {this.Name = n;}
    public void setFinalTaxSum(int n) {this.FinalTaxSum = n;} 
    public void setMainWorkPlaceTax(int mainWorkPlaceTax) {this.mainWorkPlaceTax = mainWorkPlaceTax;}
    public void setAdditionWorkPlaceTax(int additionWorkPlaceTax) {this.additionWorkPlaceTax = additionWorkPlaceTax;}
    public void setRoyaltiesTax(int royaltiesTax) { this.royaltiesTax = royaltiesTax;}
    public void setSoldItemsTax(int soldItemsTax) { this.soldItemsTax = soldItemsTax;}
    public void setGotSurpriseTax(int gotSurpriseTax) { this.gotSurpriseTax = gotSurpriseTax;}
    public void setGotFromAbroadTax(int gotFromAbroadTax) {this.gotFromAbroadTax = gotFromAbroadTax;}
    public void setGotChildBenefitsTax(int gotChildBenefitsTax) { this.gotChildBenefitsTax = gotChildBenefitsTax; }
    public void setMaterialHelpTax(int materialHelpTax) { this.materialHelpTax = materialHelpTax;}

    public String getName() {return this.Name;}
    public String getmainWorkPlace() {return this.mainWorkPlace;}
    public String getadditionWorkPlace() {return this.additionWorkPlace;}
    public String getroyalties() {return this.royalties;}
    public String getsoldItems() {return this.soldItems;}
    public String getgotSurprise() {return this.gotSurprise;}
    public String getgotFromAbroad() {return this.gotFromAbroad;}
    public String getgotChildBenefits() {return this.gotChildBenefits;}
    public String getmaterialHelp() {return this.materialHelp;}
    public int getFinalTaxSum() {return this.FinalTaxSum;}
    public int getmainWorkPlaceTax() {return this.mainWorkPlaceTax;}
    public int getadditionWorkPlaceTax() { return this.additionWorkPlaceTax;}
    public int getroyaltiesTax() {return this.royaltiesTax;}
    public int getsoldItemsTax() {return this.soldItemsTax;}
    public int getgotSurpriseTax() {return this.gotSurpriseTax;}
    public int getgotFromAbroadTax() {return this.gotFromAbroadTax;}
    public int getgotChildBenefitsTax() {return this.gotChildBenefitsTax;}
    public int getmaterialHelpTax() {return this.materialHelpTax;}
    public int getmainWorkPlaceSum() {return this.mainWorkPlaceSum;}
    public int getadditionWorkPlaceSum() {return this.additionWorkPlaceSum;}
    public int getroyaltiesSum() {return this.royaltiesSum;}
    public int getsoldItemsSum() {return this.soldItemsSum;}
    public int getgotSurpriseSum() {return this.gotSurpriseSum;}
    public int getgotFromAbroadSum() {return this.gotFromAbroadSum;}
    public int getgotChildBenefitsSum() {return this.gotChildBenefitsSum;}
    public int getmaterialHelpSum() {return this.materialHelpSum;}


    public static void newClient(int temp) {
        howMuchMoney = new addUserFunctional[menuCommands.userscout];
        isMoney = new addUserFunctional[menuCommands.userscout];
        userAncete.ancete(temp);
        calculator();
    }

    public static void calculator() {
        for (int i = 0; i < menuCommands.userscout; i++) {
            int temp = calculate.calulateTax(i);
            howMuchMoney[i].setFinalTaxSum(temp);
        }
    }
}