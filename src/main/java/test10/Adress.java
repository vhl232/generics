package test10;

public class Adress {
    private String country;
    private String city;
    private String street;
    private int houseNumber;
    private int flatNumber;

    public Adress(String country, String city, String street, int houseNumber, int flatNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Adress adress = (Adress) o;

        if (houseNumber != adress.houseNumber) return false;
        if (flatNumber != adress.flatNumber) return false;
        if (country != null ? !country.equals(adress.country) : adress.country != null) return false;
        if (city != null ? !city.equals(adress.city) : adress.city != null) return false;
        return street != null ? street.equals(adress.street) : adress.street == null;

    }

    @Override
    public int hashCode() {
        int result = country != null ? country.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + houseNumber;
        result = 31 * result + flatNumber;
        return result;
    }
}
