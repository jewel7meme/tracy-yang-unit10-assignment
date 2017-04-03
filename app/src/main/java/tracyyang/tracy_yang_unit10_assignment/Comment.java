package tracyyang.tracy_yang_unit10_assignment;

/**
 * Created by zyang3 on 4/3/2017.
 */

public class Comment {
    private long id;
    private String comment;
    private String rating;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        return rating + " " + comment;
    }
}