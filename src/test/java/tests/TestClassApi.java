package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import models.Post;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.PropertyReader;
import utils.Specification;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;


public class TestClassApi {
    private final static String URL = PropertyReader.getPropertyValue("URL", "src/test/resources/totalInfo.properties");

    @Test
    public void getAllPostsFirstTest() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationAny(200));
        List<Post> firstTaskGetAllPosts = given()
                .when()
                .get("posts")
                .then()
                .log()
                .status()
                .extract()
                .as(new TypeRef<>() {
                });

        List<Integer> id = firstTaskGetAllPosts.stream().map(Post::getId).collect(Collectors.toList());
        List<Integer> idSorted = id.stream().sorted().collect(Collectors.toList());

        Assert.assertEquals(id, idSorted);
    }

    @Test
    @Parameters({"id", "userId"})
    public void check99id(@Optional("99") Integer id, @Optional("10") Integer userId) {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationAny(200));
        Post post99 = given()
                .when()
                .get("posts/99")
                .then()
                .log()
                .status()
                .extract()
                .body()
                .as(Post.class);

        Assert.assertEquals(post99.getId(), id);
        Assert.assertEquals(post99.getUserId(), userId);
        Assert.assertFalse(post99.getBody().isEmpty());
        Assert.assertFalse(post99.getTitle().isEmpty());
    }

    @Test
    public void post150() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationAny(404));
        given()
                .when()
                .get("posts/150")
                .then()
                .log()
                .body()
                .extract()
                .as(Post.class);
    }

    @Test
    @Parameters({"newId", "newUserId"})
    public void checkPostRequestWithUserId1(@Optional("101") Integer newId, @Optional("1") Integer newUserId) {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationAny(201));
        Post post = given()
                .body(new Post(1, "LinkinPark", "Body is power"))
                .when()
                .post("posts")
                .then()
                .log()
                .all()
                .extract()
                .as(Post.class);

        Assert.assertEquals(post.getTitle(), "LinkinPark");
        Assert.assertEquals(post.getBody(), "Body is power");
        Assert.assertEquals(newUserId, post.getUserId());
        Assert.assertEquals(newId, post.getId());
    }

    @Test
    public void checkUserId5() throws IOException {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationAny(200));
        List<User> users = given()
                .when()
                .get("users")
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .as(new TypeRef<>() {
                });

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/test/resources/user5.json");
        User user5 = objectMapper.readValue(file, User.class);
        Assert.assertEquals(users.get(4), user5, "User with id=5 is not as expected");
    }

    @Test
    public void compareUser5WithPreviousStep() throws IOException {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationAny(200));

        User user = given()
                .when()
                .get("users/5")
                .then()
                .extract()
                .as(User.class);

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/test/resources/user5.json");
        User user5 = objectMapper.readValue(file, User.class);
        Assert.assertEquals(user, user5, "User with id=5 is not as expected");
    }
}


