package Encap;

public class StudentClass {
    private int id;
    private String5 name;
    private String5 address;
    private int age;
    private long mobileNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String5 getName() {
        return name;
    }

    public void setName(String5 name) {
        this.name = name;
    }

    public String5 getAddress() {
        return address;
    }

    public void setAddress(String5 address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 20) {
            this.age = age;
        } else {
            throw new RuntimeException("age greater than 20 years");
        }
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
