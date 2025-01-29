package singlylinkedlist.inventorymanagementsystem;

class InventoryManagement {
    private Item head = null;

    // Add an item at the beginning
    public void addItemAtBeginning(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    // Add an item at the end
    public void addItemAtEnd(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    // Add an item at a specific position
    public void addItemAtPosition(String itemName, int itemId, int quantity, double price, int position) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (position == 1) {
            addItemAtBeginning(itemName, itemId, quantity, price);
            return;
        }
        Item temp = head;
        int count = 1;
        while (count < position - 1 && temp != null) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position out of range.");
            return;
        }
        newItem.next = temp.next;
        temp.next = newItem;
    }

    // Remove an item based on Item ID
    public void removeItemById(int itemId) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        if (head.itemId == itemId) {
            head = head.next;
            System.out.println("Item with ID " + itemId + " removed.");
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Item with ID " + itemId + " not found.");
            return;
        }
        temp.next = temp.next.next;
        System.out.println("Item with ID " + itemId + " removed.");
    }

    // Update the quantity of an item by Item ID
    public void updateItemQuantity(int itemId, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                System.out.println("Item quantity updated for ID " + itemId);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with ID " + itemId + " not found.");
    }

    // Search for an item by Item ID
    public void searchItemById(int itemId) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                System.out.println("Item Found: " + temp.itemName + ", ID: " + temp.itemId + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with ID " + itemId + " not found.");
    }

    // Search for an item by Item Name
    public void searchItemByName(String itemName) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(itemName)) {
                System.out.println("Item Found: " + temp.itemName + ", ID: " + temp.itemId + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with name " + itemName + " not found.");
    }

    // Calculate and display total inventory value
    public void calculateTotalValue() {
        double totalValue = 0;
        Item temp = head;
        while (temp != null) {
            totalValue += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + totalValue);
    }

    // Sort the inventory by Item Name (Ascending)
    public void sortByName() {
        if (head == null || head.next == null) {
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            Item current = head;
            while (current.next != null) {
                if (current.itemName.compareToIgnoreCase(current.next.itemName) > 0) {
                    // Swap nodes
                    swapItems(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    // Sort the inventory by Price (Descending)
    public void sortByPriceDescending() {
        if (head == null || head.next == null) {
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            Item current = head;
            while (current.next != null) {
                if (current.price < current.next.price) {
                    // Swap nodes
                    swapItems(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    // Helper method to swap two items
    private void swapItems(Item a, Item b) {
        String tempName = a.itemName;
        int tempId = a.itemId;
        int tempQuantity = a.quantity;
        double tempPrice = a.price;

        a.itemName = b.itemName;
        a.itemId = b.itemId;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemName = tempName;
        b.itemId = tempId;
        b.quantity = tempQuantity;
        b.price = tempPrice;
    }

    // Display all items in the inventory
    public void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        Item temp = head;
        while (temp != null) {
            System.out.println("Item Name: " + temp.itemName + ", ID: " + temp.itemId + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }
}
