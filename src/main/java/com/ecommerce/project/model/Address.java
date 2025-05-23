package com.ecommerce.project.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "addresses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addressId;

    @NotBlank
    @Size(min = 5, message = "Street name must be 5 characters")
    private String street;


    @NotBlank
    @Size(min = 5, message = " Name must be 5 characters")
    private String buildingName;

    @NotBlank
    @Size(min = 4, message = " City must be 2 characters")
    private String city;


    @NotBlank
    @Size(min = 2, message = " State must be 2 characters")
    private String state;

    @NotBlank
    @Size(min = 2, message = " country must be 2 characters")
    private String country;

    @NotBlank
    @Size(min = 6, message = " Pincode must be 6 characters")
    private String pincode;

    @ToString.Exclude
    @ManyToMany(mappedBy = "addresses")
    private List<User> users = new ArrayList<>();


    public Address(String street, String country, String buildingName, String city, String state, String pincode) {
        this.street = street;
        this.country = country;
        this.buildingName = buildingName;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
}
