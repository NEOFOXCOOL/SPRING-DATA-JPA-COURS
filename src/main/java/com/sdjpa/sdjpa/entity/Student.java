package com.sdjpa.sdjpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(
            name = "student_id"
    )
    private Long id;
    @Column(
            name = "student_first_name"
    )
    private String first_name;
    @Column(
            name = "student_last_name"
    )
    private String Last_name;
    @Column(
            name = "student_age"
    )
    private Integer age;
    @Column(
            name = "student_email"
    )
    private String email;
    @Column(
            name = "student_num_telephone"
    )
    private String num_telephone;
}
