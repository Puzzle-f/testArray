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
        Main main;
        private int[] inputArr;
        private int[] outputArr;
//        private int[] array;

        public TestArray(int[] inputArr){
            this.inputArr = inputArr;
            this.outputArr = outputArr;
        }
        @Parameterized.Parameters
        public static Collection<Object[]> dataArrayTailAfter4(){
            return Arrays.asList(new Object[][]{
                    {new int[]{1,2,3,4,5,6,4,1,3}},

            });
        }

        @Before
        public void init(){
            main = new Main();
        }

        @Test (expected = RuntimeException.class)
        public void testArrayTailAfter4(){
            Assert.assertArrayEquals(inputArr, outputArr);
        }

    }

