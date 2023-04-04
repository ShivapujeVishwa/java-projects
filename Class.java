class Class {
    int x = 10;
    int y = 20;
}

class Class1 {
    public static void main(String[] args) {
        Class c1 = new Class();
        c1.x = 30;
        c1.y = 40;
        System.out.println("c1 contains " + c1);
        // System.out.println("x value " + c1.x);
        // System.out.println("y value " + c1.y);

        c1 = new Class();
        System.out.println("c1 contains  " + c1);
        System.out.println("x value is  " + c1.x);
        System.out.println("y value is  " + c1.y);
    }
}