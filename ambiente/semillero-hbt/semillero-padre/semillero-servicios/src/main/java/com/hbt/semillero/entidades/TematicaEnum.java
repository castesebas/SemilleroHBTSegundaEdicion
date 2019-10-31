/**
 * TematicaEnum.java
 */
package com.hbt.semillero.entidades;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Castel
 * @version 
 */
public enum TematicaEnum {
	AVENTURAS("enum.tematica.aventuras"),
    BELICO("enum.tematica.belico"),
    DEPORTIVO("enum.tematica.deportivo"),
    FANTASTICO("enum.tematica.fantastico"),
    CIENCIA_FICCION("enum.tematica.cienciaficcion"),
    HISTORICO("enum.tematica.historico"),
    HORROR("enum.tematica.horror");
	private String codigoPrivate;

	/**
	 * Constructor de la clase.
	 * @param codigoPrivate
	 */
	private TematicaEnum(String codigoPrivate) {
		this.codigoPrivate = codigoPrivate;
	}
	
}
