package com.puzzle.clientinterfacelayer;

import com.puzzle.puzzlearray.DataStore2dArray;
import com.puzzle.service.PuzzleTraverse;

/**
 * 
 * @author Gurucharan H Chandramahesh
 * This class is exposed to the client.
 * BY making use of this class Client can interact to get total number of matches found in dictionary.
 *
 */

public class PuzzleClient {
	private DataStore2dArray dataStoreObj;
	private PuzzleTraverse puzzleTraverseObj;
	
	public PuzzleClient(int row, int col, String[] strArray) {
		// TODO Auto-generated constructor stub
		 dataStoreObj = new DataStore2dArray(row, col, strArray);
		 puzzleTraverseObj= new PuzzleTraverse(dataStoreObj);
	}
	
	/**
	 * 
	 * @return number of matches found in the dictionary 
	 */
	
	public long getNumberOfMatches(){
		return puzzleTraverseObj.getTotalMatches();
	}

}
