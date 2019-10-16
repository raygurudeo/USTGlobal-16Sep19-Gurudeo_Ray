import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-laptop',
  templateUrl: './laptop.component.html',
  styleUrls: ['./laptop.component.css']
})
export class LaptopComponent implements OnInit {

  selectLaptop;
  laptops = [
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2015/01/08/18/24/children-593313__340.jpg',
      name: 'Apple',
      model: 'Model: 2010',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'
    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2016/03/27/07/12/apple-1282241__340.jpg',
      name: 'Dell',
      model: 'Model: 2013',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'

    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2016/06/28/05/10/laptop-1483974__340.jpg',
      name: 'HP',
      model: 'Model: 2017',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'

    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2015/01/14/18/41/home-office-599475__340.jpg',
      name: 'Lenovo',
      model: 'Model: 2011',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'

    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2015/05/15/02/07/computer-767781__340.jpg',
      name: 'Acer',
      model: 'Model: 2015',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'

    }
  ];
  constructor() { }

  ngOnInit() {
  }
  sendLaptop(laptop) {
    this.selectLaptop = laptop;
    console.log(laptop);
  }

}
