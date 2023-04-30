public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    public int qtyOrdered = 0;
    public DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public int addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == 20) {
            System.out.println("Cart already full!");
            return 0;
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Cart added successfully!");
            return 1;
        }
    }

    public int removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("Cart has no item!");
            return 0;
        } else {
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemsOrdered[i] == disc) {
                    itemsOrdered[i] = itemsOrdered[qtyOrdered - 1];
                    qtyOrdered--;
                    System.out.println("Item removed!");
                    return 1;
                }
            }
            System.out.println("No corresponding item in cart!");
            return 0;
        }
    }

    public double totalCost() {
        if (qtyOrdered == 0) {
            System.out.println("Cart has no item!");
            return 0;
        } else {
            double total = 0;
            for (int i = 0; i < qtyOrdered; i++) {
                total += itemsOrdered[i].getCost();
            }
            return total;
        }
    }

}
