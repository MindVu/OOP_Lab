package hust.soict.ict.aims.Cart;

import java.util.ArrayList;

import hust.soict.ict.aims.media.DigitalVideoDisc;
import hust.soict.ict.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    public int qtyOrdered = 0;
    private final ArrayList<Media> itemsOrdered = new ArrayList<>();
    private float totalCost = 0;

    public float totalCost() {
        if (qtyOrdered == 0) {
            System.out.println("Cart has no item!");
            return 0;
        } else {
            float total = 0;
            for (int i = 0; i < qtyOrdered; i++) {
                total += itemsOrdered.get(i).getCost();
            }
            return total;
        }
    }

    public void addMedia(Media media) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            if (itemsOrdered.contains(media)) {
                System.out.println("The media exists already");
            } else {
                itemsOrdered.add(media);
                qtyOrdered++;
                System.out.println("The media has been added");
            }
        } else {
            System.out.println("Cart is full");
        }

    }

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            qtyOrdered--;
            System.out.println("The media has been removed");
        } else {
            System.out.println("The media does not exist");
        }
    }

    public Media searchMediaById(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id)
                return media;
        }
        return null;
    }

    public Media searchMediaByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equals(title))
                return media;
        }
        return null;
    }

    public ArrayList<Media> filterMediaByTitle(String title) {
        ArrayList<Media> mediaArrayList = new ArrayList<>();
        for (Media media : itemsOrdered) {
            if (media.getTitle().contains(title)) {
                mediaArrayList.add(media);
            }

        }
        return mediaArrayList;
    }

    public void showCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (Media media : itemsOrdered) {
            System.out.println("ID: " + media.toString());
        }
        this.totalCost = totalCost();
        System.out.println("Total cost: " + this.totalCost);
        System.out.println("**************************************************");
    }

    public void sortByTitleCost() {
        this.itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCostTitle() {
        this.itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
    }

    public void placeOrder() {
        System.out.println("------------------------------");
        System.out.println("Thanks for choosing our store");
        System.out.println("------------------------------");
    }

}
