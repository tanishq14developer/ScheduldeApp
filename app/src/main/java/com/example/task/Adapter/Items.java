package com.example.task.Adapter;

public class Items{
    String title,title1, skills;

    public Items(String title,String title1,String skills){
        this.title = title;
        this.title1 = title1;
        this.skills = skills;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
