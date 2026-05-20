import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Client currentUser;

    static ElectronicItem[] catElec = new ElectronicItem[] {
            new ElectronicItem("Laptop ACER", "i5-12400f, 16gb", 570.0),
            new ElectronicItem("Laptop ASUS", "i7-13400f, 32gb", 990.0),
            new ElectronicItem("Ladder", "good ladder", 34.5)
    };

    GardenItem[] catGarden = new GardenItem[] {
            new GardenItem("Shovel", "just shovel", 30.0),
            new GardenItem("Ladder", "good ladder", 34.5)
    };
    public static void main(String[] args) {

        System.out.print("Your name: ");
        String name = sc.nextLine();
        System.out.print("Your balance: ");
        double balance = sc.nextDouble();
        currentUser = new Client(name.isEmpty() ? "Guest" : name, balance);
        System.out.println("Welcome, " + currentUser.getName());
        System.out.println("Balance: " + currentUser.checkBalance());

        while (true) {
            System.out.println("1 - Products");
            System.out.println("2 - Categories");
            System.out.println("3 - Compare two products");
            System.out.println("4 - Buy");
            System.out.println("5 - My wallet");
            System.out.println("0 - Exit");

            int choice = sc.nextInt();

            switch(choice) {
                case 1:

            }


        }


/*        Arrays.sort(catElec, Comparator.comparing(item -> item.title));

        for (ElectronicItem item : catElec) {
            System.out.println(item.toString());
        }


        Arrays.sort(catGarden, Comparator.comparing(item -> item.title));

        for (GardenItem item : catGarden) {
            System.out.println(item.toString());
        }

        Arrays.sort(catElec, Comparator.comparing((ElectronicItem item) -> item.title).thenComparing(item -> item.price));

        for (ElectronicItem item : catElec) {
            System.out.println(item.toString());
        }*/
    }

    static void menuProducts() {

        System.out.println("Sort by: 1 - Cost, 2 - Title, 3 - Category");
        int choise = sc.nextInt();

        Comparator<Product> comparator = Comparator.comparing((a) -> a.getTitle());

        }
    }
}