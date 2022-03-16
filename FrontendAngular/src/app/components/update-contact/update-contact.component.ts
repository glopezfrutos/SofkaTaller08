import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { ContactI } from '../../models/contact.interface';
import { ApiService } from "../../services/api/api.service";
import { FormGroup, FormControl, Validators } from "@angular/forms";
import {ResponseI} from '../../models/responseI.interface';
import {AlertsService} from "../../services/alerts/alerts.service";



@Component({
  selector: 'app-update-contact',
  templateUrl: './update-contact.component.html',
  styleUrls: ['./update-contact.component.css']
})
export class UpdateContactComponent implements OnInit {

  constructor(private activerouter:ActivatedRoute,
              private router:Router,
              private api:ApiService,
              private alertsService:AlertsService) { }

  updateForm = new FormGroup({
    // id: new FormControl(''),
    firstName: new FormControl(''),
    lastName: new FormControl(''),
    dateOfBirth: new FormControl(''),
    email: new FormControl(''),
    // isDeleted: new FormControl('')
  });

  ngOnInit(): void {
    let contactId = this.activerouter.snapshot.paramMap.get('id')
    this.api.getSingleContact(contactId).subscribe(data => {
      console.log(data)
      this.updateForm.setValue({
        'firstName': data.firstName,
        'lastName': data.lastName,
        'dateOfBirth': data.dateOfBirth,
        'email': data.email,
      })
      console.log(this.updateForm.value)
    })
  }

  submitUpdateForm(form:ContactI){
    let contactId = this.activerouter.snapshot.paramMap.get('id');
    this.api.putContact(contactId, this.updateForm.value)
      .subscribe(data =>
    console.log(data)
    )
    // console.log(this.updateForm.value)
    this.router.navigate(['list'])
  }

  hardDelete(){
    let contactId = this.activerouter.snapshot.paramMap.get('id');
    this.api.hardDelete(contactId)
      .subscribe(data => {

      //   if(data.status == "OK"){
      //     this.alertsService.showSuccess("Contacto eliminado", "Realizado")
      //   } else {
      //     this.alertsService.showError(data.response, "Error")
      // }
    })
    this.router.navigate(['list'])
  }

  goBack(){
    this.router.navigate(['list'])
  }


}
