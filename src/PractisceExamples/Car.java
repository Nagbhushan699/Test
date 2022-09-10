package PractisceExamples;

public abstract class Car implements Vehicle{
 public void start() {
	 System.out.println("Car Start");
 }
 public void stop() {
	 System.out.println("Car---stop");
 }
public abstract void getSpeed();
public abstract void  getMilage();
}
