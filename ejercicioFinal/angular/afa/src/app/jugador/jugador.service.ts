import { Injectable } from '@angular/core';
import { Jugador } from './jugador';
import { Observable } from 'rxjs';
import { of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable()
export class JugadorService {

  public httpHeaders = new HttpHeaders({'Content-type': 'application/json'});
  public urlEndPointGetJugadores: string = 'http://localhost:8080/jugador/';
  public urlEndPointDelete: string = 'http://localhost:8080/jugador/delete/';
  constructor(public http: HttpClient) { }

  getJugador(): Observable<Jugador[]> {
    return this.http.get<Jugador[]>(this.urlEndPointGetJugadores);
  }

  create(jugador: Jugador): Observable<Jugador> {
    return this.http.post<Jugador>(this.urlEndPointGetJugadores, jugador, {headers: this.httpHeaders});
  }
}
