package com.example.app4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="STUDENT_TBL")
public class Student {

    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private String email;

}
