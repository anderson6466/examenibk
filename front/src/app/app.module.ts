import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MatSliderModule } from '@angular/material/slider';
import {MatMenuModule} from '@angular/material/menu';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { OperacionesComponent } from './operaciones/operaciones.component';
import {MatButtonModule} from '@angular/material/button';
import {MatFormFieldModule} from '@angular/material/form-field';
import {   MatSelectModule   } from '@angular/material/select';
import { MantenimientoComponent } from './mantenimiento/mantenimiento.component';
 
import { FormsModule } from '@angular/forms';
@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    OperacionesComponent,
    MantenimientoComponent
  ],
  imports: [
    FormsModule,
    MatSelectModule,
    MatMenuModule,
    BrowserModule,
    AppRoutingModule,
    MatSliderModule,
    MatButtonModule,
    BrowserAnimationsModule,
    MatFormFieldModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
