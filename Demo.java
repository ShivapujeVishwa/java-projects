// this is a program is written withought using static keyword so it is a "non-static member"
// it is a non-static member
//calling methode for static and no-static member is different

class Demo {
    int x = 50;
    int w = 50;
    Double y = 40.1243;
    Long a = 122234567l;
    char name = 'f';
    String name1 = "vishwapooja";

    void test() {
        System.out.println("unning test methoode");
    }
}

class Mainclass {
    public static void main(String[] args) {
        System.out.println("main methode started");
        System.out.println(new Demo().x);
        /*
         * Demo a1 = new Demo(); Demo a2 = new Demo();
         * 
         * System.out.println("x value is " + a1.x); System.out.println("y value is " +
         * a1.y.hashCode()); a1.x = 40; System.out.println("new x value is" + a1.x);
         * System.out.println("a value is " + a1.a);
         * System.out.println("name of the char is  " + a1.name);
         * System.out.println("a name of the person is  " + a1.name1); a1.test();
         * System.out.println(x);
         */
    }
}