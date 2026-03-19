import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Scanner scnr2 = new Scanner(System.in);
        Scanner scnr3 = new Scanner(System.in);

        ElectronicItem electronicCategory = new ElectronicItem();
        GardenItem gardenCategory = new GardenItem();
        ElectronicItem temp_e_item = new ElectronicItem();
        GardenItem temp_g_item = new GardenItem();
        List<Category> items_e = new ArrayList<>();
        List<Category> items_g = new ArrayList<>();

        int count = 0;

        System.out.println("Enter item count");
        count = scnr.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Choose category (1 - electronic, 2 - garden)");
            int c = scnr.nextInt();
            switch (c) {
                case 1: {
                    System.out.println("Enter title and price");
                    String temp = scnr2.nextLine();
                    String[] t_arr = temp.split(" ");
                    temp_e_item.setTitle(t_arr[0]);
                    temp_e_item.setPrice(Double.parseDouble(t_arr[1]));
                    System.out.println("Enter description");
                    temp_e_item.setDescription(scnr3.nextLine());
                    items_e.add(temp_e_item);
                }
                case 2: {
                    System.out.println("Enter title and price");
                    String temp = scnr2.nextLine();
                    String[] t_arr = temp.split(" ");
                    temp_g_item.setTitle(t_arr[0]);
                    temp_g_item.setPrice(Double.parseDouble(t_arr[1]));
                    System.out.println("Enter description");
                    temp_g_item.setDescription(scnr3.nextLine());
                    items_g.add(temp_g_item);
                }
            }
        }

        HashMap<Category, List<Category>> products = new HashMap<>();

        products.put(electronicCategory, items_e);
        products.put(gardenCategory, items_g);

    }
}