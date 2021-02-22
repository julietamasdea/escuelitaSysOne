import { Injectable } from '@angular/core';
import { Equipo } from './equipo';
import { Observable } from 'rxjs';
import { of } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable()
export class EquipoService {
  public urlEndPointGetEquipos: string = 'http://localhost:8080/equipo/';
  public urlEndPointGetDefensores: string = 'http://localhost:8080/equipo/defensores/';
  public urlEndPointGetJugadores: string = 'http://localhost:8080/equipo/jugadores/';
  constructor(public http: HttpClient) { }

  getEquipos(): Observable<Equipo[]> {
    return this.http.get<Equipo[]>(this.urlEndPointGetEquipos);
  }

  getDefensoresService(cuit: number): Observable<any> {
    return this.http.get(this.urlEndPointGetDefensores+cuit);
  }
}
