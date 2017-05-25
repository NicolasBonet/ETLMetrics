package co.edu.uniandes.badSmellsChecker.evl;

import java.util.ArrayList;
import java.util.HashMap;

public class Dato {
	
	// Array of bad smells found
	private ArrayList<String> badSmells;

	// Category
	private String category;
	
	// Name
	private String name;
	
	// Metrics
	private HashMap<String, Double> metrics;
	
	public Dato(String category, String name) {
		this.badSmells = new ArrayList<String>();
		this.category = category;
		this.name = name;
		this.metrics = new HashMap<String, Double>();
	}

	public ArrayList<String> getBadSmells() {
		return badSmells;
	}

	public void setBadSmells(ArrayList<String> badSmells) {
		this.badSmells = badSmells;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public HashMap<String, Double> getMetrics() {
		return metrics;
	}

	public void setMetrics(HashMap<String, Double> metrics) {
		this.metrics = metrics;
	}
}