import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RegisterComponent } from './site/register/register.component';
import { LoginComponent } from './site/login/login.component';
import { MentorDetailsComponent } from './site/mentor-details/mentor-details.component';
import { SearchComponent } from './search/search.component';
import { MentorHomeComponent } from './mentor-home/mentor-home.component';
import { AddSkillComponent } from './mentor-home/add-skill/add-skill.component';
import { CalendarComponent } from './calendar/calendar.component';
@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    LoginComponent,
    MentorDetailsComponent,
    SearchComponent,
    MentorHomeComponent,
    AddSkillComponent,
    CalendarComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
