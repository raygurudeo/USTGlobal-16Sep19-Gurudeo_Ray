import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './login/login.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { TwoDataBindingComponent } from './data-binding/two-data-binding/two-data-binding.component';
import { NgIfComponent } from './directives/structural-directive/ng-if/ng-if.component';
import { NgForComponent } from './directives/structural-directive/ng-for/ng-for.component';
import { NgSwitchComponent } from './directives/structural-directive/ng-switch/ng-switch.component';
import { RegisterComponent } from './register/register.component';
import { Form1Component } from './form1/form1.component';
import { Form3Component } from './form3/form3.component';
import { Form2Component } from './form2/form2.component';
import { Form4Component } from './form4/form4.component';
import { ReactiveFormsModule } from '@angular/forms';
import { ParentComponent } from './parent/parent.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'about', component: AboutComponent },
  { path: 'help', component: HelpComponent },
  { path: 'login', component: LoginComponent },
  { path: 'propety-binding', component: PropertyBindingComponent },
  { path: 'event-binding', component: EventBindingComponent },
  { path: 'two-way-binding', component: TwoDataBindingComponent },
  { path: 'ng-if', component: NgIfComponent },
  { path: 'ng-for', component: NgForComponent },
  { path: 'ng-switch', component: NgSwitchComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'form1', component: Form1Component },
  { path: 'form3', component: Form3Component},
  { path: 'form2', component: Form2Component},
  { path: 'form4', component: Form4Component},
  { path: 'reactive-form', component: ReactiveFormsModule},
  { path: 'parent', component: ParentComponent},
  { path: 'comment-details', component: CommentDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
