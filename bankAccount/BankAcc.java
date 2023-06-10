package bankAccount;

public class BankAcc {
    private String maID;
    private String customerID;
    private String numberBank;
    private String codePIN;
    private int soDu;
    public BankAcc(String maID, String customerID, String numberBank, String codePIN, int soDu) {
        this.maID = maID;
        this.customerID = customerID;
        this.numberBank = numberBank;
        this.codePIN = codePIN;
        this.soDu = soDu;
    }
    public String getMaID() {
        return maID;
    }
    public void setMaID(String maID) {
        this.maID = maID;
    }
    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public String getNumberBank() {
        return numberBank;
    }
    public void setNumberBank(String numberBank) {
        this.numberBank = numberBank;
    }
    public String getCodePIN() {
        return codePIN;
    }
    public void setCodePIN(String codePIN) {
        this.codePIN = codePIN;
    }
    public int getSoDu() {
        return soDu;
    }
    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }
    public void deposit(int money){
        this.soDu += money;
    }
    public void withdraw(int tien){
        if(this.soDu - 50000 >= tien){
            this.soDu -= tien;
        }
    }
    public static int findPos(BankAcc[] a, String stk ){
        for(int i = 0; i <a.length; i++){
            if(a[i].numberBank.equals(stk)){
                return i;
            }
        }
    return -1;
    }
    public String toString(){
        return "ID : "  + this.maID + "\nCusID : " + this.customerID + "\nNumber : " + this.numberBank
        + "\nPIN : " + this.codePIN + "\nBalance : " + this.soDu + "VND\n-------------------";
    }
}
