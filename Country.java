/**
 * Country class containing nested City class,
 * with variables & methods for linked list nodes.
 */
package nestedclasscountries;

public class Country {

    //Node variables, getters & setters for doubly linked list
    private Country prev;

    public Country getPrev() {
        return prev;
    }

    public void setPrev(Country prev) {
        this.prev = prev;
    }

    private Country next;

    public Country getNext() {
        return next;
    }

    public void setNext(Country next) {
        this.next = next;
    }

    //--------------------------------------------------------------------------
    //Variables for Country
    private String countryName;
    private City cn;//instance of inner City class

    //Getter and setter for countryName
    public String getCountry() {
        return countryName;
    }

    public void setCountry(String countryName) {
        this.countryName = countryName;
    }

    //Empty constructor
    public Country() {
    }

    //Country constructor
    public Country(String countryName, String cityName) {
        this.countryName = countryName;
        cn = new City(cityName);
    }

    //Getter to retrieve city name from nested class "City"
    public String getCity() {
        return cn.cityName;
    }

    //Display country, and the city retrieved from nested class "City"
    public String displayData() {
        return ("Country: " + countryName
                + "\tCity: " + cn.cityName);
    }

    //--------------------------------------------------------------------------
    //Nested class
    private class City {

        private String cityName;

        //constructor
        public City(String cityName) {
            this.cityName = cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getCityName(String cityName) {
            return cityName;
        }
    }
}
