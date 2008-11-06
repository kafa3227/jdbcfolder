package com.ysance.tools.jdbc.driver.sql;

import java.util.Arrays;

public interface ParsingUtilities {

	public final char[] separateursMots = {' ',')','(','\n','\t'};
	
	// Le caract�re de fermeture correspondant � un caract�re d'ouverture doit se trouver � la m�me position dans le tableau 
	public char[] ouvertureGroupeCatalogue = {'"','('};
	public char[] fermetureGroupeCatalogue = {'"',')'};	
	public final int AUCUNE_PROTECTION = 0; 
	public final int SIMPLE_APOSTROPHE = 1; 
	public final int DOUBLE_APOSTROPHE = 2; 		
	public final int DANS_CLAUSE_FROM  = 3;
	public final int DELIMITEUR_FONCTION = 4; 		
		
	public final String SIMPLE_APOSTROPHE_STRING = "'"; 
	public final String DEUX_APOSTROPHES_STRING = "''"; 

	
	public char[] separateursGroupe = {','};			
	final int AUCUN_GROUPE = -1;	
	
	

}
