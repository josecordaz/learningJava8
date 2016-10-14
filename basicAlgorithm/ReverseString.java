import java.util.Arrays;

class ReverseString {
	public static void main(String args[]){

		String cad = "This should be invested";

		String reverse = "";

		reverse = Arrays.asList(cad.split(""))
						.stream()
						.reduce("",(pv,cv)->cv+pv);

		System.out.println(reverse);
	}
}