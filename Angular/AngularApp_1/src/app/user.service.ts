import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {map} from 'rxjs/operators';
import { from } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  fireBaseUrl = 'https://ust-ty-84f93.firebaseio.com/';
  constructor(public http: HttpClient) { }
  postUser(data) {
    console.log('Service', data);
    return this.http.post(`${this.fireBaseUrl}/users.json`, data);
  }
  getUsers() {
    return this.http.get(`${this.fireBaseUrl}/users.json`).pipe(
      map(data => {
        const newArray = [];
        // tslint:disable-next-line:forin
        for (const key in data) {
          newArray.push({...data[key], id : key}); 
        }
        return newArray;
      })
    );
  }

  updateUser(id, data) {
    return this.http.put(`${this.fireBaseUrl}/users/${id}.json`, data);
  }
  deleteUser(id) {
    return this.http.delete(`${this.fireBaseUrl}/users/${id}.json`);
  }
}
