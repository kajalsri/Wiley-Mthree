package day1assignment5;

import day1assignment5.Drawable;
import day1assignment5.Fillable;


public class Square implements Drawable, Fillable {

	@Override
	public void fillingColor() {
		System.out.println("Filling color of Square");

	}

	@Override
	public void size() {
		System.out.println("Size of Square");

	}

	@Override
	public void drawingColor() {
			System.out.println("Drawing color of Square");

	}

	@Override
	public void thickness() {
		System.out.println("Thickness of Square");

	}

}