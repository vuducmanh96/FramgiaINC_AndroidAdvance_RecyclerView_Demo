package com.example.ducmanh96.framgiainc_androidadvance_recyclerview_demo;

class item {
    int idImage;
    String heroName;

    public item(int idImage, String heroName) {
        this.idImage = idImage;
        this.heroName = heroName;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
}
