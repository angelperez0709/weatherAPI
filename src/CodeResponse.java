public enum CodeResponse {
    RESPONSE_OK(200);

    private final int code;

    CodeResponse(int code) {
        this.code = code;
    }
    private int code(){return code;}
}
