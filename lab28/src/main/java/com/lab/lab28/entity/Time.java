package com.lab.lab28.entity;

import java.util.ArrayList;

public class Time {
	
	private ArrayList<String> tempLabel;
	private ArrayList<String> startPeriodName;
	
	
	public Time() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Time(ArrayList<String> tempLabel, ArrayList<String> startPeriodName) {
		super();
		this.tempLabel = tempLabel;
		this.startPeriodName = startPeriodName;
	}
	
	public ArrayList<String> getTempLabel() {
		return tempLabel;
	}

	public void setTempLabel(ArrayList<String> tempLabel) {
		this.tempLabel = tempLabel;
	}

	public ArrayList<String> getStartPeriodName() {
		return startPeriodName;
	}

	public void setStartPeriodName(ArrayList<String> startPeriodName) {
		this.startPeriodName = startPeriodName;
	}

	@Override
	public String toString() {
		return "Time [tempLabel=" + tempLabel + ", startPeriodName=" + startPeriodName + "]";
	}
	

}