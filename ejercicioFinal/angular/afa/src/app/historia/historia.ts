import { Jugador } from 'src/app/jugador/jugador';
import { Equipo } from 'src/app/equipo/equipo';

export class Historia {
  id: number;
  fechaInicio: Date;
  fechaFin: Date;
  nombreEquipo: string;
  posicionCancha: string;
  equipo: Equipo;
  jugador: Jugador;
}
