import { Component, OnInit } from '@angular/core';
import axios  from 'axios';
@Component({
  selector: 'app-operaciones',
  templateUrl: './operaciones.component.html',
  styleUrls: ['./operaciones.component.css']
})
export class OperacionesComponent implements OnInit {
  public   mon  : any[];
  constructor() {


    this.mon=[];

   }

   public resultado: string = '';
  public opde: string = '';
  public opto :String = '';
  public opvalor :String = '';

  ngOnInit(): void {

this.obtmoneda();

  }


  obtmoneda(){
  
    axios.get   ('http://localhost:3377/mantenimiento/listmoneda' )
        .then(response => { 
   
          this.mon  = Object.values(response.data)    ;   
     
          }  
           
          
          );
       
    }
  
   
  operacionestipocambio(){



  

    var arreglo={
       
      ibkde:this.opde,
      ibkto: this.opto,
      ibkvalor:this.opvalor
    }
    
  
    axios.post('http://localhost:3377/mantenimiento/operaciontipocambio', arreglo)
        .then(response => {
          
          
          alert( response.data)
          this.resultado=response.data;
        
        }
          
          
          );
     
    }









}
