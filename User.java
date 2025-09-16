public class User {
    int id_user;
    String name;
    String email;
    String password;
    String telephone;
    public User(int id_user, String name, String email, String password, String telephone) {
        this.id_user = id_user;
        this.name = name;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
    }

    public int getId_user() {
        return id_user;
    }
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
