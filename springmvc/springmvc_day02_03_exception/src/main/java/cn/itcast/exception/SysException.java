package cn.itcast.exception;

/**
 * Create By 96251 on 2020/4/10.
 */
public class SysException extends Exception{
    // 存储提示信息的
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SysException(String message) {
        this.message = message;
    }
}
