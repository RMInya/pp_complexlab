package functional;

import reciever.menuCommands;

public class addUserFunctional extends TaxGetters {
    private String mainWorkPlace, additionWorkPlace, royalties, soldItems, gotSurprise, gotFromAbroad,
            gotChildBenefits, materialHelp, Name;

    private int mainWorkPlaceSum = 0, additionWorkPlaceSum = 0, royaltiesSum = 0, soldItemsSum = 0,
            gotSurpriseSum = 0,
            gotFromAbroadSum = 0,
            gotChildBenefitsSum = 0, materialHelpSum = 0;

    public static addUserFunctional[] userFinances;
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
    public String getName() {return this.Name;}
    public String getmainWorkPlace() {return this.mainWorkPlace;}
    public String getadditionWorkPlace() {return this.additionWorkPlace;}
    public String getroyalties() {return this.royalties;}
    public String getsoldItems() {return this.soldItems;}
    public String getgotSurprise() {return this.gotSurprise;}
    public String getgotFromAbroad() {return this.gotFromAbroad;}
    public String getgotChildBenefits() {return this.gotChildBenefits;}
    public String getmaterialHelp() {return this.materialHelp;}
    
    public int getmainWorkPlaceSum() {return this.mainWorkPlaceSum;}
    public int getadditionWorkPlaceSum() {return this.additionWorkPlaceSum;}
    public int getroyaltiesSum() {return this.royaltiesSum;}
    public int getsoldItemsSum() {return this.soldItemsSum;}
    public int getgotSurpriseSum() {return this.gotSurpriseSum;}
    public int getgotFromAbroadSum() {return this.gotFromAbroadSum;}
    public int getgotChildBenefitsSum() {return this.gotChildBenefitsSum;}
    public int getmaterialHelpSum() {return this.materialHelpSum;}


    public static void newClient(int temp) {
        userFinances = new addUserFunctional[menuCommands.userscout];
        userAncete.ancete(temp);
        calculate.calulateTax(userFinances);
    }
}