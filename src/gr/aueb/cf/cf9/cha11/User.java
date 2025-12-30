package gr.aueb.cf.cf9.cha11;

public class User {

    private long id;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private boolean active;

    public User(){

    }

    public User(boolean active, String password, String username, String lastname, String firstname, long id) {
        this.active = active;
        this.password = password;
        this.username = username;
        this.lastname = lastname;
        this.firstname = firstname;
        this.id = id;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
