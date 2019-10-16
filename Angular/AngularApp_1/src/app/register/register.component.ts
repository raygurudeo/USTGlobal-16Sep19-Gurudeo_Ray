import { Component, OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy {
                                                      // onit docheck etc are life cycle of angular
  users;
  selectedUser;
  today = new Date();
  constructor(private service: UserService) {
    console.log('constructor executed');
    this.getData();
  }
  ngOnInit() {
    console.log('Ng onit executed');
  }
  ngDoCheck() {
    console.log('Ng do check executed');
  }
  ngAfterViewInit() {
    console.log('ngAfterViewInit executed');
  }
  ngAfterViewChecked() {
    console.log('ngAfterViewChecked executed');
  }
  ngOnDestroy() {
    console.log('ngOnDestroy executed');
  }
  registerData(form: NgForm) {
    console.log(form.value);
    this.service.postUser(form.value).subscribe(data => {
      console.log(data);
      this.getData();
    }, err => {
      console.log(err);
    }, () => {
      console.log('Data posted successfully');
    });
  }
  getData() {
    this.service.getUsers().subscribe(data => {
      console.log(data);
      this.users = data;
    }, err => {
      console.log(err);
    }, () => {
      console.log('Data got successfully.');
    });
  }
  deleteData(user) {
    console.log(user);
    this.service.deleteUser(user.id).subscribe(data => {
      console.log(data);
      this.getData();   // to update table after deleting
    }, err => {
      console.log(err);
    }, () => {
      console.log('Data deleted successfully');
    });
  }
  selectUser(user) {
    console.log(user);
    this.selectedUser = user;
  }

  updateData(form) {
    console.log(form.value);
    this.service.updateUser(form.value.id, form.value).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('Data updated successfully');
    });
  }
}
