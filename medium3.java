public class medium3 {
    public static void GetCountry(Cat cat) {
        switch (cat.getPedigreeNumber()){
            case Russia:
                System.out.println(cat.getName() + " страна кошки россия");
                break;
            case England:
                System.out.println(cat.getName()+ " страна кошки англия ");
                break;
            case Scotland:
                System.out.println(cat.getName()+ " страна кошки шотландия ");
                break;
        }

    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Max", 20, 3, Cat.PedigreeNumberType.England);
        Cat cat2 = new Cat("Johny", 30, 1, Cat.PedigreeNumberType.Scotland);
        Cat cat3 = new Cat("Jack", 10, 5, Cat.PedigreeNumberType.Russia);
        Cat cat4 = new Cat();
        cat4.setPedigreeNumber(Cat.PedigreeNumberType.Russia);
        GetCountry(cat1);
        GetCountry(cat2);
        GetCountry(cat3);
        GetCountry(cat4);
    }
}
