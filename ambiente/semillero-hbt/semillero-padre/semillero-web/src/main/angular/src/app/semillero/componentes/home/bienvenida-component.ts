import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { templateJitUrl } from '@angular/compiler';

/**
 * @description Componente bienvenida, el cual contiene la imagen de bienvenida al semillero
 * 
 * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
 */
@Component({
  selector: 'bienvenida',
  templateUrl: './bienvenida-component.html',
})
export class BienvenidaComponent implements OnInit{

  
  constructor(private router : Router){ 
    
}


  ngOnInit(): void {
    
    this.router.navigate(['mostrar-creador']);
  }

}