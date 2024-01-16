package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name = "countries")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy  = GenerationType.AUTO)
    private UUID Id;

    @Column(name = "country_name")
    private String Name;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region Region;

}
