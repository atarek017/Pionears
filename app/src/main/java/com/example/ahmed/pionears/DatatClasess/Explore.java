package com.example.ahmed.pionears.DatatClasess;

public class Explore {
    private String mCompanyName;
    private String mJobStyle;
    private String mDiscription;
    private String mPhoto;

    public Explore(String mCompanyName, String mJobStyle, String mDiscription, String mPhoto) {
        this.mCompanyName = mCompanyName;
        this.mJobStyle = mJobStyle;
        this.mDiscription = mDiscription;
        this.mPhoto = mPhoto;
    }

    public String getmCompanyName() {
        return mCompanyName;
    }

    public void setmCompanyName(String mCompanyName) {
        this.mCompanyName = mCompanyName;
    }

    public String getmJobStyle() {
        return mJobStyle;
    }

    public void setmJobStyle(String mJobStyle) {
        this.mJobStyle = mJobStyle;
    }

    public String getmDiscription() {
        return mDiscription;
    }

    public void setmDiscription(String mDiscription) {
        this.mDiscription = mDiscription;
    }

    public String getmPhoto() {
        return mPhoto;
    }

    public void setmPhoto(String mPhoto) {
        this.mPhoto = mPhoto;
    }
}
