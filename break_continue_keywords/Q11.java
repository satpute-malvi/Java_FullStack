package break_continue_keywords;

// 1 to 100 using both continue and break print 1-25, skip 26-75 and again print 76 to 100

public class Q11 {

	public static void main(String[] args) {
		
		System.out.println("<---------------- Using continue------------->");
		for(int i = 1; i <= 100; i++) {
			if (i >= 26 && i <= 75) {
				continue;
			}
			System.out.println(i);
		}

		System.out.println("<---------------- Using break------------->");
		int i;
		for(i = 1; i <= 100; i++) {
			if (i == 25) {
				break;
			}
			System.out.println(i);
		}
		for(i = 76; i <= 100; i++) {
			if(i < 76) {
				break;
			}
			System.out.println(i);
		}
	}

}
