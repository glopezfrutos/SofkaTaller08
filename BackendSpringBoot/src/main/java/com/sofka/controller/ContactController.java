package com.sofka.controller;

import com.sofka.domain.Contact;
import com.sofka.service.ContactService;
import com.sofka.util.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ContactController {

    @Autowired
    private ContactService contactService;

    private Response response = new Response();

    @GetMapping(path = "/")
    public String index() {
        return "Hola mundo";
    }

    @GetMapping(path = "/contacts")
    public List<Contact> list() {
        return contactService.list();
    }

    @GetMapping(path = "/contact/{id}")
    public Optional<Contact > getContact(Contact contact) {
        return contactService.findContact(contact);
    }

    @PostMapping(path = "/contact")
    public ResponseEntity<Contact> create(Contact contact) {
        log.info("Contacto a crear: {}", contact);
        contactService.save(contact);
        return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/contact/{id}")
    public ResponseEntity<Contact> delete(Contact contact) {
        log.info("Contacto a eliminar: {}", contact);
        contactService.delete(contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @PutMapping(path = "/contact/{id}")
    public ResponseEntity<Response> update(Contact contact, @PathVariable("id") Long id) {
        try {
            log.info("Contacto a modificar: {}", contact);
            contactService.update(id, contact);
            response.data = contact;
            return new ResponseEntity<Response>(response, HttpStatus.OK);
        } catch (Exception exc) {
            response.status = exc.getCause().toString();
            response.error = true;
            response.message = "No se pudo actualizar el contacto";
            return new ResponseEntity<Response>(response, HttpStatus.CONFLICT);
        }

    }

    @PatchMapping(path = "/contact/firstname/{id}")
    public ResponseEntity<Contact> updateFirstName(Contact contact, @PathVariable("id") Long id) {
        log.info("Contacto a modificar nombre: {}", contact);
        contactService.updateFirstName(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @PatchMapping(path = "/contact/lastname/{id}")
    public ResponseEntity<Contact> updateLastName(Contact contact, @PathVariable("id") Long id) {
        log.info("Contacto a modificar apellido: {}", contact);
        contactService.updateLastName(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);}

    @PatchMapping(path = "/contact/email/{id}")
    public ResponseEntity<Contact> updateEMail(Contact contact, @PathVariable("id") Long id) {
        log.info("Contacto a modificar eMail: {}", contact);
        contactService.updateEMail(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @PatchMapping(path = "/contact/dateofbirth/{id}")
    public ResponseEntity<Contact> updateDateOfBirth(Contact contact, @PathVariable("id") Long id) {
        log.info("Contacto a modificar fecha de nacimiento: {}", contact);
        contactService.updateDateOfBirth(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @PatchMapping(path = "/contact/isdeleted/{id}")
    public ResponseEntity<Contact> updateIsDeleted(Contact contact, @PathVariable("id") Long id) {
        log.info("Contacto a borrar: {}", contact);
        contactService.updateIsDeleted(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }
}
