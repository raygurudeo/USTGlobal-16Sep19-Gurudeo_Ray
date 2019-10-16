import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {

  name = 'John';                    // Property binding
  imgUrl = 'https://cdn.pixabay.com/photo/2019/09/01/12/59/traffic-4445171__340.jpg';   // Property binding
  address = 'Madhubani, Bihar, 847228';                                                 // Property binding
  colorName = 'red';        // style binding
  isActive = false;
  colSpanValue = 2;
  // heightVal = '1200px';
  constructor() { }

  ngOnInit() {
    setInterval(() => {
      this.colorName = 'green';
      this.isActive = !this.isActive;
    }, 2000);
  }

}
