import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Jugador } from './jugador';
import { JugadorService } from './jugador.service';

@Component({
  selector: 'app-jugador',
  templateUrl: './jugador.component.html'
})
export class JugadorComponent implements OnInit {
  public jugadores: Jugador[];
  public defensores: any;
  title = 'Jugadores'

  constructor(public jugadorService: JugadorService) {
  }


  ngOnInit(): void {
    this.jugadorService.getJugador().subscribe(
      jugadores => this.jugadores = jugadores
    );
  }

}
