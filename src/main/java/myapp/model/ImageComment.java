package myapp.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "comments")
public class ImageComment implements Cloneable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  int point;
    private String author;
    private String feedback;
    private int likes;
    private Timestamp date= new Timestamp(System.currentTimeMillis());
    public ImageComment(){};
    public ImageComment(long id, int point, String author, String feedback, int likes, Timestamp date) {
        this.id = id;
        this.point = point;
        this.author = author;
        this.feedback = feedback;
        this.likes = likes;
        this.date = date;
    }

    public ImageComment(int point, String author, String feedback, int likes, Timestamp date) {
        this.point = point;
        this.author = author;
        this.feedback = feedback;
        this.likes = likes;
        this.date = date;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
   public ImageComment clone(){
        ImageComment comment = new ImageComment();
        comment.setId(id);
        comment.setAuthor(author);
        comment.setLikes(likes);
        comment.setFeedback(feedback);
        comment.setPoint(point);
        comment.setDate(date);
        return comment;
    }

}
