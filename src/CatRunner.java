public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Garfield", 30, 99.62);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Nermal", 22, 34.6);
        cat2.printCatInfo();
        cat2.introduce();


    }
}
