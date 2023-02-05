package com.example.Restaurant;

public class Restaurant {

    private int RestaurantId;
    private String RestaurantName;
    private String RestaurantAddress;
    private String RestaurantNumber;
    private String ResSpecialty;
    private int totalStaff;



    public Restaurant() {
        super();
       
    }

    public Restaurant(int restaurantId, String restaurantName, String restaurantAddress, String restaurantNumber,
                      String specialty, int totalStaff) {
        super();
        this.RestaurantId = restaurantId;
        this.RestaurantName = restaurantName;
        this.RestaurantAddress = restaurantAddress;
        this.RestaurantNumber = restaurantNumber;
        this.ResSpecialty = specialty;
        this.totalStaff = totalStaff;
    }

    public void setRestaurantId(int restaurantId) {
        RestaurantId = restaurantId;
    }
    public String getRestaurantName() {
        return RestaurantName;
    }
    public void setRestaurantName(String restaurantName) {
        RestaurantName = restaurantName;
    }
    public String getRestaurantAddress() {
        return RestaurantAddress;
    }
    public void setRestaurantAddress(String restaurantAddress) {
        RestaurantAddress = restaurantAddress;
    }
    public String getRestaurantNumber() {
        return RestaurantNumber;
    }
    public void setRestaurantNumber(String restaurantNumber) {
        RestaurantNumber = restaurantNumber;
    }
    public String getSpecialty() {
        return ResSpecialty;
    }
    public void setSpecialty(String specialty) {
        ResSpecialty = specialty;
    }
    public int getTotalStaff() {
        return totalStaff;
    }
    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }


}
