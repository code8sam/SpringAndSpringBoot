package org.jspiders.setterinjjectionforcollectionandmap.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ColletionType 
{
	private ArrayList<Integer> integerList;
	private HashSet<Double> doubleSet;
	private HashMap<Character, Integer> alphabetsMap;
	
	public ColletionType() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object is Created using no-ags constr...!!");
	}

	public ArrayList<Integer> getIntegerList() {
		return integerList;
	}

	public void setIntegerList(ArrayList<Integer> integerList) {
		this.integerList = integerList;
	}

	public HashSet<Double> getDoubleSet() {
		return doubleSet;
	}

	public void setDoubleSet(HashSet<Double> doubleSet) {
		this.doubleSet = doubleSet;
	}

	public HashMap<Character, Integer> getAlphabetsMap() {
		return alphabetsMap;
	}

	public void setAlphabetsMap(HashMap<Character, Integer> alphabetsMap) {
		this.alphabetsMap = alphabetsMap;
	}

	@Override
	public String toString() {
		return "ColletionType [integerList=" + integerList + ", doubleSet=" + doubleSet + ", alphabetsMap="
				+ alphabetsMap + "]";
	}
	
	
}
