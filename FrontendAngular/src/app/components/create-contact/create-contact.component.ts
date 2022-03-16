import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {ActivatedRoute, Router} from "@angular/router";
import {ApiService} from "../../services/api/api.service";
import { ContactI } from '../../models/contact.interface';
import {HttpParams} from "@angular/common/http";
import {ContactListInterface} from "../../models/contactList.interface";




@Component({
  selector: 'app-create-contact',
  templateUrl: './create-contact.component.html',
  styleUrls: ['./create-contact.component.css']
})
export class CreateContactComponent implements OnInit {
  newContactForm = new FormGroup({
    // id: new FormControl(''),
    firstName: new FormControl(''),
    lastName: new FormControl(''),
    dateOfBirth: new FormControl(''),
    email: new FormControl(''),
    // isDeleted: new FormControl(0)
  });

  constructor(private activerouter:ActivatedRoute,
              private router:Router,
              private api:ApiService) { }

  ngOnInit(): void {
    this.api.postContact(
      {
        firstName: "a",
        lastName: "a",
        email: "a@a.com",
        dateOfBirth: "1986-01-01"
      }
    ).subscribe(data=>console.log(data))
  }

  submitNewContactForm(newContactForm:any){
    this.api
      .postContact(newContactForm)
      .subscribe(result =>
        console.log(result)
      )
    this.goBack()
  }


  goBack(){
    this.router.navigate(['list'])
  }

}
