import { Component, OnInit } from '@angular/core';
import { TrainingService } from '../training.service';

@Component({
  selector: 'app-calendar',
  templateUrl: './calendar.component.html',
  styleUrls: ['./calendar.component.css']
})
export class CalendarComponent implements OnInit {
  trainingList:any;

  constructor(private trainingService:TrainingService) { }

  ngOnInit() {
    this.trainingService.getIncompleteTrainingObservable().subscribe(
      (data)=>{
        this.trainingList = data;
      }
      
    )
  }

}
