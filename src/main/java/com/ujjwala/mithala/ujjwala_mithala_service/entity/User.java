package com.ujjwala.mithala.ujjwala_mithala_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
@Table(name ="User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;
    private String Name;
    private String Email;
    private String PhoneNumber;
}
