import { Component, OnInit, ElementRef, ViewChild } from '@angular/core';
import { EventService } from 'src/app/services/event.service';
import { montly_sales } from '../dashboard.data';

@Component({
  selector: 'app-montly-sales',
  templateUrl: './montly-sales.component.html',
  styleUrls: ['./montly-sales.component.scss']
})
export class MontlySalesComponent implements OnInit {
  public data: any[]; 
  public showLegend = false;
  public gradient = true;
  public colorScheme = {
    domain: ['#2F3E9E', '#D22E2E', '#378D3B']
  }; 
  public showLabels = true;
  public explodeSlices = true;
  public doughnut = false; 
  @ViewChild('resizedDiv') resizedDiv:ElementRef;
  public previousWidthOfResizedDiv:number = 0; 
  
  constructor(private service:EventService) { }

  ngOnInit(){
    console.log("hhhhhhh")

    this.service.geteventtaux().subscribe(
      Response=>{
      this.data=Response;
      console.log("hhhhhhh"+Response)
    })
  }
  
  public onSelect(event) {
    console.log(event);
  }

  ngAfterViewChecked() {    
  
  }

gettauxevent(){
  return this.service.geteventtaux().subscribe(
    Response=>{
    this.data=Response;
    console.log("hhhhhhh"+Response)
  })
}

}
