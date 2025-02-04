package enumeration.test.http;

public enum HttpStatus {
    OK, BAD_REQUEST, NOT_FOUND, INTERNAL_SERVER_ERROR

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
