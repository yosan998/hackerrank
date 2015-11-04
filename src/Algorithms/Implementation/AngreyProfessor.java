package Algorithms.Implementation;

import java.util.Scanner;

public class AngreyProfessor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        Integer t = s.nextInt();
        
        for (int i = 0; i < t; i++) {
            Integer n = s.nextInt();
            Integer k = s.nextInt();
            Integer result = 0;
            
            for (int j = 0; j < n; j++) {
                Integer a = s.nextInt();
                if (a <= 0) {
                    result++;
                }
            }
            
            if (result >= k) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            
        }
        
        s.close();
	}

}
