package day1assignment5;

import day1assignment5.Drawable;
import day1assignment5.Fillable;


	public class Circle implements Drawable, Fillable {

		@Override
		public void fillingColor() {
			System.out.println("Filling color of Circle");

		}

		@Override
		public void size() {
			System.out.println("Size of Circle");

		}

		@Override
		public void drawingColor() {
				System.out.println("Drawing color of Circle");

		}

		@Override
		public void thickness() {
			System.out.println("Thickness of Circle");

		}

	}



