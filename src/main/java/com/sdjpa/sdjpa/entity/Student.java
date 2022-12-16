package com.sdjpa.sdjpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(
        name = "student"
)
@Table(
        name ="student",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "student_email_unique",
                        columnNames = "student_email"
                )
        }
)
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(
            name = "student_id",
            nullable = false,
            updatable = false
    )
    private Long id;
    @Column(
            name = "student_first_name",
            nullable = false
    )
    private String first_name;
    @Column(
            name = "student_last_name",
            nullable = false
    )
    private String Last_name;
    @Column(
            name = "student_age",
            nullable = false
    )
    private Integer age;
    @Column(
            name = "student_email",
            nullable = false
    )
    private String email;
    @Column(
            name = "student_num_telephone",
            nullable = false
    )
    private String num_telephone;
}
