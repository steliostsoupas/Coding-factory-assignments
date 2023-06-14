package gr.aueb.cf.ch11;

public class Customer {
    private int id;
    private String firstname;
    private String lastname;
    private String varRegNo;
    private String phone;
    private String address;

    public Customer(){}

    public Customer(int id, String firstname, String lastname, String varRegNo, String phone, String address) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.varRegNo = varRegNo;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getVarRegNo() {
        return varRegNo;
    }

    public void setVarRegNo(String varRegNo) {
        this.varRegNo = varRegNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
