import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, map, Observable } from 'rxjs';
import { env } from '../env/env';
import { Cagnotte } from '../models/Cagnotte';
import { Event } from '../models/Event';

@Injectable({
  providedIn: 'root'
})
export class EventService {

  constructor(private http: HttpClient) { }

  addEvent(): Observable<any> {
    return this.http.post<any>(env.addEvent, {}).pipe(map(res => {
      return res;
    }),
      catchError(errorRes => {
        return errorRes;
      }));
  }

  addEventWithDetails(event:Event){
    return this.http.post(env.addEventWithDetails,event);
  }

  getEvent(){
    return this.http.get<any>(env.afficherEvent, {}).pipe(map(res => {
      return res;
    }),
      catchError(errorRes => {
        return errorRes;
      }));
  }

  DeleteEvent(idEvent : any){
    return this.http.delete<any>(env.deleteEvent+`/${idEvent}`, {}).pipe(map(res => {
      return res;
    }),
      catchError(errorRes => {
        return errorRes;
      }));
  }
geteventtaux(){
  return this.http.get<Object[]>(env.baseURL+env.gettauxevent);
}

}
