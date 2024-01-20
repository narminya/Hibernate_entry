package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;


@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "room_no")
    private String no;

    @Column(name = "room_name")
    private String name;

    @OneToMany(mappedBy = "room", fetch = FetchType.EAGER)
    List<Course> courses;
}
