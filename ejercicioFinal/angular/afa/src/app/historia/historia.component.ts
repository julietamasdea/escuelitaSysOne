import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Historia } from './historia';
import { HistoriaService } from './historia.service';

@Component({
  selector: 'app-historia',
  templateUrl: './historia.component.html'
})
export class HistoriaComponent implements OnInit {
  public historias: Historia[];
  title = 'Historias'

  constructor(public historiasService: HistoriaService) {
  }
  ngOnInit() {
    this.historiasService.getHistoria().subscribe(
      historias => this.historias = historias
    );
  }


}
