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

        HashMap<Category, List<Category>> products = new HashMap<>();

        products.put(electronicCategory, items_e);
        products.put(gardenCategory, items_g);
        }
    }