package exam10;

import java.awt.image.VolatileImage;

abstract class Shape{
	protected int x;
	protected int y;
	
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
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
	
}


abstract class TwoDimShape extends Shape{
	
	public TwoDimShape(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	protected double area;
	public abstract double getArea();
}

abstract class ThreeDimShape extends Shape{
	
	public ThreeDimShape(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	protected double volume;
	public abstract double getVolume();
}

class Ellipse extends TwoDimShape{
	private double l_radius;
	private double s_radius;
	public Ellipse(int x, int y, double l_radius, double s_radius) {
		super(x, y);
		this.l_radius = l_radius;
		this.s_radius = s_radius;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		area = Math.PI * l_radius + s_radius;
		return area;
	}
	@Override
	public String toString() {
		return "Ellipse [l_radius=" + l_radius + ", s_radius=" + s_radius + ", area=" + area + ", x=" + x + ", y=" + y
				+ "]";
	}	
}


class Rectangle extends TwoDimShape{
	private double width;
	private double height;
	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		area = width*height;
		return area;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", area=" + area + ", x=" + x + ", y=" + y + "]";
	}
	
}

class Triangle extends TwoDimShape{
	private int width;
	private int height;
	public Triangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		area = width * height / 2;
		return area;
	}
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", area=" + area + ", x=" + x + ", y=" + y + "]";
	}
	
	
}


class Shpere extends ThreeDimShape{
	private double radius;

	public Shpere(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		volume = 4.0/3*Math.PI*Math.pow(radius, 3);
		return volume;
	}

	@Override
	public String toString() {
		return "Shpere [radius=" + radius + ", volume=" + volume + ", x=" + x + ", y=" + y + "]";
	}	
}


class Cube extends ThreeDimShape{
	private double width;
	private double length;
	private double height;
	public Cube(int x, int y, double width, double length, double height) {
		super(x, y);
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		volume = width * length * height;
		return volume;
	}

	@Override
	public String toString() {
		return "Cube [width=" + width + ", length=" + length + ", height=" + height + ", volume=" + volume + ", x=" + x
				+ ", y=" + y + "]";
	}
}

class Cylinder extends ThreeDimShape{
	private double radius;
	private double height;
	public Cylinder(int x, int y, double radius, double height) {
		super(x, y);
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public double getVolume() {
		volume = Math.PI * Math.pow(radius, 2) * height;
		return volume;
	}
}

public class ShapeTest {
	public static void main(String[] args) {
		
		//모든 종류의 도형을 담을 수 있는 배열을 만듭니다.
		//배열의 크기는 3으로 합니다.
		//3가지의 도형을 배열에 생성하여 담아요
		//반복문을 이용하여 
		//배열의 요소를 하나씩 꺼집어 내어와
		//그 요소가 2차원 도형이면 면적을 계산하고 
		//3차원도형이면 부피를 계산합니다.
		//그리고 그 도형의 정보를 출력합니다.

		Shape[] arr = new Shape[3];
		arr[0] = new Ellipse(10, 10, 50, 20);
		arr[1] = new Shpere(10, 100, 50);
		arr[2] = new Rectangle(10, 200, 20, 40);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof TwoDimShape) {
				((TwoDimShape)arr[i]).getArea();
			}else if(arr[i] instanceof ThreeDimShape) {
				((ThreeDimShape)arr[i]).getVolume();
			}
			System.out.println(arr[i]);
		} 
	}
}