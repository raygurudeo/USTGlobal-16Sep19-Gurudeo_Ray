import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
    selector: 'app-home',
    templateUrl: './home.component.html',
    styleUrls: ['./home.component.css']
})
export class HomeComponent {
    // imgUrl = 'https://cdn.pixabay.com/photo/2019/09/01/12/59/traffic-4445171__340.jpg';
    // heightValue = '200px';
    // widthValue = '200px';
    // boxShadowValue = '0 0 10px black';
    // isActive = true;
    // isRoundedCircle = true;
    // marginTop = '20px';
    // margin = 'auto';
    // constructor() { }
    news;
    constructor(private http: HttpClient) {
        this.getNews();
    }
    getNews() {
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=87f98b996fbf48e4b4ff0e00db63b02b').subscribe(data => {
            this.news = data.articles;
        }, err => {
            console.log(err);
        }, () => {
            console.log('news got successfully');
        });
    }
}


