import static org.junit.Assert.*;

import org.junit.Test;


public class TestMessageUtil {

	   String message = "Hello,Robert";	
	   MessageUtil messageUtil = new MessageUtil(message);
	   
	   @Test
	   public void testPrintMessage() {	
	      System.out.println("Inside testPrintMessage()");     
	      assertEquals(message,messageUtil.printMessage());
	   }

	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "Hi!" + "Hello,Robert";
	      assertEquals(message,messageUtil.salutationMessage());
	   }
}
