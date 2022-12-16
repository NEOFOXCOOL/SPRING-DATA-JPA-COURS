package com.sdjpa.sdjpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(
        name = "student_id_card"
)
@Table(
        name = "student_id_card",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "student_id_card_number_unnique",
                        columnNames = "student_id_card_number"
                )
        }
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Student_Id_Card {
    @Id
    @SequenceGenerator(
            name = "card_squence",
            sequenceName = "card_squence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "card_sequence"
    )
    @Column(
            name = "card_id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "student_id_card_number",
            nullable = false
    )
    private String card_number;

    @Column(
            name = "student",
            nullable = false
    )
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            referencedColumnName = "id",
            name = "student_id"
    )
    private Student student;
}
