import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        System.out.println("main started");
        Scanner scn = new Scanner(System.in);

        String exp_username = "vishwanath";
        String exp_password = "pooja";

        System.out.println("enter username");
        String input_username = scn.next();

        System.out.println("enter password");
        String input_password = scn.next();

        if (exp_username.equals(input_username) && exp_password.equals(input_password)) {
            System.out.println("login successful");
        } else {
            System.out.println("login failed");
        }
        System.out.println("main methode ended");
    }
}