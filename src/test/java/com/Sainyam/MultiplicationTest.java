import com.sainyam.Multiplication;
import org.junit.Test;
public class MultiplicationTest
{
    @Test
    public void testMultiply()
    {
        int a = 10;
        int b = 20;
        Multiplication mobj=new Multiplication();
        int result=mobj.Multi(10,20);
        System.out.println("result" + result);
    }
}