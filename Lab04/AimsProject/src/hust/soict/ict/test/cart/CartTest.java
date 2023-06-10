package hust.soict.ict.test.cart;

import hust.soict.ict.aims.Cart.Cart;
import hust.soict.ict.aims.media.DigitalVideoDisc;
import hust.soict.ict.aims.media.Book;
import hust.soict.ict.aims.media.Media;

public class CartTest {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();
        Media media1 = new Book("Ironman", "comic", 50000);
        Media media2 = new DigitalVideoDisc("Spider-man", "movie", "Tran Thanh", 120,50000);
        Media media3 = new Book("Dragon Ball", "comic", 20000);

        cart.addMedia(media1);
        cart.addMedia(media2);
        cart.addMedia(media3);

        cart.sortByTitleCost();
        cart.showCart();
        cart.sortByCostTitle();
        cart.showCart();
    }
}