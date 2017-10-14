package is.ru.hugb;

public class StringCalculator {
	public static int Add(String numbers) {
		int a = 0;
//		String values;
		if(numbers.equals(""))
			return 0;
		else {
			String[] values = numbers.split(",");
			for(int i = 0; i < values.length; i++) {
				a += Integer.parseInt(values[i]);
			}
		}
		return a;
	}
	public static void main(String[] args) {
		System.out.println(Add(""));
		System.out.println(Add("1,2,3"));
		System.out.println(Add("1,2,3,4,5,6,7"));
		System.out.println(Add("1"));
	}
}
