import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {

  proudts = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2013/07/12/15/06/acoustic-guitar-149427__340.png',
      name : 'Yahama',
      price : 10000
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/11/18/19/55/guitar-1836655__340.jpg',
      name : 'Kedence',
      price : 7000
    }
  ];
  constructor() { }

  ngOnInit() {
  }

}
