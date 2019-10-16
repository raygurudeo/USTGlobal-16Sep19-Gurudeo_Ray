import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {

  selectedCar;
  cars = [
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg',
      name: 'Bugati',
      model: 'Model: 2006',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'
    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2017/03/27/14/56/auto-2179220__340.jpg',
      name: 'Mercedez',
      model: 'Model: 2000',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'

    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2017/03/20/04/57/truck-2158284__340.png',
      name: 'Lamberghini',
      model: 'Model: 2010',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'

    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2016/05/24/17/43/mercedes-sls-1412863__340.jpg',
      name: 'Ferari',
      model: 'Model: 2005',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'

    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2018/02/21/03/15/bmw-m4-3169357__340.jpg',
      name: 'BMW',
      model: 'Model: 2015',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'

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
