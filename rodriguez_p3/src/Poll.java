
import java.util.*;

public class Poll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] topics = new String[5];
		int[][] responses = new int[5][10];
		int voteTotal = 0;
		boolean done = false;

		float avg = 0.0; 
		
		Scanner in = new Scanner(System.in);
		
		topics[0] = "Political issues";
		topics[1] = "Global Enviromental issues";
		topics[2] = "Food";
		topics[3] = "Video Games";
		topics[4] = "Technological Advancements";
		
//		System.out.printf("%s\n", topics[2]);
		
		while(!done){
			System.out.println("Take my poll of 5 intesting topics, rate each one by one");
			System.out.println("Rate from 1 - 10 (1 being the lowest and 10 being the highest)");
			System.out.println("After the rating is done the result of the poll will show");
			System.out.println("Press 1 to take survey and Press 2 to exit");
			int choice = in.nextInt();
			int counter = 0;
			
			if (choice == 1) {
				System.out.printf("Rate topic: %s\n", topics[0]);
				counter = in.nextInt();
				responses[0][0] += counter;
				
				System.out.printf("Rate topic: %s\n", topics[1]);
				counter = in.nextInt();
				responses[1][1] += counter;
				
				System.out.printf("Rate topic: %s\n", topics[2]);
				counter = in.nextInt();
				responses[2][2] += counter;
				
				System.out.printf("Rate topic: %s\n", topics[3]);
				counter = in.nextInt();
				responses[3][3] += counter;
				
				System.out.printf("Rate topic: %s\n", topics[4]);
				counter = in.nextInt();
				responses[4][4] += counter;
				
			/*	for (int i = 0; i < 5; i++){
					if ()
				}
			*/
			}
			if(choice == 2) {
				done = true;
			}			
			System.out.println();
			
		}
		for (int i = 0; i < 5; i++)
		System.out.printf("Your response for topic %d.%s was %d\n", i + 1, topics[i] ,responses[i][i]);
		
		/*avg += responses[i][i];

		System.out.printf("The avg for the responses was ", avg)*/

	}
}
