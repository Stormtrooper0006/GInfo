package com.dicoding.picodiploma.ginfo;

public class Bridge {
    private String title,detail, general, systemRequirements, copyright;
    private int photo, poster;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getSystemRequirements() {
        return systemRequirements;
    }

    public void setSystemRequirements(String systemRequirements) {
        this.systemRequirements = systemRequirements;
    }

    public String getGeneral() {
        return general;
    }

    public void setGeneral(String general) {
        this.general = general;
    }
}
