package day2.part02_sensor_readings;

public class SensorReadings {

    public static void main(String[] args) {

        /* 
        Scenario: 
        A sensor reports every 5 minutes for 1 hour.
        Minutes: 0, 5, 10, ..., 60
         */

        /*TO-DO:
        A sensor reports data every 5 minutes for 1 hour (minutes 0 through 60).
        Use a for loop with a step size of 5 to iterate over the minute marks.
        At each minute, compute a value equal to (minute / 5) * 2,
        then print the minute and the computed value. 
        */ 
        
        // loop over minutes from 0 to 60 in steps of 5
		for (int minute = 0; minute <= 60; minute += 5) {
		// compute the sensor value
		int sensorValue = (minute / 5) * 2;

		// print the minute and sensor value
		System.out.println(minute + ": " + sensorValue);
        }


    }
    
}
