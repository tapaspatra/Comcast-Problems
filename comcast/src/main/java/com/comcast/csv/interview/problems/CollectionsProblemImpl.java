package com.comcast.csv.interview.problems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.comcast.csv.meme.Meme;

/**
 * Implement the specified interface.
 */
public class CollectionsProblemImpl implements CollectionsProblem {

	public void sort(Collection<Meme> memes, boolean ascending) {
		
		//Sorts a Collection of Memes by year
		List<Meme> listMemes = new ArrayList<Meme>();
		listMemes.addAll(memes);
		if(ascending){
			System.out.println("Year in Ascending order is as follows:");
			Collections.sort(listMemes, Meme.memeAscComparator);
		}else{
			System.out.println("Year in Descending order is as follows:");
			Collections.sort(listMemes, Meme.memeDscComparator);
		}
		
		for(Meme str: listMemes){
			System.out.println(str.getYear());
	   }
	}
	
	public void addTag(Collection<Meme> memes, String tag) {
		
		/*Solution sol = new Solution();
		Map<Object, String> tags = sol.getNonDuplicateTags((List<Meme>) memes);
		int tagSize = tags.size();
		
		String[] nonDupTags = new String[tagSize];
		for (Meme meme : memes) {
			//String[] tagArray = meme.getTags();
			for (int i = 0; i < nonDupTags.length; i++) {
						nonDupTags[i]= tag;
			}
			meme.setTags(nonDupTags);
		}
		System.out.println(memes.size());
		for (Meme meme : memes) {
			String[] finalTags =  meme.getTags();
					for (int i = 0; i < finalTags.length; i++) {
						System.out.println(finalTags[i]);
					}
		}*/
		
	}
}
