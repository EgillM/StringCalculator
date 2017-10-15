package is.ru.hugb;

import java.util.ArrayList;
import java.util.List;


public class StringCalculator {
	public static int Add(String numbers) {
		int a = 0;
		String negatives = "";
		List negativeNumbers = new ArrayList();
		if(numbers.equals(""))
			return 0;
		else {
			String[] values = numbers.split("\\n|,");
			for(int i = 0; i < values.length; i++) {
				int testNumber = Integer.parseInt(values[i]);
				if(testNumber < 0){
					negativeNumbers.add(testNumber);
				}
				else
					a += testNumber;
			}
			if(negativeNumbers.size() > 0) {
				throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
			}
		}
		return a;
	}
	public static void main(String[] args) {
		System.out.println(Add(""));
		System.out.println(Add("1,2,3"));
		System.out.println(Add("1,2,3,4,5,6\n7"));
		System.out.println(Add("1"));
		System.out.println(Add("1,2,3,-3,-2,-1,2"));
	}
}
