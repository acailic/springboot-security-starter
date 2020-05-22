package rs.interview.backend.web.rest.errors;

/**
 * @author a.ilic
 */
public class EntityNotFoundException extends RuntimeException {

    private EntityNotFoundException(String message) {
        super(message);
    }
}
