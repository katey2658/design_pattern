package com.busyzero.interpret;

public class MainTest {
	//����Robert �� John ������
	   public static Expression getMaleExpression(){
	      Expression robert = new TernimalExpression("Robert");
	      Expression john = new TernimalExpression("John");
	      return new OrExpression(robert, john);		
	   }

	   //����Julie ��һ���ѻ��Ů��
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
