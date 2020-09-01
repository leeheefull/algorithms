package Repetition;

import java.util.Scanner;

public class Pyramid {
	
	public static void main(String[] args) {
		System.out.print("* Input number: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int cnt = n;
		
		for (int i = 0; i < n; i++){
			for (int j = 0; j < cnt; j++){
				if(j < cnt-2*i-1) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
			cnt++;
		}
		scanner.close();
	}
}

// output
/**********************
* Input number: 10
         *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
 *****************
*******************
***********************/