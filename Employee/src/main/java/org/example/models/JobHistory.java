package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;


@Entity
@Table(name = "jobHistories")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobHistory {

    @Id
    @GeneratedValue(strategy  = GenerationType.AUTO)
    private UUID Id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee Employee;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job Job;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department Department;

    @Column(name = "job_start_date")
    private LocalDateTime StartDate;

}
