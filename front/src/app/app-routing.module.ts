import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { OperacionesComponent } from './operaciones/operaciones.component';
import {  MantenimientoComponent } from './mantenimiento/mantenimiento.component';


const routes: Routes = [
  {path: 'OperacionesComponent', component: OperacionesComponent,  pathMatch: 'full'},
  {path: 'Mantenimiento', component: MantenimientoComponent,  pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
