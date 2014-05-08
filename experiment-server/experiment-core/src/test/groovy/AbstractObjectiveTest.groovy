import org.emmanueldemey.AbstractObjective
import spock.lang.*
import java.time.LocalDate;

class AbstractObjectiveTest extends Specification {
    @Unroll
    def "AbstractObjective should have the good value"() {
        when:
        AbstractObjective obj = new AbstractObjective(creationDate, archived, objective)

        then:
        obj.creationDate == creationDate
        obj.archived == archived
        obj.objective == objective

        where:
        creationDate    | archived | objective | category
        LocalDate.now()| true     | 2          | "category"
    }

    def "creationDate should not be null"() {
        when:
        AbstractObjective obj = new AbstractObjective(null, null, 1)

        then:
        final IllegalArgumentException exception = thrown()
        exception.message == 'creationDate was null'
    }

    def "objective should not be null"() {
        when:
        AbstractObjective obj = new AbstractObjective(LocalDate.now(), null, null)

        then:
        final IllegalArgumentException exception = thrown()
        exception.message == 'objective was null'
    }
}