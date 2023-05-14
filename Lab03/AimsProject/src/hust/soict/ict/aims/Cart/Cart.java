package hust.soict.ict.aims.Cart;

import hust.soict.ict.aims.disc.DigitalVideoDisc;

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

    public int addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        int dvdListLength = dvdList.length;
        if (qtyOrdered + dvdListLength > MAX_NUMBERS_ORDERED || qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("Not enough space!");
            return 0;
        } else {
            for (int i = 0; i < dvdListLength; i++) {
                itemsOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered++;
            }
            return 1;
        }
    }

    public int addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED || qtyOrdered + 2 > MAX_NUMBERS_ORDERED) {
            System.out.println("Not enough space!");
            return 0;
        }
        itemsOrdered[qtyOrdered] = dvd1;
        qtyOrdered++;
        itemsOrdered[qtyOrdered] = dvd2;
        qtyOrdered++;
        System.out.println("The discs have been added");
        return 1;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + this.totalCost());
        System.out.println("**************************************************");
    }

    public void searchID(int id) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println(itemsOrdered[i].toString());
                return;
            }
        }
        System.out.println("Not found");
    }

    public void searchTitle(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println(itemsOrdered[i].toString());
                return;
            }
        }
        System.out.println("Not found");
    }

}
