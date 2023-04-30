package models;

import lombok.Data;

@Data
public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

//    public Address(String street, String suite, String city, String zipcode, Geo geo) {
//        this.street = street;
//        this.suite = suite;
//        this.city = city;
//        this.zipcode = zipcode;
//        this.geo = geo;
//    }
//
//        public String getStreet() {
//        return street;
//    }
//
//    public String getSuite() {
//        return suite;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public String getZipcode() {
//        return zipcode;
//    }
//
//    public Geo getGeo() {
//        return geo;
//    }
//
//    public Address() {
//    }
//
//    @Override
//    public String toString() {
//        return "Address{" +
//                "street='" + street + '\'' +
//                ", suite='" + suite + '\'' +
//                ", city='" + city + '\'' +
//                ", zipcode='" + zipcode + '\'' +
//                ", geo=" + geo +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Address address = (Address) o;
//
//        if (!Objects.equals(street, address.street)) return false;
//        if (!Objects.equals(suite, address.suite)) return false;
//        if (!Objects.equals(city, address.city)) return false;
//        if (!Objects.equals(zipcode, address.zipcode)) return false;
//        return Objects.equals(geo, address.geo);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = street != null ? street.hashCode() : 0;
//        result = 31 * result + (suite != null ? suite.hashCode() : 0);
//        result = 31 * result + (city != null ? city.hashCode() : 0);
//        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
//        result = 31 * result + (geo != null ? geo.hashCode() : 0);
//        return result;
//    }
}
