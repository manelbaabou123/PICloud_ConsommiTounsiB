import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, map, Observable } from 'rxjs';
import { env } from '../env/env';
import { Cagnotte } from '../models/Cagnotte';

@Injectable({
  providedIn: 'root'
})
export class CagnoteService {

  constructor(private http: HttpClient) { }

  addCagnotte(): Observable<any> {
    return this.http.put<any>(env.affectermoney, {}).pipe(map(res => {
      return res;
    }),
      catchError(errorRes => {
        return errorRes;
      }));
  }


  addCagnottes(): Observable<any> {
    return this.http.post<any>(env.addCagnotte, {}).pipe(map(res => {
      return res;
    }),
      catchError(errorRes => {
        return errorRes;
      }));
  }


  getCagnotte(){
    return this.http.get<any>(env.afficherCagnotte, {}).pipe(map(res => {
      return res;
    }),
      catchError(errorRes => {
        return errorRes;
      }));
  }


  DeleteCagnotte(idCagontte : any){
    return this.http.delete<any>(env.deleteCanogette+`/${idCagontte}`, {}).pipe(map(res => {
      return res;
    }),
      catchError(errorRes => {
        return errorRes;
      }));
  }


  gettopdonnater(){
    return this.http.get<any>(env.gettopdonnater, {}).pipe(map(res => {
      return res;
    }),
      catchError(errorRes => {
        return errorRes;
      }));
  }


  getwinner(){
    return this.http.get<any>(env.getwinner, {}).pipe(map(res => {
      return res;
    }),
      catchError(errorRes => {
        return errorRes;
      }));
  }
  

}
