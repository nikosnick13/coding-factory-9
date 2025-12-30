package gr.aueb.cf.cf9.cha11;

/**
 * Java Beans for Customer
 *
 */
public class Customer {

    private long id;
    private String firstname;
    private String lastname;
    private String vat;             // Α.Φ.Μ.
    private String phoneNumber;
    private String region;
    private String prefecture;
    private String municipality;
    private String city;
    private String street;
    private String streetNumber;
    private String zipCode;
    private String email;

    public Customer(){

    }

    public Customer(long id, String firstname, String lastname, String vat, String phoneNumber, String region, String prefecture, String municipality,
                    String street, String streetNumber, String email, String zipCode, String city) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.vat = vat;
        this.phoneNumber = phoneNumber;
        this.region = region;
        this.prefecture = prefecture;
        this.municipality = municipality;
        this.street = street;
        this.streetNumber = streetNumber;
        this.email = email;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getPrefecture() {
        return prefecture;
    }

    public void setPrefecture(String prefecture) {
        this.prefecture = prefecture;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
