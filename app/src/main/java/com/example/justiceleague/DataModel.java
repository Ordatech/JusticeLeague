package com.example.justiceleague;

public class DataModel {

    String heroName;
    String heroPrivateName;
    int id_;
    int image;
    String Description;


    public DataModel(String heroName, String heroPrivateName, int id_, int image, String description) {
        this.heroName = heroName;
        this.heroPrivateName = heroPrivateName;
        this.id_ = id_;
        this.image = image;
        this.Description = description;
    }

    public String getHeroName() {
        return heroName;
    }
    public String getHeroPrivateName() {
        return heroPrivateName;
    }

    public int getId_() {
        return id_;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() { return Description; }
}
