package cau01.kiemtratk.student.tdl_cau1;

public class Movie {
    private String name;
    private String country;
    private String price;

    public Movie(String name, String country, String price) {
        this.name = name;
        this.country = country;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
