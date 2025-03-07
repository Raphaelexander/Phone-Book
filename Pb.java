class Pb {
    private String fName;
    private String lName;
    private String addr;
    private String city;
    private String zip;
    private String phoneNum;
    private String data;
    
    void setFName(String fName) {
        this.fName = fName;
    }
    void setLName(String lName) {
        this.lName = lName;
    }
    void setAddr(String addr) {
        this.addr = addr;
    }
    void setCity(String city) {
        this.city = city;
    }
    void setZip(String zip) {
        this.zip = zip;
    }
    void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    String returnString () {
        data = fName + ", " + lName + ", " + addr + ", " + city + ", " + zip + ", " + phoneNum + "\n";
        return data;
    }
}
