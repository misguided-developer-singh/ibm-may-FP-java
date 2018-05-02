package com;

@FunctionalInterface
interface Scalable {
	// implicitly public static final
	double DEFAULT_SCALE = 1.0;

	// implicitly public abstract
	void setScale(double scale);

	// implicitly public
	static boolean isScalable(Object obj) {
		return obj instanceof Scalable;
	}

	// implicitly public
	default void resetScale() {
		setScale(DEFAULT_SCALE);
	}
}

class Shape implements Scalable {
	double scale;

	@Override
	public void setScale(double scale) {
		this.scale = scale;
	}
}

public class Ex1 {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.setScale(2.0);
		System.out.println(Scalable.isScalable(shape));
		shape.resetScale();
	}

}
