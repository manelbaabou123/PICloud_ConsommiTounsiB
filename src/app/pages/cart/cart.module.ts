import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { SharedModule } from '../../shared/shared.module';
import { CartComponent } from './cart.component';
import { CagnoteService } from 'src/app/services/cagnote.service';
import { Cagnotte } from 'src/app/models/Cagnotte';

export const routes = [
  { path: '', component: CartComponent, pathMatch: 'full' }
];

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
    SharedModule
  ],
  declarations: [
    CartComponent
  ]
})
export class CartModule {
Cagnotte:Cagnotte;
constructor (private cagnotteservice : CagnoteService){}

ngOnInit(): void {
this.Cagnotte=new Cagnotte();
}



save(){
  this.cagnotteservice.addCagnotte().subscribe({
        
  });
  console.log(this.Cagnotte)
}




 }
