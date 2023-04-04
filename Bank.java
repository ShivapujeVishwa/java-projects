class Bank {
    String name;
    long adharnumber;
    String address;
    long phoeno;

}

class Bank1 {
    public static void main(String[] args) {
        Bank b1 = new Bank();

        b1.address = "humnabad bider at post sindhankera";
        b1.adharnumber = 685698884865L;
        b1.name = "vishwanath";
        b1.phoeno = 8088682677L;

        System.out.println(
                "name" + b1.name + " address" + b1.address + " adharnumber" + b1.adharnumber + " phoneno" + b1.phoeno);
    }
}