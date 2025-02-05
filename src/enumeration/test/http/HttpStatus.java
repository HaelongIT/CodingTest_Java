package enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK"), BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"), INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode(int code) {
        if (code == 200)
            return HttpStatus.OK;
        if (code == 400)
            return HttpStatus.BAD_REQUEST;
        if (code == 404)
            return HttpStatus.NOT_FOUND;
        if (code == 500)
            return HttpStatus.INTERNAL_SERVER_ERROR;
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        // if (this.code == 200) {
        // return true;
        // } else {
        // return false;
        // }

        // HTTP 상태 코드는 200 ~ 299사이의 숫자를 성공으로 인정한다.
        if (this.code >= 200 && this.code <= 299)
            return true;
        else
            return false;
    }
}
