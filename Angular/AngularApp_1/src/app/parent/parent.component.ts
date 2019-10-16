import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  selectedCar;

  cars = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg', 
      name : 'BMW'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2014/09/07/22/34/car-race-438467__340.jpg',
      name : 'Lamberghini'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg', 
      name : 'Audi'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2012/11/02/13/02/ford-63930__340.jpg',
      name : 'Unknown'
    }
  ];
  constructor() { }

  ngOnInit() {
  }

  sendCar(car) {
    this.selectedCar = car; 
    console.log(car);
  }
}
