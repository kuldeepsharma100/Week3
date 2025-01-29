package singlylinkedlist.inventorymanagementsystem;

public class InventoryManagementMain {
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();

        inventory.addItemAtBeginning("Laptop", 101, 10, 50000);
        inventory.addItemAtEnd("Mouse", 102, 50, 500);
        inventory.addItemAtPosition("Keyboard", 103, 30, 1000, 2);

        System.out.println("All Items:");
        inventory.displayInventory();

        inventory.searchItemById(102);
        inventory.searchItemByName("Keyboard");

        inventory.updateItemQuantity(101, 12);

        inventory.calculateTotalValue();

        System.out.println("\nSorted by Name:");
        inventory.sortByName();
        inventory.displayInventory();

        System.out.println("\nSorted by Price (Descending):");
        inventory.sortByPriceDescending();
        inventory.displayInventory();

        inventory.removeItemById(102);

        System.out.println("\nAfter Removing Item ID 102:");
        inventory.displayInventory();
    }
}

