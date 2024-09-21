import java.util.Scanner;//need for getting info from what user writes
import java.time.LocalTime;//importing time

public class Main {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();
        System.out.println("Hello world!");
        if (hour < 12) {
            System.out.println("Good morning! ☀️");
        } else if (hour < 18) {
            System.out.println("Good aftrenoon! 🌞");
        } else {
            System.out.println("Good evening! 🌚");
        }
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name:");

        String name = sc.nextLine();
        System.out.println(String.format("Hello, %s 🎉", name));

        System.out.println("Now enter your age:");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println(String.format("Your age is - %s", age));
            System.out.println("Wow! You are pretty young! 🦧");
        } else if (age < 45) {
            System.out.println(String.format("Your age is - %s", age));
            System.out.println("You're quite an adult! 😎");
        } else if (age < 80) {
            System.out.println(String.format("Your age is - %s", age));
            System.out.println("You're kinda old! 👴🏻");
        } else {
            System.out.println(String.format("Your age is - %s", age));
            System.out.println("Bro the hell are you even alive!?!? 💀");
        }
    }
}