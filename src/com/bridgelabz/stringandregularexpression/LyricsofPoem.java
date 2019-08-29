/******************************************************************************
 
 *  Purpose: Write a program to print the lyrics of the poem replace ANIMAL and its SOUND to output the complete the lyrics. 
 *
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   21-08-2017
 *
 ******************************************************************************/




package com.bridgelabz.stringandregularexpression;

import com.bridgelabz.Utility.Utility;

public class LyricsofPoem {

	public static void main(String[] args) {
		String string="Old MacDonald had a farm,\n" + 
				"E­I­E­I­O.\n" + 
				"a\n" + 
				"And on his farm he had some %ANIMAL%,\n" + 
				"E­I­E­I­O.\n" + 
				"a\n" + 
				"With a %SOUND%, %SOUND% here,\n" + 
				"And a %SOUND%, %SOUND% there,\n" + 
				"Here a %SOUND%, there a %SOUND%,\n" + 
				"Everywhere a %SOUND%, %SOUND%,\n" + 
				"a";
		Utility.lyricsofpoem(string);

	}

}
