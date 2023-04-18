import java.util.Random;

public class OtpGenerator {
	public static String generateOTP(int len) {  
	    String numbers = "0123456789";  
	    Random rd = new Random();  
	    char[] otp = new char[len];  
	    for (int i = 0; i < len; i++) {  
	        otp[i] = numbers.charAt(rd.nextInt(numbers.length()));  
	    }  
	    return new String(otp);  
	}  
	public static void main(String[] args) {
         System.out.println(generateOTP(5));
	}
}
