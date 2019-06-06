package com.lab.lab28.entity;

public class WeatherAPI {
	private Location location;
	private Time time;
	public WeatherAPI() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WeatherAPI(Location location, Time time) {
		super();
		this.location = location;
		this.time = time;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "WeatherAPI [location=" + location + ", time=" + time + "]";
	}
	
	
}