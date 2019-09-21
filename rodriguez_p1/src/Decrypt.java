// Takes in a four-digit encrypted text and decrypts it to 
// its original number.
// It does so by reserving the encryption scheme used in the 
// class Encrypt. 

import java.util.*;

public class Decrypt {

	public Decrypt() {
		// TODO Auto-generated constructor stub
	}
	
	public void Decryption(int encrypted) {
		Scanner in = new Scanner(System.in);
		
		int fiDigit = 0;
		int seDigit = 0;
		int thDigit = 0;
		int ftDigit = 0;
		
		int tmp, tmp2;
		
		System.out.println("Enter four-digit number for decryption:");
		encrypted = in.nextInt();
		
		ftDigit = ((encrypted % 10) - 7);
 		thDigit = (((encrypted % 100) / 10) - 7);
 		seDigit = (((encrypted % 1000) / 100) - 7) + 10;
 		fiDigit = (((encrypted % 10000) / 1000) - 7) + 10;	
		
//		System.out.printf("\nEncrypted after before: %d%d%d%d\n", fiDigit, seDigit, thDigit, ftDigit);
	
		tmp = thDigit;
		thDigit = fiDigit;
		fiDigit = tmp;
		
		tmp2 = ftDigit;
		ftDigit = seDigit;
		seDigit = tmp2;
		
//		System.out.printf("\nEncrypted after swap: %d%d%d%d\n", fiDigit, seDigit, thDigit, ftDigit);
		System.out.printf("\nDecrypted: %d%d%d%d\n", fiDigit, seDigit, thDigit, ftDigit);
 		
		in.close();
	}
}
