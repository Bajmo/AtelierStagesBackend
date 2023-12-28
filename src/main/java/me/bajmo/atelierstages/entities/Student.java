package me.bajmo.atelierstages.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String branch;
    @Column(name = "`group`", nullable = false) // Because 'group' is a SQL keyword, at least for the SQL dialect used
    private int group;
    private String phone;
    private String email;

}