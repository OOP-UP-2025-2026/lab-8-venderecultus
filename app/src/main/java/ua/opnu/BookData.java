package ua.opnu;

public class BookData implements Comparable<BookData> {
    private String title;
    private String author;
    private int reviews;
    private double total;

    public BookData(String title, String author, int reviews, double total) {
        this.title = title;
        this.author = author;
        this.reviews = reviews;
        this.total = total;
    }

    public double getRating() {
        if (reviews == 0) return 0.0;
        return total / reviews;
    }

    @Override
    public int compareTo(BookData other) {
        int ratingCompare = Double.compare(other.getRating(), this.getRating());

        if (ratingCompare != 0) {
            return ratingCompare;
        }

        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return String.format("'%s' by %s (Рейтинг: %.2f)", title, author, getRating());
    }
}