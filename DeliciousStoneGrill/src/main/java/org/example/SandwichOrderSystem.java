package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SandwichOrderSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Sandwich> orders = new ArrayList<>();

    public static void startOrder() {
        boolean ordering = true;

        String reset = "\u001B[0m";
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String yellow = "\u001B[33m";
        String blue = "\u001B[34m";
        String magenta = "\u001B[35m";
        String cyan = "\u001B[36m";
        String white = "\u001B[37m";


        System.out.println(green + " ________  _______   ___       ___  ________  ___  ________  ___  ___  ________           ________  ________  ________  ________  _________  ________  ________   _______           ________  ________  ___  ___       ___          " + reset);
        System.out.println(green + "|\\   ___ \\|\\  ___ \\ |\\  \\     |\\  \\|\\   ____\\|\\  \\|\\   __  \\|\\  \\|\\  \\|\\   ____\\         |\\   ____\\|\\   __  \\|\\   __  \\|\\   ____\\|\\___   ___\\\\   __  \\|\\   ___  \\|\\  ___ \\         |\\   ____\\|\\   __  \\|\\  \\|\\  \\     |\\  \\         " + reset);
        System.out.println(green + "\\ \\  \\_|\\ \\ \\   __/|\\ \\  \\    \\ \\  \\ \\  \\___|\\ \\  \\ \\  \\|\\  \\ \\  \\\\\\  \\ \\  \\___|_        \\ \\  \\___|\\ \\  \\|\\  \\ \\  \\|\\  \\ \\  \\___|\\|___ \\  \\_\\ \\  \\|\\  \\ \\  \\\\ \\  \\ \\   __/|        \\ \\  \\___|\\ \\  \\|\\  \\ \\  \\ \\  \\    \\ \\  \\        " + reset);
        System.out.println(green + " \\ \\  \\ \\\\ \\ \\  \\_|/_\\ \\  \\    \\ \\  \\ \\  \\    \\ \\  \\ \\  \\\\\\  \\ \\  \\\\\\  \\ \\_____  \\        \\ \\  \\    \\ \\   __  \\ \\   ____\\ \\_____  \\   \\ \\  \\ \\ \\  \\\\\\  \\ \\  \\\\ \\  \\ \\  \\_|/__       \\ \\  \\  __\\ \\   _  _\\ \\  \\ \\  \\    \\ \\  \\       " + reset);
        System.out.println(green + "  \\ \\  \\_\\\\ \\ \\  \\_|\\ \\ \\  \\____\\ \\  \\ \\  \\____\\ \\  \\ \\  \\\\\\  \\ \\  \\\\\\  \\|____|\\  \\        \\ \\  \\____\\ \\  \\ \\  \\ \\  \\___|\\|____|\\  \\   \\ \\  \\ \\ \\  \\\\\\  \\ \\  \\\\ \\  \\ \\  \\_|\\ \\       \\ \\  \\|\\  \\ \\  \\\\  \\\\ \\  \\ \\  \\____\\ \\  \\____  " + reset);
        System.out.println(green + "   \\ \\_______\\ \\_______\\ \\_______\\ \\__\\ \\_______\\ \\__\\ \\_______\\ \\_______\\____\\_\\  \\        \\ \\_______\\ \\__\\ \\__\\ \\__\\     ____\\_\\  \\   \\ \\__\\ \\ \\_______\\ \\__\\\\ \\__\\ \\_______\\       \\ \\_______\\ \\__\\\\ _\\\\ \\__\\ \\_______\\ \\_______\\ " + reset);
        System.out.println(green + "    \\|_______|\\|_______|\\|_______|\\|__|\\|_______|\\|__|\\|_______|\\|_______|\\_________\\        \\|_______|\\|__|\\|__|\\|__|    |\\_________\\   \\|__|  \\|_______|\\|__| \\|__|\\|_______|        \\|_______|\\|__|\\|__|\\|__|\\|_______|\\|_______| " + reset);
        System.out.println(green + "                                                                         \\|_________|                                     \\|_________|                                                                                              " + reset);
        System.out.println(green + "                                                                                                                                                                                                                                    " + reset);
        System.out.println(yellow + "                                                                           _" + reset);
        System.out.println(yellow + "                                                          //" + reset);
        System.out.println(yellow + "                                                         //" + reset);
        System.out.println(yellow + "                                         _______________//__" + reset);
        System.out.println(yellow + "                                       .(______________//___)." + reset);
        System.out.println(yellow + "                                       |              /      |" + reset);
        System.out.println(yellow + "                                       |. . . . . . . / . . .|" + reset);
        System.out.println(yellow + "                                       \\ . . . . . ./. . . . /" + reset);
        System.out.println(yellow + "                                        |           / ___   |" + reset);
        System.out.println(yellow + "                    _.---._             |::......./../...\\.:|" + reset);
        System.out.println(yellow + "                _.-~       ~-._         |::::/::\\::/:\\::::::|" + reset);
        System.out.println(yellow + "            _.-~               ~-._     |::::\\::/::::::X:/::|" + reset);
        System.out.println(yellow + "        _.-~                       ~---.;:::::::/::\\::/:::::|" + reset);
        System.out.println(yellow + "    _.-~                                 ~\\::::::n::::::::::|" + reset);
        System.out.println(yellow + " .-~                                    _.;::/::::a::::::::/" + reset);
        System.out.println(yellow + " :-._                               _.-~ ./::::::::d:::::::|" + reset);
        System.out.println(yellow + " `-._~-._                   _..__.-~ _.-~|::/::::::::::::::|" + reset);
        System.out.println(yellow + "  /  ~-._~-._              / .__..--~----.YWWWWWWWWWWWWWWWP'" + reset);
        System.out.println(yellow + " \\_____(_;-._\\.        _.-~_/       ~).. . \\" + reset);
        System.out.println(yellow + "    /(_____  \\`--...--~_.-~______..-+_______)" + reset);
        System.out.println(yellow + "  .(_________/`--...--~/    _/           /\\" + reset);
        System.out.println(yellow + " /-._     \\_     (___./_..-~__.....__..-~./" + reset);
        System.out.println(yellow + " `-._~-._   ~\\--------~  .-~_..__.-~ _.-~" + reset);
        System.out.println(yellow + "     ~-._~-._ ~---------'  / .__..--~" + reset);
        System.out.println(yellow + "         ~-._\\.        _.-~_/" + reset);
        System.out.println(yellow + "             \\`--...--~_.-~" + reset);
        System.out.println(yellow + "              `--...--~" + reset);

        System.out.println(cyan + "Welcome to Delicious Capstone Grill!" + reset);
        while (ordering) {
            System.out.println(blue + "[1] Add a new Sandwich to your order" + reset);
            System.out.println(blue + "[2] View current order" + reset);
            System.out.println(blue + "[3] Remove an item from your order" + reset);
            System.out.println(blue + "[4] Check Out" + reset);
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        addNewSandwich();
                        break;
                    case 2:
                        viewOrders();
                        break;
                    case 3:
                        removeOrder();
                        break;
                    case 4:
                        ordering = false;
                        checkOut();
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    private static void addNewSandwich() {
        SandwichBuilder builder = new SandwichBuilder();
        selectBread(builder);
        selectSize(builder);
        selectMeat(builder);
        selectCheese(builder);
        selectToasted(builder);
        selectToppings(builder);
        selectSauces(builder);
        selectSide(builder);
        selectDrink(builder);
        selectChips(builder);
        orders.add(builder.build());
        System.out.println("Sandwich added to your order.");
    }

    private static void viewOrders() {
        System.out.println("---- Current Orders ----");
        if (orders.isEmpty()) {
            System.out.println("No items in your order.");
        } else {
            for (int i = 0; i < orders.size(); i++) {
                System.out.println("Item " + (i + 1) + ":");
                System.out.println(orders.get(i).getReceiptDetails());
            }
        }
    }

    private static void removeOrder() {
        viewOrders();
        if (!orders.isEmpty()) {
            try {
                System.out.println("Enter the item number you want to remove:");
                int itemNumber = Integer.parseInt(scanner.nextLine());
                if (itemNumber > 0 && itemNumber <= orders.size()) {
                    orders.remove(itemNumber - 1);
                    System.out.println("Item removed successfully.");
                } else {
                    System.out.println("Invalid item number. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    private static void selectBread(SandwichBuilder builder) {
        try {
            System.out.println("Let's get you started right away");
            System.out.println("-Please select from the following Bread Types:");
            System.out.println("“One Type of Bread per Sandwich”");
            System.out.println("[1]-White Bread\n[2]-Wheat Bread\n[3]-Rye Bread\n[4]-Wrap Tortilla\n[00]-Cancel Order");
            int choice = Integer.parseInt(scanner.nextLine());
            Bread bread = null;
            switch (choice) {
                case 1: bread = new Bread("White Bread", 0); break;
                case 2: bread = new Bread("Wheat Bread", 0); break;
                case 3: bread = new Bread("Rye Bread", 0); break;
                case 4: bread = new Bread("Wrap Tortilla", 0); break;
                case 00:
                    System.out.println("Order Cancelled\nGood Bye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid bread type.");
                    selectBread(builder);
            }
            builder.setBread(bread);
            System.out.println("Great Selection!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            selectBread(builder);
        }
    }

    private static void selectSize(SandwichBuilder builder) {
        try {
            System.out.println("-Please select the size of your Meal:");
            System.out.println("[4]-4 inches for $5.50\n[8]-8 inches for $7.00\n[12]-12 inches (Footlong!) for $8.50");
            int size = Integer.parseInt(scanner.nextLine());
            builder.setSize(size);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            selectSize(builder);
        }
    }

    private static void selectMeat(SandwichBuilder builder) {
        try {
            System.out.println("-Please Select from The Meat Options (Prices vary by Sandwich Size):");
            System.out.println("“One type of meat per Sandwich”");
            System.out.println("[1]-Steak\n[2]-Ham\n[3]-Salami\n[4]-Roast Beef\n[5]-Chicken\n[6]-Bacon\n[00]-Cancel Order");
            int choice = Integer.parseInt(scanner.nextLine());
            Meat meat = null;
            double[] prices = {1.0, 2.0, 3.0};
            switch (choice) {
                case 1: meat = new Meat("Steak", prices); break;
                case 2: meat = new Meat("Ham", prices); break;
                case 3: meat = new Meat("Salami", prices); break;
                case 4: meat = new Meat("Roast Beef", prices); break;
                case 5: meat = new Meat("Chicken", prices); break;
                case 6: meat = new Meat("Bacon", prices); break;
                case 00:
                    System.out.println("Order Cancelled\nGood Bye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid meat option.");
                    selectMeat(builder);
            }
            builder.setMeat(meat, choice != 7);
            if (choice != 7) {
                System.out.println("Would you like extra meat? (Additional cost applies):");
                System.out.println("[1] Yes, I want extra meat\n[2] No, I do not want extra meat");
                boolean extraMeat = Integer.parseInt(scanner.nextLine()) == 1;
                builder.setMeat(meat, extraMeat);
            }
            System.out.println("Great Selection!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            selectMeat(builder);
        }
    }

    private static void selectCheese(SandwichBuilder builder) {
        try {
            System.out.println("Would you like some Cheese in your meal?");
            System.out.println("[1] Yes, I want some cheese\n[2] No, I do not want cheese");
            boolean wantCheese = Integer.parseInt(scanner.nextLine()) == 1;
            if (wantCheese) {
                System.out.println("-Please Select from The Cheese Options (Prices vary by Sandwich Size):");
                System.out.println("“One type of Cheese per Sandwich”");
                System.out.println("[1]-American\n[2]-Provolone\n[3]-Cheddar\n[4]-Swiss\n[00]-Cancel Order");
                int choice = Integer.parseInt(scanner.nextLine());
                Cheese cheese = null;
                double[] prices = {0.75, 1.5, 2.25};
                switch (choice) {
                    case 1: cheese = new Cheese("American", prices); break;
                    case 2: cheese = new Cheese("Provolone", prices); break;
                    case 3: cheese = new Cheese("Cheddar", prices); break;
                    case 4: cheese = new Cheese("Swiss", prices); break;
                    case 00:
                        System.out.println("Order Cancelled\nGood Bye!");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please select a valid cheese option.");
                        selectCheese(builder);
                }
                builder.setCheese(cheese, false);
                if (cheese != null) {
                    System.out.println("Would you like extra cheese? (Additional cost applies):");
                    System.out.println("[1] Yes, I want extra cheese\n[2] No, I do not want extra cheese");
                    boolean extraCheese = Integer.parseInt(scanner.nextLine()) == 1;
                    builder.setCheese(cheese, extraCheese);
                }
            }
            System.out.println("Great Selection!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            selectCheese(builder);
        }
    }

    private static void selectToasted(SandwichBuilder builder) {
        try {
            System.out.println("Would you like to get it toasted?");
            System.out.println("[1] Yes, I want it toasted\n[2] No, I do not want it toasted");
            boolean toasted = Integer.parseInt(scanner.nextLine()) == 1;
            builder.setToasted(toasted);
            System.out.println("Great Choice!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            selectToasted(builder);
        }
    }

    private static void selectToppings(SandwichBuilder builder) {
        try {
            System.out.println("Now let’s get you started with your Regular Toppings!");
            System.out.println("Please select from the following Toppings (At No Additional Cost):");
            System.out.println("You can add more tha one selection separated by a comma. EX: L, Pep");
            System.out.println("[L]-Lettuce\n[Pep]-Peppers\n[O]-Onions\n[T]-Tomatoes\n[J]-Jalapenos\n[C]-Cucumbers\n[Pic]-Pickles\n[G]-Guacamole\n[M]-Mushrooms\n[00]-Cancel Order");
            String toppings = scanner.nextLine();
            if (toppings.equals("00")) {
                System.out.println("Order Cancelled\nGood Bye!");
                scanner.close();
                System.exit(0);
            }
            builder.addToppings(toppings.split(",\\s*"));
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter the toppings again.");
            selectToppings(builder);
        }
    }

    private static void selectSauces(SandwichBuilder builder) {
        try {
            System.out.println("Now let’s get some Sauce in your life!");
            System.out.println("Please select from the following Sauces (At No Additional Cost):");
            System.out.println("You can add more tha one selection separated by a comma. EX: May, Mus");
            System.out.println("[May]-Mayo\n[Mus]-Mustard\n[K]-Ketchup\n[R]-Ranch\n[1000]-Thousand Islands\n[V]-Vinaigrette\n[None]-No extra flavor for me");
            String[] sauces = scanner.nextLine().split(",\\s*");
            for (String sauce : sauces) {
                String[] parts = sauce.split("\\s+");
                builder.addSauces(parts[0], parts.length > 1 ? Integer.parseInt(parts[1]) : 1);
            }
            System.out.println("Great Selection!");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter the sauces again.");
            selectSauces(builder);
        }
    }

    private static void selectSide(SandwichBuilder builder) {
        try {
            System.out.println("Now let’s get the Side Meal!");
            System.out.println("Please select from the following Sides (At No Additional Cost):");
            System.out.println("[?]-Au Jus\n[S]-Sauce\n[00]-Cancel Order");
            String side = scanner.nextLine();
            if (side.equals("00")) {
                System.out.println("Order Cancelled\nGood Bye!");
                scanner.close();
                System.exit(0);
            }
            builder.setSide(side);
            System.out.println("Great Selection!");
        } catch (Exception e) {
            System.out.println("Invalid input. Please select a side again.");
            selectSide(builder);
        }
    }

    private static void selectDrink(SandwichBuilder builder) {
        try {
            System.out.println("What about the Drink!");
            System.out.println("(Additional cost applies like always):");
            System.out.println("[S]-Small: $2.00\n[M]-Medium: $2.50\n[L]-Large: $3.00\n[None]-No Drink for Me! I’m on a diet.\n[00]-Cancel Order");
            String[] drinks = scanner.nextLine().split(",\\s*");
            for (String drink : drinks) {
                if (drink.equals("00")) {
                    System.out.println("Order Cancelled\nGood Bye!");
                    scanner.close();
                    System.exit(0);
                }
                String[] parts = drink.split("\\s+");
                Drink drinkObj = null;
                switch (parts[0].toUpperCase()) {
                    case "S": drinkObj = new Drink("Small", 2.0); break;
                    case "M": drinkObj = new Drink("Medium", 2.5); break;
                    case "L": drinkObj = new Drink("Large", 3.0); break;
                    case "NONE": drinkObj = null; break;
                    default:
                        System.out.println("Invalid choice. Please select a valid drink size.");
                        selectDrink(builder);
                }
                builder.setDrink(drinkObj);
            }
            System.out.println("Great Selection!");
        } catch (Exception e) {
            System.out.println("Invalid input. Please select the drink again.");
            selectDrink(builder);
        }
    }

    private static void selectChips(SandwichBuilder builder) {
        try {
            System.out.println("But what about chips for $1.50?");
            System.out.println("[1] Yes, I want some chips\n[2] No, I do not want those extra calories\n[00]-Cancel Order");
            String choice = scanner.nextLine();
            if (choice.equals("00")) {
                System.out.println("Order Cancelled\nGood Bye!");
                scanner.close();
                System.exit(0);
            }
            boolean chips = Integer.parseInt(choice) == 1;
            builder.setChips(chips);
            System.out.println("Great Selection!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            selectChips(builder);
        }
    }

    private static void checkOut() {
        System.out.println("---- Customer's Receipt ----");
        double totalCost = 0;
        StringBuilder receipt = new StringBuilder();
        for (Sandwich sandwich : orders) {
            receipt.append(sandwich.getReceiptDetails());
            totalCost += sandwich.calculateTotal();
        }
        receipt.append(String.format("Total Cost: $%.2f\n", totalCost));
        System.out.println(receipt.toString());
        FileManager.saveOrder(receipt.toString());
        System.out.println("Thank you for your order, come back again!");
    }
}
