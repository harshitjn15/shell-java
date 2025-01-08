import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        while (true) {
            System.out.print("$ ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("exit 0")) {
                scanner.close();
                break;
            }
            if (input.startsWith("echo")) {
                System.out.println(input.substring(5));
            } else if (input.startsWith("type")) {
                String inputType = input.substring(5);
                switch (inputType) {
                    case "exit":
                    case "echo":
                    case "type":
                        System.out.println(inputType + " is a shell builtin");
                        break;

                    default:
                        System.out.println(inputType + ": not found");
                        break;
                }
            } else {
                System.out.println(input + ": command not found");
            }
        }
    }
}
