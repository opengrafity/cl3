package dev.grafity;

public class Address {
    private String doorNo;
    private String streetName;
    private String cityName;
    private String pincode;

    public Address() {
    }

    public Address(String doorNo, String streetName, String cityName, String pincode) {
        this.doorNo = doorNo;
        this.streetName = streetName;
        this.cityName = cityName;
        this.pincode = pincode;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorNo='" + doorNo + '\'' +
                ", streetName='" + streetName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
