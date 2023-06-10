package students2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
         ArrayList<Students> sv = new ArrayList<>();
         for(int i = 0; i < n; i++){
            scanner.nextLine();
            Students sv2 = new Students(i+1, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextDouble());
            sv.add(sv2);
         }
         for(int i = 0; i < sv.size(); i++){
            System.out.println(sv.get(i).toString());
         }

    }
    
}
