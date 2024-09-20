import java.util.Scanner;//need for getting info from what user writes

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println(String.format("Hello, %s", name));
    }
}