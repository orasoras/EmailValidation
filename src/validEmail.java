import java.util.Scanner;


public class validEmail {
	
	static boolean isValid(String email) {
		String regex = "\\w+\\@\\w+\\.\\w+";
	      return email.matches(regex);
	   }
	
	public static void main(String[] args) {
		System.out.println("Enter the number of emails you want to validate: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String [] arr = new String[n];
		int i = 1;
		int j = 0;
		
		while(n >0) {
			System.out.println("Enter email "+ i +": ");
			String st = sc.next();
			arr[j] = st;
			j++;
			n--;
			i++;	
		}//end while loop
		sc.close();
		StringBuilder sb = new StringBuilder();
		for (String s : arr) {
			 if(isValid(s)) {
				 sb.append(s);
				 sb.append("\n");
			 }
		 }
		
		if(sb.length() >0) {
			System.out.println("----- valid email(s) ----");
			System.out.println(sb);
		 }
		else {
			System.out.println("No valid email");
		}
		
		
	}
}
