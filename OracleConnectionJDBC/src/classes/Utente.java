package classes;

public class Utente {

    private Long user_id;
    private String firstName;
    private String lastName;
    private String city;
    private String email;
    private Azienda company;

    public Utente(String firstName, String lastName, String city, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.email = email;
    }
    public Utente(Long user_id, String firstName, String lastName, String city, String email) {
        this.user_id = user_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.email = email;
    }

    public Long getUser_id() {
        return user_id;
    }
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Azienda getCompany() {
        return company;
    }
    public void setCompany(Azienda company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "user_id=" + user_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", company=" + company +
                '}';
    }
}
