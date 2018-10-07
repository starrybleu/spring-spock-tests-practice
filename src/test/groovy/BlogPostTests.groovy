import spock.lang.Specification

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


    }

    def "find one unexisting post by id should throw EntityNotFound Exception"() {

    }

    def "find posts should return list of posts"() {

    }

    def "createed a post from dto of legal arguments should be saved"() {

    }

}