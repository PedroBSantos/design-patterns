package com.head.first.protection;

public class PersonBeanImpl implements PersonBean {

    private String name;
    private String gender;
    private String interests;
    private int rating;
    private int ratingCount;

    public PersonBeanImpl(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        if (this.ratingCount == 0) {
            return 0;
        }
        return this.rating / this.ratingCount;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        this.ratingCount++;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }
}
