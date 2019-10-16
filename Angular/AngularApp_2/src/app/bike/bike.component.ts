import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bike',
  templateUrl: './bike.component.html',
  styleUrls: ['./bike.component.css']
})
export class BikeComponent implements OnInit {

  selectBike;
  bikes = [
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2016/12/20/22/47/harley-1921700__340.jpg',
      name: 'Harley',
      model: 'Model: 2012',
      // tslint:disable-next-line:max-line-length
      description: 'The harley has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'
    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2016/11/29/10/21/bike-rider-1868996__340.jpg',
      name: 'Motercross',
      model: 'Model: 2013',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'

    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2016/01/19/16/46/motorcycle-1149389__340.jpg',
      name: 'Vintage',
      model: 'Model: 1996',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'

    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2013/03/11/12/44/bmw-92442__340.jpg',
      name: 'BMW K 1300',
      model: 'Model: 2018',
      // tslint:disable-next-line:max-line-length
      description: 'The BMW has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'

    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2019/07/17/14/27/bmw-500-4344066__340.png',
      name: 'BMW 500',
      model: 'Model: 2000',
      // tslint:disable-next-line:max-line-length
      description: 'The BMW 500 has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'

    }
  ];


  constructor() { }

  ngOnInit() {
  }
  sendBike(bike) {
    this.selectBike = bike;
    console.log(bike);
  }

}
