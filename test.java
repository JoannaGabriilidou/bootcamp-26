public class test{
	public static void main(String... args){
      int age = 10;
      if (age >=21){
         System.out.println("You are an adult");
      } else if ( age >=18 ) {
         System.out.println("you are almost an adult");
      } else {
         System.out.println("you are a child");
      }

      int[] score = new int[] {3,7,10,8,9,5};

      int length = score.length;
      
      for (int i=0 ; i < length; i =  i+2){
	      System.out.println(score[i]);
	}
      for ( int i=length; i>0; i--){
	      System.out.println(score[i-1]);
      }
	}

}
