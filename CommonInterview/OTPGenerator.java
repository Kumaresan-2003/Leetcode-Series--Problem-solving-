import java.util.Random;

public class OTPGenerator {
    public static void main(String[] args) {
        // Generate a 4-digit OTP
        String otp = generateOTP(4);
        System.out.println("Your OTP is: " + otp);
    }

    public static String generateOTP(int length) {
        Random random = new Random();
        StringBuilder otp = new StringBuilder();

        for (int i = 0; i < length; i++) {
            // Generate a random digit from 0 to 9
            int digit = random.nextInt(10);
            otp.append(digit);
        }

        return otp.toString();
    }
}
