package com.comcast.csv.interview.problems;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import com.comcast.csv.meme.Meme;

/**
 * Using all forms of loops and recursions to iterate over a {@link List} of {@link Meme}s and log it's name and year.
 * Format of the log message isn't important.
 */
public class LoopProblem {
	
	
	private static final Logger LOGGER = Logger.getLogger(LoopProblem.class.getName());
	
	public void loopMemeObjs(List<Meme> listMemeObjects) {
		
		//foreach
		for (Meme meme : listMemeObjects) {
			LOGGER.info("Meme name is : "+meme.getName());
			LOGGER.info("Meme year is : "+String.valueOf(meme.getYear()));
		}
		
		//iterator
		Iterator<Meme> it = (Iterator<Meme>)listMemeObjects.iterator();
		while (it.hasNext()) {
			Meme meme = (Meme) it.next();
			LOGGER.info("Meme name is : "+meme.getName());
			LOGGER.info("Meme year is : "+String.valueOf(meme.getYear()));
		}
		
		//array
		for (int i = 0; i < listMemeObjects.size(); i++) {
			Meme meme = (Meme) listMemeObjects.get(i);
			LOGGER.info("Meme name is : "+meme.getName());
			LOGGER.info("Meme year is : "+String.valueOf(meme.getYear()));
		}
		
		//while
		int i = 0;
		while (i < listMemeObjects.size()) {
			Meme meme = (Meme)listMemeObjects.get(i);
			LOGGER.info("Meme name is : "+meme.getName());
			LOGGER.info("Meme year is : "+String.valueOf(meme.getYear()));	
			i++;
		}
		
		//recursion
		recursion(listMemeObjects);

	}

	private void recursion(List<Meme> listMemeObjects) {
		if( listMemeObjects.isEmpty() ) return;
	    Meme meme = listMemeObjects.get(0) ;
	    LOGGER.info("Meme name is : "+meme.getName());
		LOGGER.info("Meme year is : "+String.valueOf(meme.getYear()));
		recursion(listMemeObjects.subList(1,listMemeObjects.size()));

		
	}
	
}
