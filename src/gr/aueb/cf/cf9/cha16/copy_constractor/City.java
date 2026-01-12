package gr.aueb.cf.cf9.cha16.copy_constractor;

public class City {

    private String description;

    public  City(){

    }

    //Copy constractor
    public City(City city){
        this.description = city.description;
    }

    public City(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
