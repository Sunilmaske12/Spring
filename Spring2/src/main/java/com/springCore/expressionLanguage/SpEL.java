package com.springCore.expressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("expression123")
public class SpEL {
	
	@Value("#{34+86}")
	int x;
	
	@Value("#{34*23}")
	int y;
	
	@Value("#{3+4==7}")
	boolean z;
	
	@Value("#{T(java.lang.Math).sqrt('25')}")
	private int a;
	
	@Value("#{T(java.lang.Math).E}")
	private double b;
	
	@Value("#{T(java.lang.Math).PI}")
	private double c;
	
	@Value("#{new java.lang.String('Sunil')}")
	private String name;
	
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isZ() {
		return z;
	}
	public void setZ(boolean z) {
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "SpEL [x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + ", b=" + b + ", c=" + c + ", name=" + name + "]";
	}
	
	
	
	
}
