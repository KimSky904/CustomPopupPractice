package com.example.custompopuppractice.TransScrollPopup;


public class ListPopupItem {

    private int imageView;
    private String title;
    private String part;
    private String degree;
    private String condition;
    private String situation;
    private String with;

    public int getImageView() {return imageView;}
    public String getTitle() {return title;}
    public String getPart() { return part;}
    public String getDegree() { return degree;}
    public String getCondition() { return condition;}
    public String getSituation() { return situation;}
    public String getWith() { return with; }


    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public void setWith(String with) {
        this.with = with;
    }
}
