package com.sofka.domain;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.io.Serializable;

@Data
@Entity
@Table(name = "contact")
public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cont_id")
    private Long id;

    @Column(name = "cont_first_name")
    private String firstName;

    @Column(name = "cont_last_name")
    private String lastName;

    @Column(name = "cont_email")
    private String email;

    @Column(name = "cont_date_of_birth")
    private String dateOfBirth;

    @Column(name = "cont_is_deleted")
    private int isDeleted;
}
