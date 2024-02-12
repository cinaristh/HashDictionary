import java.util.*;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        // creating a My HashTable Dictionary
        Hashtable<String, String> my_dict = new Hashtable<String, String>();

        // Using a few dictionary Class methods
        // using put method
        my_dict.put("01", "Apple");
        my_dict.put("02", "Orange");
        my_dict.put("03", "Lemon");
        my_dict.put("04", "Grapes");
        my_dict.put("05", "Watermelon");
        my_dict.put("06", "Pear");
        my_dict.put("07", "Strawberry");
        my_dict.put("08", "Kiwi");
        my_dict.put("09", "Apple");
        my_dict.put("10", "Blackberries");
        my_dict.put("11", "Banana");
        my_dict.put("12", "Raspberries");
        my_dict.put("13", "Cherry");
        my_dict.put("14", "Mango");
        my_dict.put("15", "Papaya");

        System.out.print("Welcome to my dictionary of fruit!\n");
        String input = "";
        Scanner inp = new Scanner(System.in);
        while (input.equals("q")==false){
            System.out.println("\nTYPE f to find a fruit");
            System.out.println("TYPE c to count the number of items in the dictionary");
            System.out.println("TYPE a to add a fruit");
            System.out.println("TYPE d to delete a fruit");
            System.out.println("TYPE u to update an entry ");
            System.out.println("TYPE S to search for an item");
            System.out.println("TYPE g to get value at key");
            System.out.println("TYPE r to remove value at key");
            System.out.println("TYPE i to check if the dictionary is empty");
            System.out.println("TYPE q to QUIT");
            input = inp.nextLine();


            if(input.equals("f")){
                System.out.println("Pick a key value to find a fruit");
                String key = inp.nextLine();
                System.out.println(my_dict.get(key));
            }

            if(input.equals("c")){
                System.out.println(my_dict.size());
            }

            if (input.equals("d")){
                System.out.println("Pick a key value to remove");
                String key = inp.nextLine();
                System.out.println(my_dict.remove(key));
            }

            if (input.equals("u")){
                System.out.println("Pick a key value to modify");
                String key = inp.nextLine();
                System.out.println("Pick a fruit name to modify");
                String name = inp.nextLine();
                System.out.println(my_dict.replace(key,name));
            }

            if (input.equals("s")){
                System.out.println("Pick a key value to search");
                String name = inp.nextLine();
                System.out.println(my_dict.containsValue(name));
            }
            if (input.equals("g")) {
                System.out.println("Enter a key value to get value");
                String key = inp.nextLine();
                System.out.println("Value at key " + key + ": " + my_dict.get(key));
            }
            if (input.equals("r")) {
                System.out.println("Enter a key value to remove");
                String key = inp.nextLine();
                System.out.println("Removing value at key " + key + ": " + my_dict.remove(key));
            }
            if (input.equals("i")) {
                System.out.println("Is my dictionary empty? : " + my_dict.isEmpty());
            }
        }


    }
}
