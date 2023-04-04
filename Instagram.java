import java.util.Scanner;
/*this program is written by using constructor overloading methode
  in single class we can use n number of constructor but we need to follows some rules to write constructor
  *constructor must be same as class name
  *for each constructor paameters should be change
  *or constructor paramaters sequence should be change
  *defining more than one constructor in class  is called  constructor overloading
*/

class Instagram {
    // attributes of the given object
    String uname;
    String password;
    long phoneno;
    String email;

    // this is constructor
    Instagram(String arg1, String arg2, String arg3) {
        uname = arg1;
        password = arg1;
        email = arg1;

    }

    // this is also a constructor
    Instagram(String arg1, String arg2, Long arg3) {
        uname = arg1;
        password = arg2;
        phoneno = arg3;
    }

    // this is methode or function
    void display() {
        System.out
                .println("username  " + uname + "  pass  " + password + "  phoneno  " + phoneno + "  email  " + email);
    }

}

class Mainclass {
    public static void main(String[] args) {
        System.out.println("main methode started");

        Scanner scn1 = new Scanner(System.in);

        System.out.println("enter1-login through emailid");
        System.out.println("ente2-login through phoneno");
        int choice = scn1.nextInt();

        // used if condition for checking the login condition
        if (choice == 1) {
            System.out.println("enter username");
            String uname = scn1.next();

            System.out.println("enter pass");
            String pass = scn1.next();

            System.out.println("enater emailid");
            String email = scn1.next();

            Instagram i1 = new Instagram(uname, pass, email);
            i1.display();
        }
        // used this condition for to login with phoneno
        else if (choice == 2) {
            System.out.println("enter username");
            String uname = scn1.next();

            System.out.println("enter pass");
            String pass = scn1.next();

            System.out.println("enter phoneno");
            long phonno = scn1.nextLong();

            // object creation
            Instagram i1 = new Instagram(uname, pass, phonno);
            i1.display();
        } else {
            System.out.println("invalid user or we cannot find this username");
        }
        System.out.println("main program ended");
    }
}