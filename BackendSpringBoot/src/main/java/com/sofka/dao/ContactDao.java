package com.sofka.dao;

import com.sofka.domain.Contact;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface ContactDao extends CrudRepository<Contact, Long> {
    @Modifying
    @Query("update Contact con set con.firstName = :firstName where con.id = :id")
    public void updateFirstName(
            @Param(value = "id") Long id,
            @Param(value = "firstName") String firstName
            );

    @Modifying
    @Query("update Contact con set con.lastName = :lastName where con.id = :id")
    public void updateLastName(
            @Param(value = "id") Long id,
            @Param(value = "lastName") String lastName
    );

    @Modifying
    @Query("update Contact con set con.email = :email where con.id = :id")
    public void updateEMail(
            @Param(value = "id") Long id,
            @Param(value = "email") String email
    );

    @Modifying
    @Query("update Contact con set con.dateOfBirth = :dateOfBirth where con.id = :id")
    public void updateDateOfBirth(
            @Param(value = "id") Long id,
            @Param(value = "dateOfBirth") String dateOfBirth
    );

    @Modifying
    @Query("update Contact con set con.isDeleted = :isDeleted where con.id = :id")
    public void updateIsDeleted(
            @Param(value = "id") Long id,
            @Param(value = "isDeleted") int isDeleted
    );
}
