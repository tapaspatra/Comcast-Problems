package com.comcast.csv.interview.problems;

import java.awt.Rectangle;

/**
 * Using absolute coordinates for EVERYTHING, implement the following methods to position the inner rectangle relative
 * to the outer rectangle.
 */
public class PojoAlgProblem {

    /**
     * Put the inner rectangle so that it's bottom right corner aligns with the bottom right corner of the outer
     * rectangle.
     * 
     * @param inner the inner rectangle to position
     * @param outer the outer rectangle to use as a reference
     */
    public void bottomRight(Rectangle inner, Rectangle outer) {
    	double xOuter = outer.getX()+outer.getWidth();
    	double yOuter = outer.getY();
    	
    	double xInner = inner.getX()+inner.getWidth();
    	double yInner = inner.getY();
    	
    	if (xOuter == xInner && yOuter == yInner ) {
			System.out.println("Bottom right corner of inner rectangle aligns with the bottom right corner of the outer");
		}else{
			System.out.println("Bottom right corner of inner rectangle does not align with the bottom right corner of the outer");
    	}
    }

    /**
     * Put the inner rectangle so that it is centered vertically and horizontally 
     * 
     * @param inner the inner rectangle to position
     * @param outer the outer rectangle to use as a reference
     */
    public void middleCenter(Rectangle inner, Rectangle outer) {
    	double xOuter = outer.getX()+outer.getWidth()/2;
    	double yOuter = outer.getY()+outer.getHeight()/2;
    	
    	double xInner = inner.getX()+inner.getWidth()/2;
    	double yInner = inner.getY()+inner.getHeight()/2;
    	
    	if (xOuter == xInner && yOuter == yInner ) {
			System.out.println("inner rectangle so that it is centered vertically and horizontally ");
		}else{
			System.out.println("inner rectangle does not match centered vertically and horizontally ");
    	}
    }
}
