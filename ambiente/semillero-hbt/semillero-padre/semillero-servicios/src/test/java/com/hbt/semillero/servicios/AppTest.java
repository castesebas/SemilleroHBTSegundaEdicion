package com.hbt.semillero.servicios;


import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.EstadoEnum;


public class AppTest {

	public void shouldAnswerWithTrue() {

	}
	@Test
	public void primeraPU() {
	 long resultadoEsperado = 150L;
	 long sumando1=100L;
	 long sumando2=50L;
	 long resultado=sumando1+sumando2;
	 Assert.assertEquals(resultado, resultadoEsperado);
	 resultadoEsperado=200L;
	 Assert.assertNotEquals(resultado, resultadoEsperado);
	}
	@Parameters({ "hola mundo" })
	@Test
	private void invertirCadena(String cadena) {

        String cadenaInvertida = "";
        
        for (int x = cadena.length() - 1; x >= 0; x--) {

                      cadenaInvertida = cadenaInvertida + cadena.charAt(x);

        }
        Assert.assertNotEquals(cadena, cadenaInvertida);
        cadenaInvertida="odnum aloh";
        Assert.assertNotEquals(cadena, cadenaInvertida);
        
        
        

}
	//TODO
	/*
	 * pendiente hacer un metodo que use el metodo TOString de la entidad comic
	 */
	
	
    public String returnActivo(){
		EstadoEnum estadoEnum = EstadoEnum.ACTIVO;
		estadoEnum.toString();
		return estadoEnum.name();
		 
    }
	
    @Test
    public void estadoEnumNombreActivo() {
        Assert.assertEquals(EstadoEnum.ACTIVO.name(), "ACTIVO");
        
    }
    
    public Integer returnPosicionEstadoEnum(){
		EstadoEnum estadoEnum = EstadoEnum.ACTIVO;
		estadoEnum.ordinal();
		return estadoEnum.ordinal();
		 
    }
	
    @Test
    public void estadoEnumP() {
        Assert.assertEquals(EstadoEnum.ACTIVO.ordinal(), "1");
        
    }
    public Integer returnEnum(){
  		EstadoEnum estadoEnum = EstadoEnum.ACTIVO;
  		EstadoEnum.ACTIVO.compareTo("ACTIVO");
  		return estadoEnum.ordinal();
  		 
      }
  	
      @Test
      public void estadoEnumP() {
          Assert.assertEquals(EstadoEnum.ACTIVO.ordinal(), "1");
          
      }
    
}

