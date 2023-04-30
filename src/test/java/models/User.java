package models;

import lombok.Data;


@Data
public class User {
    private Integer id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

//    public User(int id, String chelsey_dietrich, String kamren, String email, String skiles_walks, String phone, String website, String keebler_llc) {
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public String getWebsite() {
//        return website;
//    }
//
//    public Company getCompany() {
//        return company;
//    }
//
//    public User(Integer id, String name, String username, String email, Address address, String phone, String website, Company company) {
//        this.id = id;
//        this.name = name;
//        this.username = username;
//        this.email = email;
//        this.address = address;
//        this.phone = phone;
//        this.website = website;
//        this.company = company;
//
//
//    }
//
//    public User() {
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        User that = (User) o;
//
//        if (!Objects.equals(id, that.id)) return false;
//        if (!Objects.equals(name, that.name)) return false;
//        if (!Objects.equals(username, that.username)) return false;
//        if (!Objects.equals(email, that.email)) return false;
//        if (!Objects.equals(address, that.address)) return false;
//        if (!Objects.equals(phone, that.phone)) return false;
//        if (!Objects.equals(website, that.website)) return false;
//        return Objects.equals(company, that.company);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id != null ? id.hashCode() : 0;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (username != null ? username.hashCode() : 0);
//        result = 31 * result + (email != null ? email.hashCode() : 0);
//        result = 31 * result + (address != null ? address.hashCode() : 0);
//        result = 31 * result + (phone != null ? phone.hashCode() : 0);
//        result = 31 * result + (website != null ? website.hashCode() : 0);
//        result = 31 * result + (company != null ? company.hashCode() : 0);
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", username='" + username + '\'' +
//                ", email='" + email + '\'' +
//                ", address=" + address +
//                ", phone='" + phone + '\'' +
//                ", website='" + website + '\'' +
//                ", company=" + company +
//                '}';
//    }
}