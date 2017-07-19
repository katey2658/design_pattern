package com.busyzero.interpret;

public class MainTest {
	//规则：Robert 和 John 是男性
	   public static Expression getMaleExpression(){
	      Expression robert = new TernimalExpression("Robert");
	      Expression john = new TernimalExpression("John");
	      return new OrExpression(robert, john);		
	   }

	   //规则：Julie 是一个已婚的女性
	   public static Expression getMarriedWomanExpression(){
	      Expression julie = new TernimalExpression("Julie");
	      Expression married = new TernimalExpression("Married");
	      return new AndExpression(julie, married);		
	   }

	   public static void main(String[] args) {
	      Expression isMale = getMaleExpression();
	      Expression isMarriedWoman = getMarriedWomanExpression();

	      System.out.println("John is male? " + isMale.interpret("John"));
	      System.out.println("Julie is a married women? " 
	      + isMarriedWoman.interpret("Married Julie"));
	   }
}
