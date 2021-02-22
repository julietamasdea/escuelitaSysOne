import { Injectable } from '@angular/core';
import { Historia } from './historia';
import { Observable } from 'rxjs';
import { of } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable()
export class HistoriaService {
  public urlEndPointGetHistorias: string = 'http://localhost:8080/historia/';
  constructor(public http: HttpClient) { }

  getHistoria(): Observable<Historia[]> {
    return this.http.get<Historia[]>(this.urlEndPointGetHistorias);
  }

}
