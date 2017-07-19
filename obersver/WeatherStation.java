package com.busyzero.obersver;

public class WeatherStation {
	public static void main(String[] args){
		WeartherData weatherData=new WeartherData();
		
		CurrentConditionsDisplay currentDisplay=new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(71, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.4f);
	}
}
