package com.example.androproject;

public class customer {

    String customer_email;
    String customer_location;
    String customer_name;
    String customer_phone;
    public customer(String c_email , String c_location, String c_name, String c_phone){
        customer_email = c_email;
        customer_location = c_location;
        customer_name = c_name;
        customer_phone = c_phone;



    }


    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_location() {
        return customer_location;
    }

    public void setCustomer_location(String customer_location) {
        this.customer_location = customer_location;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }



}


