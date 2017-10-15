package is.ru.hugb;

import java.util.ArrayList;
import java.util.List;


public class StringCalculator {
	public static int Add(String numbers) {
		String delimiter = ",|n";
		String onlyNumbers = numbers;
		if(numbers.equals("/,n"))
			return 0;
		else if(numbers.startsWith("/")) {
			int delimiterIndex = numbers.indexOf("/") + 1;
			delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
			onlyNumbers = numbers.substring(numbers.indexOf("n") + 1);
		}
		return Add(onlyNumbers, delimiter);
	}

	public static int Add(String numbers, String delimiter) {
		int a = 0;
		String negatives = "";
		List negativeNumbers = new ArrayList();

		String[] values = numbers.split(delimiter);
		for(int i = 0; i < values.length; i++) {
			int testNumber = Integer.parseInt(values[i]);
			if(testNumber < 0){
				negativeNumbers.add(testNumber);
			}
			else if(testNumber <= 1000)
				a += testNumber;
		}
		if(negativeNumbers.size() > 0) {
			throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
		}
		return a;
	}
	public static void main(String[] args) {
		System.out.println(Add("/,n"));
		System.out.println(Add("/,n1"));
		System.out.println(Add("/,n1,2,3,4,5,6,7"));
		System.out.println(Add("/,n1,2"));
		System.out.println(Add("/,n1,2,3,4,1000,5,6"));
		System.out.println(Add("/,n1,2,3,1234,2,1,2"));
	}
}
