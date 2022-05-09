import { Component, OnInit } from '@angular/core';
import { CagnoteService } from 'src/app/services/cagnote.service';

@Component({
  selector: 'app-refund',
  templateUrl: './refund.component.html',
  styleUrls: ['./refund.component.scss']
})
export class RefundComponent implements OnInit {
  public refunds = [
    { id: 1, requestId: '#0045', orderId: '#2485', storeId: 1, amount: 20, type: 'Full refund', reason: 'Not happy', date: new Date(2020,1,15,10,45) },
    { id: 2, requestId: '#5288', orderId: '#7455', storeId: 2, amount: 45, type: 'Full refund', reason: 'Bad package', date: new Date(2020,3,20,12,15) },
    { id: 3, requestId: '#6318', orderId: '#6122', storeId: 2, amount: 30, type: 'Full refund', reason: 'Product broken', date: new Date(2020,4,5,18,25) }
  ];
  public stores = [
    { id: 1, name: 'Store 1' },
    { id: 2, name: 'Store 2' }
  ];
  public page: any;
  public count = 6;

  public Cagnottes : any;
  constructor(private _cagnoteService : CagnoteService) { }

  ngOnInit(): void {
    this.getCagnottes();
  }

  getCagnottes(){
    this._cagnoteService.getCagnotte().subscribe(res => {
      console.log('sa :' , res);
      this.Cagnottes = res;
    })
  }


  gettopdonnater(){
    this._cagnoteService.gettopdonnater().subscribe(res => {
         alert(res.username)
    })
  }


  getwinner(){
    this._cagnoteService.getwinner().subscribe(res => {
         alert(res.username)
    })
  }


  public onPageChanged(event){
    this.page = event; 
    window.scrollTo(0,0); 
  }


  addCagnotte(){
    this._cagnoteService.addCagnottes().subscribe(res => {     
      this.getCagnottes();
    })
  }


  deleteCagnotte(idCagontte){
    
    this._cagnoteService.DeleteCagnotte(idCagontte).subscribe(res => {     
      this.getCagnottes();
    })
  }

}
