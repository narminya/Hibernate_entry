package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name = "departments")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy  = GenerationType.AUTO)
    private UUID Id;
    @Column(name = "department_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employee Manager;


}
