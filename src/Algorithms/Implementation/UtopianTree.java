package Algorithms.Implementation;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        Integer t = s.nextInt();
        
        for (int i = 0; i < t; i++) {
            Integer n = s.nextInt();
            
            if (n == 0) {
                System.out.println(1);
            } else {
                int j = 1;
                int result = 1;
                while (n > 0) {
                    if (j % 2 != 0) {
                        result = result * 2;
                    } else {
                        result = result + 1;
                    }
                    j++;
                    n--;
                }
                System.out.println(result);
            }
        }

        s.close();
	}

}
