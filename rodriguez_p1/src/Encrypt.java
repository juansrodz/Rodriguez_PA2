// Reads four-digit integers entered by the user and 
// encrypts.
// Encryption process:
//		Replace each digit 
//			1. By first adding 7 to it 
//			2. Get remainder by 10
// 			3. Swapping first with third
// 			4. Swapping second with fourth
//			5. Print encryption

import java.util.*;

public class Encrypt {
	
	public Encrypt() {
		// TODO Auto-generated constructor stub
	}
	
	public void Encryption(int data) {
		
		System.out.println("Inside Encryption!");
		
		Scanner in = new Scanner(System.in);
//		int data = 0;
		int fiDigit = 0;
		int seDigit = 0;
		int thDigit = 0;
		int ftDigit = 0;
		
		int tmp, tmp2;
		
		System.out.println("Enter four-digit number for encryption:");
		data = in.nextInt();
		
//		System.out.printf("Data:%d", data);
		
		ftDigit = ((data % 10) + 7) % 10;
 		thDigit = (((data % 100) / 10) + 7) % 10;
 		seDigit = (((data % 1000) / 100) + 7) % 10;
 		fiDigit = (((data % 10000) / 1000) + 7) % 10;
 		
//		System.out.printf("\nEncrypted before swap: %d%d%d%d", fiDigit, seDigit, thDigit, ftDigit);
		
		tmp = fiDigit;
		fiDigit = thDigit;
		thDigit = tmp;
		
		tmp2 = seDigit;
		seDigit = ftDigit;
		ftDigit = tmp2;
		
//		swap(fiDigit, thDigit);
//		swap(seDigit,ftDigit);
		
//		System.out.printf("\nEncrypted after swap: %d%d%d%d\n", fiDigit, seDigit, thDigit, ftDigit);
		System.out.printf("\nEncrypted: %d%d%d%d\n", fiDigit, seDigit, thDigit, ftDigit);
		in.close();
	}
	// My attempt at a swap method in Java, fail
	private static void swap(Integer a, Integer b){
		Integer tmp = a; a = b; b = tmp;
	}
}
