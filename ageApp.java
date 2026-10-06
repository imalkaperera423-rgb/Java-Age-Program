public class AgeApp {
    public static void main(String[] args) {

        int age = 83;

        // Underage
        if (age > 0 && age < 18) {
            System.out.println("You are underage.");

            if (age >= 15) {
                System.out.println("You can drive a moped.");
            }
        }

        // Retired
        else if (age >= 65) {
            System.out.println("You are retired.");
        }

        // Adult
        else {
            System.out.println("You are an adult.");
        }

        // If age is exactly 18
        if (age == 18) {
            System.out.println("You can drive a car.");
        }

        // Anniversary Party
        if (age == 10 || age == 20 || age == 30 || age == 40 ||
            age == 50 || age == 60 || age == 70 || age == 80 ||
            age == 90 || age == 100 || age == 110 || age == 120) {

            System.out.println("Anniversary Party!!");
        }

        // 100 years old
        if (age == 100) {
            System.out.println("Congratulations!");
            System.out.println("Congratulations!");
            System.out.println("Congratulations!");
        }

        // Mid life
        //happy mid life
        if (age >= 40 && age <= 50) {
            System.out.println("Happy mid life!");
        }

        System.out.println("Press space to exit.");
    }
}