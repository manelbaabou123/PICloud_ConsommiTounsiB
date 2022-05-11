import { Component, OnInit } from '@angular/core';
import { MatDialog,MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Event } from 'src/app/models/Event';
import { EventService } from 'src/app/services/event.service';

@Component({
  selector: 'app-addevent',
  templateUrl: './addevent.component.html',
  styleUrls: ['./addevent.component.scss']
})
export class AddeventComponent implements OnInit {

  event:Event
  content:string=""
  constructor( private dialag:MatDialog,private eventService:EventService) { }

  ngOnInit(): void {
    this.event= new Event()

  }

  
  addEventWitrhDetails(){
    console.log(this.event)
    this.eventService.addEventWithDetails(this.event).subscribe(res => {     
      console.log(res)
    })
  }
 

}
