import { Component, OnInit } from '@angular/core';
import { Jugador } from './jugador';
import { Router, ActivatedRoute } from '@angular/router';
import { JugadorService } from './jugador.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {
  public jugador:Jugador = new Jugador();

  constructor(private jugadorService: JugadorService,
  private router: Router,
private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {

  }

public create(): void {
  console.log("Clicked!");
  console.log(this.jugador);
  this.jugadorService.create(this.jugador).subscribe(
    response => this.router.navigate(['/jugadores'])
  )
}
}
