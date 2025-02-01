package project3;

public class diff {

	public static void main(String[] args) {
	
		
		int upAsc = (int)'A';
		int lowAsc = (int)'a';
		int diff = upAsc - lowAsc;
		if(diff < 0) diff = -1 * diff;
	
		System.out.println(diff);
		Scanner sc = new Scanner(System.in);
		char ch;
		
		
		System.out.println("please enter a char");
		ch = sc.next().charAt(0);
		if( (ch >= 'A') &&(ch <='Z')) {
			ch = (char)(ch + diff);
			System.out.println("ch----->"+ch);
		}
		

	}

}