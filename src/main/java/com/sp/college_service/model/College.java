package com.sp.college_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "college")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String clgName;
    private String clgCode;
    private String city;


}
