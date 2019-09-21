// I tried to push the limits of the knowledge I know of 
// coding from C and used that to simplify my main 
// for this problem.
// I know this was what was ask but the formating for the code
// was not specifc so I took it upon myself to have fun so
// bare with me and my little understanding of Java.

import java.util.*;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encrypt encrypt = new Encrypt();
		Decrypt decrypt = new Decrypt();
		int data = 0;
		int encrypted = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to encrypt and decrypt!!");
		System.out.println("Please enter 1 to Encrypt and Please enter 2 to Decrypt:");
		int choice = in.nextInt();
		
		if (choice == 1) encrypt.Encryption(data);
		if (choice == 2) decrypt.Decryption(encrypted);				
	}
}
