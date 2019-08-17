package allen.community.exception;

/**
 * Created by Allen on 2019/08/17
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND("您找的问题不在了，要不换个试试?");

    private String message;

    public String getMessage() {
        return message;
    }

    CustomizeErrorCode(String message) {
        this.message = message;
    }
}
