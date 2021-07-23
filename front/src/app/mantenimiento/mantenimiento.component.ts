import { Component, OnInit,OnChanges, SimpleChanges  } from '@angular/core';
import axios  from 'axios';
import {tipomonedas,resp} from './tipomonedas';

@Component({
  selector: 'app-mantenimiento',
  templateUrl: './mantenimiento.component.html',
  styleUrls: ['./mantenimiento.component.css']
})

 


export class MantenimientoComponent implements OnInit   {
  public   mon  : any[];
 
  constructor() {
    this.mon=[];
 }

  ngOnInit()  {
    
   this.obtmoneda();
      
  }
  
  OnChanges(changes: SimpleChanges){};



  public cod: string = '';
  public moneda :String = '';

  public ibkde: string = '';
  public ibkto :String = '';
  public valor :String = '';

  

Guardarmoenda(){
var arreglo={
  cod:this.cod,
  moneda:this.moneda
}
axios.post('http://localhost:3377/mantenimiento/addmoneda', arreglo)
    .then(response => alert( response.data));
 
}

Guardartipocambio(){





  var arreglo={
     
    ibkde:this.ibkde,
    ibkto: this.ibkto,
    ibkvalor:this.valor
  }
  

  axios.post('http://localhost:3377/mantenimiento/addtipocambio', arreglo)
      .then(response => alert( response.data));
   
  }
  

  





obtmoneda(){
  
  axios.get   ('http://localhost:3377/mantenimiento/listmoneda' )
      .then(response => { 
 
        this.mon  = Object.values(response.data)    ;   
   
        }  
         
        
        );
     
  }

}
