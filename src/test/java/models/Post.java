package models;

public class Post {

    private Integer userId;

    private Integer id;

    private String title;

    private String body;



    public Post(Integer userId,  String title, String body) {
        this.userId = userId;
        this.title = title;
        this.body = body;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }



    public Post() {
    }
}
