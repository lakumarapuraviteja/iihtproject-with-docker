import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterComponent } from './site/register/register.component';
import { LoginComponent } from './site/login/login.component';
import { MentorDetailsComponent } from './site/mentor-details/mentor-details.component';
import { SkillGuardService } from './site/skill-guard.service';
import { SearchComponent } from './search/search.component';
import { MentorHomeComponent } from './mentor-home/mentor-home.component';
import { MentorGuardService } from './mentor-home/mentor-guard.service';
import { AddSkillComponent } from './mentor-home/add-skill/add-skill.component';
import { CalendarComponent } from './calendar/calendar.component';


const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'mentorDetails', component: MentorDetailsComponent, canActivate: [SkillGuardService] },
  { path: 'search', component: SearchComponent },
  { path: 'mentorHome', component: MentorHomeComponent, canActivate: [MentorGuardService]},
  { path: 'addSkill', component: AddSkillComponent, canActivate:[MentorGuardService]},
  { path: 'calendar', component: CalendarComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
