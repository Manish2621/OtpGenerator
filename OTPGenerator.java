import java.util.Random;

public class OTPGenerator {
    public static String generateOTP(int length) {
        String digits = "0123456789";
        Random random = new Random();
        StringBuilder otp = new StringBuilder();

        for (int i = 0; i < length; i++) {
            otp.append(digits.charAt(random.nextInt(digits.length())));
        }

        return otp.toString();
    }

    public static void main(String[] args) {
        System.out.println("Your OTP is: " + generateOTP(6));
    }
}
