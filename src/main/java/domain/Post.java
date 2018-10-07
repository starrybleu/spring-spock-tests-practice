package domain;

import lombok.Getter;

@Getter
public class Post {
    private long id;

    public static Post from (long id) {
        Post post = new Post();

        post.id = id;

        return post;
    }
}
