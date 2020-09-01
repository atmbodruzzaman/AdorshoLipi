package com.example.borshon.sd4;

public class Model {

    String title;
    String desc;
    int icon;

    public String getTitle() {
        return this.title;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getIcon() {
        return this.icon;
    }

    public Model(String title, String desc, int icon) {

        this.title = title;
        this.desc = desc;
        this.icon = icon;
    }
}
