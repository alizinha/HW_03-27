package nyc.c4q.alizinha;

/**
 * Info provided to us to complete our homework question (see JavaClasses.java for the work).
 */
public class Person {

    private String name;
    private String phoneNumber;
    private String city;

    public void Person(){
    }

    public void Person(String name){
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
