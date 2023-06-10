package hust.soict.ict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    // private int id;
    // private String title;
    // private String category;
    // private float cost;
    private List<String> authors = new ArrayList<String>();
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    // public Book(){
        
    // }

    // public int getId() {
    //     return id;
    // }

    // public void setId(int id) {
    //     this.id = id;
    // }

    // public String getTitle() {
    //     return title;
    // }

    // public void setTitle(String title) {
    //     this.title = title;
    // }

    // public String getCategory() {
    //     return category;
    // }

    // public void setCategory(String category) {
    //     this.category = category;
    // }

    // public float getCost() {
    //     return cost;
    // }

    // public void setCost(float cost) {
    //     this.cost = cost;
    // }

    public void addAuthor(String authorName){
        for(int i = 0; i < authors.size(); i++){
            if(authors.get(i).equals(authorName))
            {
                System.out.println("Author already in the list!");
                return;
            }
        }
        authors.add(authorName);
        System.out.println("Author added successfully!");
    }

    public void removeAuthor(String authorName){
        for(int i = 0; i < authors.size(); i++){
            if(authors.get(i).equals(authorName))
            {
                authors.remove(i);
                System.out.println("Author removed successfully!");
                return;
            }
        }
        System.out.println("Author not in the list!");
    }
}
