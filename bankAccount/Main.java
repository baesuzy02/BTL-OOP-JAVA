package bankAccount;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BankAcc[] accountList = new BankAcc[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            accountList[i] = new BankAcc(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        int q = sc.nextInt(); 
        for(int i = 0; i < q; i++){
            sc.nextLine();
            String tran = sc.nextLine();
            if(tran.equals("withdraw")){
                String taiKhoan = sc.next();
                int tien = sc.nextInt();
                int pos = BankAcc.findPos(accountList, taiKhoan);
                accountList[pos].withdraw(tien);
            }
            else if(tran.equals("deposit")){
                String taiKhoan = sc.next();
                int tien = sc.nextInt();
                int pos = BankAcc.findPos(accountList, taiKhoan);
                accountList[pos].deposit(tien);   
            }
            else{
                String X = sc.next();
                String Y = sc.next();
                int tien = sc.nextInt();
                int pos1 = BankAcc.findPos(accountList, X);
                int pos2 = BankAcc.findPos(accountList, Y);
                if(accountList[pos1].getSoDu() - 50000 >= tien){
                    accountList[pos1].withdraw(tien);
                    accountList[pos2].deposit(tien);
                }
            }
        }
        for(BankAcc x : accountList){
            System.out.println(x);
        }
    }
    
}
