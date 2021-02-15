package lt.bit.obj.p19;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JSONDemo {

    public static void main(String[] args) throws JsonProcessingException {

        List<Company> companies = new ArrayList<>();
        companies.add(new Company(
                "Microsoft",
                new BigDecimal("10002222.33"),
                new Address("NY-1222", "New York")));
        companies.add(new Company(
                "Google",
                new BigDecimal("99998888.33"),
                new Address("LT-3322", "Kaunas")));

        // ...
        String json = "[{\"name:" + companies.get(0).getName() + "...";

        System.out.println(json);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        json = objectMapper.writeValueAsString(companies);

        System.out.println(json);

        // verciame atgal i List'a
        // Company[] arr = objectMapper.readValue(json, Company[].class);
        companies = objectMapper.readValue(json, new TypeReference<List<Company>>(){});
        System.out.println(companies);

        // tarkime JSON turime viena objekta, o ne List'a
        json = objectMapper.writeValueAsString(companies.get(0));

        Company company = objectMapper.readValue(json, Company.class);
        System.out.println(company);

    }

}

class Company {
    private String name;
    private BigDecimal debt;
    private Address address;

    public Company() {
    }

    public Company(String name, BigDecimal debt, Address address) {
        this.name = name;
        this.debt = debt;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getDebt() {
        return debt;
    }

    public void setDebt(BigDecimal debt) {
        this.debt = debt;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", debt=" + debt +
                ", address=" + address +
                '}';
    }
}


class Address {
    private String index;
    private String city;

    public Address() {}

    public Address(String index, String city) {
        this.index = index;
        this.city = city;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "index='" + index + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}