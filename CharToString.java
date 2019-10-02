import java.util.Scanner;

public class CharToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char [] array = {scanner.next().charAt(0), scanner.next().charAt(0), scanner.next().charAt(0)};

        System.out.println(array);
    }
}
