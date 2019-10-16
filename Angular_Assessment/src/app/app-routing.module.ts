import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { AddMoviesComponent } from './add-movies/add-movies.component';
import { MoviesComponent } from './movies/movies.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent},
  { path: 'addMovies', component: AddMoviesComponent},
  { path: 'movies', component: MoviesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
