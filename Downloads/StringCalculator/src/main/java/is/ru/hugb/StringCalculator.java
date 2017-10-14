package is.ru.hugb;

public class StringCalculator {
	public static int Add(String numbers) {
		int a, b, c;
//		String values;
		if(numbers.equals(""))
			return 0;
		else {
			String[] values = numbers.split(",");
			a = Integer.parseInt(values[0]);
			if(values.length > 1) {
				b = Integer.parseInt(values[1]);
				a = a + b;
				if(values.length > 2) {
					c = Integer.parseInt(values[2]);
					a = a + c;
				}
			}
			return a;
		}
	}
	public static void main(String[] args) {
		System.out.println(Add(""));
		System.out.println(Add("1,2,3"));
		System.out.println(Add("1"));
	}
}
