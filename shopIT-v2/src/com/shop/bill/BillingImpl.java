package com.shop.bill;

import com.shop.pm.PriceMatrix;

/*
 *  design & performance issues
 *  ---------------------------
 *  
 *  => tight-coupling b/w dependent & dependency impln
 *  		--> can't component with new-feature(s)
 *  => too many duplicate dependency-instances are created & destroyed in every method invocation
 *  		--> slow,resource ussage high
 *  => unit-testing not possible
 *  		--> dev & bug fix slow
 *  
 *  
 *    why these issues ?

 *    => dependent itself creating it's own dependency(s)
 *    
 *    soln :
 *    
 *    => don't create dependency in dependent's class , do lookup e.g using factory-pattern
 *    
 *    Limitation on lookup:
 *    
 *    => location tight-coupling
 *    
 *    best soln :
 *    
 *    => don't create & lookup dependency in dependent's class , inject by 'some-one' ( IOC )
 *    
 *    how to implement IOC ?
 *    
 *     => using 'Dependency Injection' ( DI )
 *     
 *     	  - setter
 *     	  - constructor
 *     
 *     ---------------------------------------------------------------------
 *     
 *     OO concepts
 *     ------------
 *     
 *     	- class  ==> instance(s)
 *      - Abstraction & Encapsulation
 *      - Inheritance
 *      - Polymorphism
 *      
 *    ---------------------------------------------------------------------
 *    
 *    OO principles
 *    --------------
 *    
 *      S.O.L.I.D
 *      
 *      S — Single responsibility principle
 *      O — Open for extension & closed for modification principle
 *      L — Liskov substitution principle
 *      I — Interface segregation principle
 *      D — Dependency Inversion principle
 *      
 *      
 *     
 *    ---------------------------------------------------------------------
 *    
 * 
 */

public class BillingImpl implements Billing {

	private PriceMatrix priceMatrix;

	public void setPriceMatrix(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shop.bill.Billing#getTotalPrice(java.lang.String[])
	 */
	@Override
	public double getTotalPrice(String[] cart) {
		double total = 0.0;
		for (String item : cart) {
			total += priceMatrix.getPrice(item);
		}
		return total;
	}

}
