import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { JugadorComponent } from './jugador/jugador.component';
import { EquipoComponent } from './equipo/equipo.component';
import { EquipoService } from './equipo/equipo.service';
import { JugadorService } from './jugador/jugador.service';
import { HistoriaService } from './historia/historia.service';
import { InicioComponent } from './inicio/inicio.component';
import { HistoriaComponent } from './historia/historia.component';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { FormComponent } from './jugador/form.component';

const routes: Routes = [
  {path: '', redirectTo: '/inicio', pathMatch: 'full'},
  {path: 'inicio', component:InicioComponent},
  {path: 'jugadores', component: JugadorComponent},
  {path: 'equipos', component: EquipoComponent},
  {path: 'historias', component: HistoriaComponent},
  {path: "jugadores/form", component: FormComponent},
  {path: "jugadores/form/:id", component: FormComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    EquipoComponent,
    JugadorComponent,
    HistoriaComponent,
    FormComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [EquipoService, JugadorService, HistoriaService],
  bootstrap: [AppComponent]
})
export class AppModule { }
