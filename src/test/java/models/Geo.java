package models;

import lombok.Data;
@Data
public class Geo {
    private String lat;
    private String lng;

//    public Geo(String lat, String lng) {
//        this.lat = lat;
//        this.lng = lng;
//    }
//
//    public Geo() {
//    }
//
//    public String getLat() {
//        return lat;
//    }
//
//    public String getLng() {
//        return lng;
//    }
//
//    @Override
//    public String toString() {
//        return "Geo{" +
//                "lat='" + lat + '\'' +
//                ", lng='" + lng + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Geo geo = (Geo) o;
//
//        if (!Objects.equals(lat, geo.lat)) return false;
//        return Objects.equals(lng, geo.lng);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = lat != null ? lat.hashCode() : 0;
//        result = 31 * result + (lng != null ? lng.hashCode() : 0);
//        return result;
//    }
}
