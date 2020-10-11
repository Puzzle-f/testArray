import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
    public class TestArray{
        private int[] inputArr;
        private int[] outputArr;

        public TestArray(int[] inputArr, int[] outputArr){
            this.inputArr = inputArr;
            this.outputArr = outputArr;
        }
        @Parameterized.Parameters
        public static Collection<Object[]> dataArrayTailAfter4(){
            return Arrays.asList(new Object[][]{
                    {new int[]{1,2,3,4,5,6,4,1,3}, new int[]{1,3}},
                    {new int[]{1,2,2,4,4,1,1,1}, new int[]{1,1,1}},
                    {new int[]{1,2,3,3,3,3,5,55,5,}, new RuntimeException()}
            });
        }

//(expected = IllegalArgumentException.class)
        @Test (expected = RuntimeException.class)
        public void testArrayTailAfter4(){
            Assert.assertArrayEquals(outputArr, Main.arrayTailAfter4(inputArr));
        }
    }

