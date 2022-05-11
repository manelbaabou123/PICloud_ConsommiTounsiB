import { Component, OnInit } from '@angular/core'; 
import { EventService } from 'src/app/services/event.service';
import { MatDialog,MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { AddeventComponent } from '../addevent/addevent.component';

@Component({
  selector: 'app-withdrawal',
  templateUrl: './withdrawal.component.html',
  styleUrls: ['./withdrawal.component.scss']
})
export class WithdrawalComponent implements OnInit {

 
  public withdrawal = [
    { id: 1, invoiceId: '#0045', orderIds: ['#2485', '#4152', '#8574'], storeId: 1, amount: 20, charges: 0, payment: 20, date: new Date(2020,1,15,10,45) },
    { id: 2, invoiceId: '#5288', orderIds: ['#7455'], storeId: 2, amount: 45, charges: 5, payment: 50, date: new Date(2020,3,20,12,15) },
    { id: 3, invoiceId: '#6318', orderIds: ['#6122','#8710'], storeId: 2, amount: 30, charges: 0, payment: 30, date: new Date(2020,4,5,18,25) }
  ];
  public stores = [
    { id: 1, name: 'Store 1' },
    { id: 2, name: 'Store 2' }
  ];
  public page: any;
  public count = 6;

  public Event :any ;
  constructor(private _eventService : EventService,private dialag:MatDialog) {

   }

  ngOnInit(): void {
    this.getEvent();
  }

  getEvent(){
    this._eventService.getEvent().subscribe(res => {
      console.log('sa :' , res);
      this.Event = res;
    })
  }


  public onPageChanged(event){
    this.page = event; 
    window.scrollTo(0,0); 
  }
  

  addEvent(){
    this._eventService.addEvent().subscribe(res => {     
      this.getEvent();
    })
  }

  DeleteEvent(idEvent){
    
    this._eventService.DeleteEvent(idEvent).subscribe(res => {     
      this.getEvent();
    })
  }

  open(){
    this.dialag.open(AddeventComponent,{
      width :'50%'
    }).afterClosed().subscribe(val=>{
      this.getEvent()
    })
  }

}
