package javaSE_Batch3;

public class User {
    private String username;
    private String email;

    public User(String userName, String email) {
        this.username = userName;
        this.email = email;
    }

    public String getUserName() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
