package functional;

public class TaxGetters {
    public int mainWorkPlaceTax = 0, additionWorkPlaceTax = 0, royaltiesTax = 0, soldItemsTax = 0,
    gotSurpriseTax = 0,
    gotFromAbroadTax = 0,
    gotChildBenefitsTax = 0, materialHelpTax = 0, FinalTaxSum = 0;

    public void setFinalTaxSum(int n) {this.FinalTaxSum = n;} 
    public void setMainWorkPlaceTax(int mainWorkPlaceTax) {this.mainWorkPlaceTax = mainWorkPlaceTax;}
    public void setAdditionWorkPlaceTax(int additionWorkPlaceTax) {this.additionWorkPlaceTax = additionWorkPlaceTax;}
    public void setRoyaltiesTax(int royaltiesTax) { this.royaltiesTax = royaltiesTax;}
    public void setSoldItemsTax(int soldItemsTax) { this.soldItemsTax = soldItemsTax;}
    public void setGotSurpriseTax(int gotSurpriseTax) { this.gotSurpriseTax = gotSurpriseTax;}
    public void setGotFromAbroadTax(int gotFromAbroadTax) {this.gotFromAbroadTax = gotFromAbroadTax;}
    public void setGotChildBenefitsTax(int gotChildBenefitsTax) { this.gotChildBenefitsTax = gotChildBenefitsTax; }
    public void setMaterialHelpTax(int materialHelpTax) { this.materialHelpTax = materialHelpTax;}    

    public int getFinalTaxSum() {return this.FinalTaxSum;}
    public int getmainWorkPlaceTax() {return this.mainWorkPlaceTax;}
    public int getadditionWorkPlaceTax() { return this.additionWorkPlaceTax;}
    public int getroyaltiesTax() {return this.royaltiesTax;}
    public int getsoldItemsTax() {return this.soldItemsTax;}
    public int getgotSurpriseTax() {return this.gotSurpriseTax;}
    public int getgotFromAbroadTax() {return this.gotFromAbroadTax;}
    public int getgotChildBenefitsTax() {return this.gotChildBenefitsTax;}
    public int getmaterialHelpTax() {return this.materialHelpTax;}
    
}
