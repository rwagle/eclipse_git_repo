package org;

public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("HelloWorld-ForGit-StartLocal:Hello World.");
		System.out.println ("Ok, now with some improvements");
		System.out.println ("More improvements 12/10/2013 @ 5:03 pm");
		
		HelloFix helloFix = new HelloFix ();
		helloFix.doSomething();
		
		// Adding a comment to confirm that Issue53 is resolved.

		System.out.print("Doing an emergency production hotfix 12/12/2013 @ 7:26 pm");
	}

}
