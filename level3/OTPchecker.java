import java.util.*;

class OTPchecker {

    // Method to generate a 6-digit OTP number using Math.random()
    static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000; 
    }

    // Method to ensure that the OTP numbers generated are unique
    static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; 
                }
            }
        }
        return true; // 
    }

    public static void main(String[] args) {
		
        // Array to save the OTP numbers generated 10 times
        int[] otps = new int[10];

        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        // Display the generated OTPs
        System.out.println("Generated OTPs: " + Arrays.toString(otps));

        // Validate if the OTPs are unique
        boolean unique = areOTPsUnique(otps);
        System.out.println("Are all generated OTPs unique? " + unique);
    }
}
