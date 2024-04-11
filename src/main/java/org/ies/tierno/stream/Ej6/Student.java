package org.ies.tierno.stream.Ej6;

public class Student {
    private String name;
    private String address;
    private int zipCode;

    public Student(String name, String address, int zipcode) {
        this.name = name;
        this.address = address;
        this.zipCode = zipcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }


}
