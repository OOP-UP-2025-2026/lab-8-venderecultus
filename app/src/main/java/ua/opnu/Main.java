package ua.opnu;

public class Main {
    public static void main(String[] args) {

        System.out.println("ЗАВДАННЯ 1: MyOptional");

        MyOptional<String> noName = new MyOptional<>();
        System.out.println("Empty optional: " + noName);
        System.out.println("Is present? " + noName.isPresent());
        System.out.println("orElse check: " + noName.orElse("Анонім"));

        MyOptional<String> friendName = new MyOptional<>("Volodymyr");
        System.out.println("Friend optional: " + friendName);
        System.out.println("Get value: " + friendName.get());

        try {
            noName.get();
        } catch (IllegalStateException ex) {
            System.out.println("Спіймали очікувану помилку: " + ex.getMessage());
        }

        System.out.println("\nЗАВДАННЯ 2: BookData (Comparable)");

        BookData b1 = new BookData("Graphic Design Principles", "Author A", 10, 50);
        BookData b2 = new BookData("Algorithm Theory", "Author B", 5, 20);
        BookData b3 = new BookData("Java for Beginners", "Bloch", 20, 100);

        System.out.println("Порівняння Design (5.0) та Algo (4.0): " + b1.compareTo(b2));
        System.out.println("Порівняння Design (5.0) та Java (5.0): " + b1.compareTo(b3));

        System.out.println("\nЗАВДАННЯ 3: Printer");
        Printer myPrinter = new Printer();
        Integer[] ids = {101, 102, 103, 666};
        String[] subjects = {"ОБД", "Теорія Алгоритмів", "Фізкультура"};

        System.out.print("Int array: ");
        myPrinter.printArray(ids);
        System.out.print("String array: ");
        myPrinter.printArray(subjects);

        System.out.println("\nЗАВДАННЯ 4: Filter");
        Integer[] nums = {1, 5, 10, -2, 8, 0};
        Integer[] filtered = Utils.filter(nums, n -> n > 3);
        System.out.print("Filtered (>3): ");
        myPrinter.printArray(filtered);

        System.out.println("\nЗАВДАННЯ 5: Contains");
        String[] dict = {"Java", "C++", "Python", "Figma"};
        System.out.println("Contains 'Figma'? " + Utils.contains(dict, "Figma"));
        System.out.println("Contains 'Ruby'? " + Utils.contains(dict, "Ruby"));

        System.out.println("\nЗАВДАННЯ 6: Tuples");

        GenericTwoTuple<String, Integer> studentAge = new GenericTwoTuple<>("User", 19);
        System.out.println("TwoTuple: " + studentAge);

        GenericThreeTuple<String, Integer, String> examResult =
                new GenericThreeTuple<>("Теорія ймовірностей", 95, "Зараховано");

        System.out.println("ThreeTuple (Exam): " + examResult);
        System.out.println("Subject: " + examResult.getFirst());
        System.out.println("Score: " + examResult.getSecond());
    }
}