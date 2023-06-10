package account;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Account [] a = new Account[n];
        for(int i = 0; i <n; i++){
            String id = scanner.nextLine();
            String cusID = scanner.nextLine();
            String user = scanner.nextLine();
            String pass = scanner.nextLine();
            a[i] = new Account(id, cusID, user, pass);
        }
        int q = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < q ;i++){
            String username = scanner.nextLine();
            String password = scanner.nextLine();
            boolean check = false;
            for(int j = 0; j < n; j++){
                if(a[j].checkLogin(username, password)){
                    check = true;
                    break;
                }
            }
            if(check){
                System.out.println("Login Successful");
            }else {
                System.out.println("Login Failed");
            }

        }

        
    }
    
}
