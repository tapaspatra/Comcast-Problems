package com.comcast.csv.meme;

import java.util.Comparator;

/**
 * Simple class used by various tests.
 */
public class Meme{

    private String name;
    private int year;
    private String[] tags;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the tags
     */
    public String[] getTags() {
        return tags;
    }

    /**
     * @param tags the tags to set
     */
    public void setTags(String[] tags) {
        this.tags = tags;
    }
    
    @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	/*Comparator for sorting the list by Memes by year*/
    public static Comparator<Meme> memeAscComparator = new Comparator<Meme>() {
    	
    	public int compare(Meme m1, Meme m2) {

		   int year1 = m1.getYear();
		   int year2 = m2.getYear();
	
		   /*For ascending order*/
		   return year1-year2;
   }};
   
   public static Comparator<Meme> memeDscComparator = new Comparator<Meme>() {
   	
	   	public int compare(Meme m1, Meme m2) {
	
			   int year1 = m1.getYear();
			   int year2 = m2.getYear();
		
			   /*For desending order*/
			   return year2-year1;
	  }

   };
}
