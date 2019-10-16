import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { CarComponent } from './car/car.component';
import { BikeComponent } from './bike/bike.component';
import { MovieComponent } from './movie/movie.component';
import { LaptopComponent } from './laptop/laptop.component';
import { MobileComponent } from './mobile/mobile.component';
import { ChildCarComponent } from './car/child-car/child-car.component';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ChildBikeComponent } from './bike/child-bike/child-bike.component';
import { ChildLaptopComponent } from './laptop/child-laptop/child-laptop.component';
import { ChildMobileComponent } from './mobile/child-mobile/child-mobile.component';
import { NewsHeaderComponent } from './news/news-header/news-header.component';
import { NewsComponent } from './news/news.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    CarComponent,
    BikeComponent,
    MovieComponent,
    LaptopComponent,
    MobileComponent,
    ChildCarComponent,
    ChildBikeComponent,
    ChildLaptopComponent,
    ChildMobileComponent,
    NewsHeaderComponent,
    NewsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
