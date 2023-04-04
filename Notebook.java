class Notebook {
    String brand;
    int pages;
    double price;
}

class Notebook1 {
    public static void main(String[] args) {
        System.out.println("main started");

        Notebook n1 = new Notebook();

        n1.brand = "Parker";
        n1.pages = 400;
        n1.price = 100.00;

        System.out.println("brand " + n1.brand + " pages " + n1.pages + " price " + n1.price);
        System.out.println("main ended");
    }
}