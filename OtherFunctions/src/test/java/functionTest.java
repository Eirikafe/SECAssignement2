import org.junit.Test;

import static org.junit.Assert.*;

public class functionTest {
   double num;
   double result;

   @Test
   public void givenX_whenGammaCalled_thenReturnXFactorial()
   {
      num = 16.0;
      result = Functions.Gamma(num);

      assertEquals(20922789883474.234, result, 0.0001);
   }

   @Test
   public void givenX_whenFibonacciCalled_thenReturnXthNumberInFibSequence()
   {
      num = 16.0;
      result = Functions.Fibonacci(num);

      assertEquals(987.0, result, 0.000001);
   }
}
