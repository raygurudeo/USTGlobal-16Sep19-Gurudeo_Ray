import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {

  inputData = '';
  constructor() { }

  ngOnInit() {
  }
  printAlertMsg() {
    alert('Hi hello');
  }
  dataInput(abcd) {
    console.log(abcd.target.value);
    this.inputData = abcd.target.value;
  }
}
