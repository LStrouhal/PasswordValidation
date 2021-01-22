import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] arg) {
        String input = readInput();
        boolean output = amalgamateTests(input);
        while (!output) {
            input = readInput();
            output = amalgamateTests(input);
        }
    }


    public static String readInput() {
        System.out.println("Please define PW that contains more than 7 characters and at least one digit, one lower case and one upper case letter");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


    public static boolean amalgamateTests(String inputPW) {
        if (!passwordLengthCheck(inputPW)) {
            System.out.println("Your PW is too short.");
            return false;
        }
        if (!passwordNumberCheck(inputPW)) {
            System.out.println("Your PW does not contain numbers.");
            return false;
        }
        if (!passwordCapitalCheck(inputPW)) {
            System.out.println("Your PW does not contain upper case letters.");
            return false;
        }
        if (!passwordLowerCaseCheck(inputPW)) {
            System.out.println("Your PW does not contain lower case letters.");
            return false;
        }
        System.out.println("Your PW fulfills are requirements.");
        return true;
    }

    public static boolean passwordLengthCheck(String inputPW) {
        return inputPW.length() >= 7;
    }


    public static boolean passwordNumberCheck(String inputPW) {
        for (char c : inputPW.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }


    public static boolean passwordCapitalCheck(String inputPW) {
        for (char c : inputPW.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }


    public static boolean passwordLowerCaseCheck(String inputPW) {
        for (char c : inputPW.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

}




