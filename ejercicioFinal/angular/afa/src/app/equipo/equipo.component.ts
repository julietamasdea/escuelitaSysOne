import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Equipo } from './equipo';
import { EquipoService } from './equipo.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-equipo',
  templateUrl: './equipo.component.html'
})
export class EquipoComponent implements OnInit {
  public equipos: Equipo[];
  public defensores: any;
  title = 'Equipos'

  constructor(public equiposService: EquipoService) {
  }
  ngOnInit() {
    this.equiposService.getEquipos().subscribe(
      equipos => this.equipos = equipos
    );
  }


}
