package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name = "locations")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;

    @Column(name = "street")
    private String Street_Address;

    @Column(name = "postal")
    private String PostalCode;

    @Column(name = "city")
    private String City;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country Country;

}
