package Algorithms.Warmup;

import java.util.Scanner;

public class SimplyArraySum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        Integer n = s.nextInt();
        Integer result = 0;
        if (n == 0) {
            System.out.println(result);
        } else {
            for (int i = 0; i < n; i++) {
                result = result + s.nextInt();
            }
            System.out.println(result);
        }
        s.close();

	}

}
