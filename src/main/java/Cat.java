import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
