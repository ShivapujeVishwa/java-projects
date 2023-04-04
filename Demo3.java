class Demo3 {
    int x = 30;
    int y = 100;
}

class Demo2 {
    public static void main(String[] args) {
        Demo3 d1 = new Demo3();
        Demo3 d2;
        d2 = d1;
        d1.x = 50;
        d1.y = 500;
        System.out.println(d2.x);
        System.out.println(d2.y);
    }
}