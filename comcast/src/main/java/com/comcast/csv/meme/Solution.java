/**
 * 
 */
package com.comcast.csv.meme;

import java.awt.Rectangle;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.comcast.csv.interview.problems.CollectionsProblemImpl;
import com.comcast.csv.interview.problems.FileJsonResourceProblem;
import com.comcast.csv.interview.problems.LoopProblem;
import com.comcast.csv.interview.problems.PojoAlgProblem;
import com.comcast.csv.interview.problems.StringParsingProblem;

/**
 * @author tapas
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		//Create Array of JSON objects
		JSONArray jsonArray = new JSONArray();
		jsonArray.add(createJsonObjs("Tapas", 1984, new String[] {"tapas", "ranjan", "patra"}));		
		jsonArray.add(createJsonObjs("Rakesh", 1989, new String[] {"Mayn", "lumar", "mishar"}));	
		jsonArray.add(createJsonObjs("Mahesh", 1980, new String[] {"Taony", "kumarf", "ranjan"}));	
		jsonArray.add(createJsonObjs("Rahul", 1982, new String[] {"rakesh", "ranjan", "dibakar"}));	
		jsonArray.add(createJsonObjs("Raghu", 1997, new String[] {"raghu", "prakash", "lumar"}));	
		
		String flieSystemPath = "C:/TAPAS/meme.json";
		writeToFileSystem(flieSystemPath, jsonArray);

		//Read JSONObjects from file system
		FileJsonResourceProblem fileJsonResourceProblem = new FileJsonResourceProblem();
		List<Meme> listMemeObjects = null;
		List<Meme> listMemeObjectsFromClassPath = null;
		try {
			listMemeObjects = fileJsonResourceProblem.readFromFile(new File(flieSystemPath));
			
			//Read JSONObjects from class path
			listMemeObjectsFromClassPath = fileJsonResourceProblem.readFromClasspath("/meme.json");
		} catch (YoureDoingItWrongException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Sorting problem
		 CollectionsProblemImpl colImpl = new CollectionsProblemImpl();
		 //pass the listMemeObjects if you need from filesystem orlistMemeObjectsFromClassPath if you need from class path
		 colImpl.sort(listMemeObjects, true);
		 
		 
		 
		 /*//Add tag code
		 Map<Object, String> tags = getNonDuplicateTags(listMemeObjects);
		
		 Iterator iterator = tags.entrySet().iterator();
		 while (iterator.hasNext()) {
				Map.Entry mapEntry = (Map.Entry) iterator.next();
				colImpl.addTag(listMemeObjects, mapEntry.getValue().toString());
			}*/
		 
		//Call to Loop
		 LoopProblem loopProblem = new LoopProblem();
		 loopProblem.loopMemeObjs(listMemeObjects);
		 
		//Rectangle Problem
		//case1
		Rectangle outer = new Rectangle(0, 0, 2, 2);
    	Rectangle inner = new Rectangle(0, 0, 2, 1);
    	//case2
    	Rectangle outer1 = new Rectangle(0, 0, 2, 2);
    	Rectangle inner1 = new Rectangle(1, 0, 1, 1);
    	
    	//Bottom right problem
    	PojoAlgProblem pojoPojoAlgProblem = new PojoAlgProblem();
    	pojoPojoAlgProblem.bottomRight(outer, inner);
    	pojoPojoAlgProblem.bottomRight(outer1, inner1);
    	
    	//Middle center problem
    	Rectangle outerCenter = new Rectangle(0, 0, 2, 2);
	    Rectangle innerCenter = new Rectangle();
	    innerCenter.setRect(0.5, 0.5, 1, 1);
	    pojoPojoAlgProblem.middleCenter(innerCenter, outerCenter);
	    
	    //String Parsing problem
	    StringParsingProblem stringParsingProblemObj = new StringParsingProblem();
	    String msg = "The distance in miles from the center of the city from the given address is: ";
	    System.out.println(msg+stringParsingProblemObj.getDistanceFromCityCenter("25w873 Apple St."));
	    System.out.println(msg+stringParsingProblemObj.getDistanceFromCityCenter("3n17 Special Ave."));
	    System.out.println(msg+stringParsingProblemObj.getDistanceFromCityCenter("0e34800 Main St."));
	}
	
	
	public static Map<Object, String> getNonDuplicateTags(List<Meme> listMemeObjects) {
		 Map<Object, String> tags = new HashMap<Object, String>();
		 for (Meme meme : listMemeObjects) {
			 String[] tagsArray = meme.getTags();
			 for(int i = 0; i < tagsArray.length; i++){
				 if(!tags.containsValue(tagsArray[i])){
					 tags.put(Math.random(), tagsArray[i]);
				 }
			 }
		}
		System.out.println(tags.size());
		return tags;
		
	}


	/**
	 * 
	 * @param filePath
	 * @param jsonObj
	 */
	private static void writeToFileSystem(String filePath, JSONArray jsonArray){
		//Write to fileSystem
		FileWriter file = null;
		try {
			file = new FileWriter(filePath);
			file.write(jsonArray.toJSONString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
            try {
				file.flush();
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}
	/**
	 * 
	 * @param name
	 * @param year
	 * @param tags
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private static JSONObject createJsonObjs(String name, int year, String[] tags){
		//Create JSONObject
		JSONObject jsonObj = new JSONObject();
		JSONArray jsontags = new JSONArray();
		for (String tag : tags) {
			jsontags.add(tag);
		}
		jsonObj.put("name", name);
		jsonObj.put("year", String.valueOf(year));
		jsonObj.put("tags", jsontags);
		
		return jsonObj;
	}

}
