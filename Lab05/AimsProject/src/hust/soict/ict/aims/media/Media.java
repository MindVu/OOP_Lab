package hust.soict.ict.aims.media;

import java.util.Comparator;
import hust.soict.ict.aims.exception.NegativeException;

public abstract class Media {
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

	private int id;
	private String title;
	private String category;
	private float cost;

	public Media() {}

	public Media(int id, String title) {
		this.id = id;
		this.title = title;
	}

	public Media(int id, String title, String category, float cost) throws NegativeException {
		if (cost < 0) {
	        throw new NegativeException("Invalid cost");
	    }
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) 
			return true;

		//if not an instance of Media
		if (o == null)
			throw new NullPointerException("Null object");

		if (!(o instanceof Media)) {
	        throw new ClassCastException("Invalid instance");
	    }

		//cast and compare
		Media media = (Media) o;
		return title.equals(media.title);
	}

}
