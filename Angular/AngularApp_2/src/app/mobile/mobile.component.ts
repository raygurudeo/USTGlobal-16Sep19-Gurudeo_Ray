import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobile',
  templateUrl: './mobile.component.html',
  styleUrls: ['./mobile.component.css']
})
export class MobileComponent implements OnInit {

  selectMobile;
  mobiles = [
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2014/08/05/10/30/iphone-410324__340.jpg',
      name: 'Iphone 6',
      model: 'Model: 2016',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'
    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2017/01/06/13/50/smartphone-1957740__340.jpg',
      name: 'Motorola G4',
      model: 'Model: 2017',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'

    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2017/05/29/16/42/woman-2354157__340.jpg',
      name: 'Samsung J7',
      model: 'Model: 2016',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'

    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2016/11/22/23/40/electronics-1851218__340.jpg',
      name: 'Mi',
      model: 'Model: 2016',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'

    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2015/01/02/00/01/telephone-586268__340.jpg',
      name: 'Asus Zenphone',
      model: 'Model: 2017',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'

    }
  ];
  constructor() { }

  ngOnInit() {
  }
  sendMobile(mobile) {
    this.selectMobile = mobile;
    console.log(mobile);
  }
}
