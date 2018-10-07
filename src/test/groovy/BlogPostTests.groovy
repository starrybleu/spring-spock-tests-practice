import domain.Post
import repository.PostRepository
import spock.lang.Specification

import javax.persistence.EntityNotFoundException

class BlogPostTests extends Specification {

    def "first test using spock"() {

        given:
            int result = 1

        when:
            result++

        then:
            2 == result
    }

    def "find one existing post by id should return the post"() {

        given:
            int existingPostId = 3
            PostRepository postRepository = Mock(PostRepository.class)
            Post post = Mock(Post.class)

            postRepository.findById(existingPostId) >> Optional.of(post)
            post.getId() >> existingPostId

        when:
            Optional<Post> retrievedPost = postRepository.findById(existingPostId)

        then:
            3L == retrievedPost.get().getId()

    }

    def "find one nonexistent post by id should throw EntityNotFound Exception"() {

        given:
        int nonexistentPostId = 4
        PostRepository postRepository = Mock(PostRepository.class)

        postRepository.findById(nonexistentPostId) >> { throw new EntityNotFoundException() }

        when:
        postRepository.findById(nonexistentPostId)

        then:
            thrown(EntityNotFoundException)

    }

    def "find posts should return list of posts"() {

    }

    def "createed a post from dto of legal arguments should be saved"() {

    }

}