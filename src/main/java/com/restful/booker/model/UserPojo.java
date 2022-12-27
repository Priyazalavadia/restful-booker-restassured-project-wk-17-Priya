package com.restful.booker.model;

import java.util.List;

public class UserPojo {
    private String firstName;
    private String lastName;
    private int totalPrice;
    private String depositPaid;
    private String bookingDates;
    private List<String> additionalNeeds;

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

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDepositPaidOrNot() {
        return depositPaid;
    }

    public void setDepositPaidOrNot(String depositPaid) {
        this.depositPaid = depositPaid;
    }

    public String getBookingDates() {
        return bookingDates;
    }

    public void setBookingDates(String bookingDates) {
        this.bookingDates = bookingDates;
    }

    public List<String> getAdditionalNeeds() {
        return additionalNeeds;
    }

    public void setAdditionalNeeds(List<String> additionalNeeds) {
        this.additionalNeeds = additionalNeeds;
    }
}

