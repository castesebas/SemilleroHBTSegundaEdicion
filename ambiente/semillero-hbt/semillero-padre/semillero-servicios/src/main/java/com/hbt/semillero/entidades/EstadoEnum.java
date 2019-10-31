/**
 * EstadoEnum.java
 */
package com.hbt.semillero.entidades;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Castel
 * @version 
 */
public enum EstadoEnum {
	ACTIVO("enum.estado.activo"),
	INACTIVO("enum.estado.inactivo");
	private String codigoPrivate;

	/**
	 * Constructor de la clase.
	 * @param codigoPrivate
	 */
	private EstadoEnum(String codigoPrivate) {
		this.codigoPrivate = codigoPrivate;
	}
	
	
}
