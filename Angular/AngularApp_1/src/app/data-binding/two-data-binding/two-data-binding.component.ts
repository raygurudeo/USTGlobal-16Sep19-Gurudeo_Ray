import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-two-data-binding',
  templateUrl: './two-data-binding.component.html',
  styleUrls: ['./two-data-binding.component.css']
})
export class TwoDataBindingComponent implements OnInit {

  searchValue = 'Guru';
  constructor() { }

  ngOnInit() {
  }

}
