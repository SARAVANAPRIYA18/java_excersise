package com.training.examples;

public class OverLoading {
public void display() {
	System.out.println("Without parameter");
}
public void display(int i) {
	System.out.println(i);
}
public void display(double i) {
	System.out.println(i);
}
public static void main(String[] args) {
	OverLoading loaing=new OverLoading();
	loaing.display();
	loaing.display(29.0);
	loaing.display(36);
}
}
