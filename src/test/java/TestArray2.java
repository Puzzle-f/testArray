import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;


    @RunWith(Parameterized.class)
    public class TestArray2{
        private int[] arr;
        boolean b;
//        private Main main;

        public TestArray2(int[] arr, boolean b){
            this.arr = arr;
            this.b = b;
        }
        @Parameterized.Parameters
        public static Collection<Object[]> dataArrayCheck(){
            return Arrays.asList(new Object[][]{
                    {new int[]{1,1,1,4,4,1,4,4}, true},
                    {new int[]{1,1,1,1,1,1,1}, false},
                    {new int[]{2,2,3,3,5,5,4,}, false},
            });
        }

        @Test
        public void testArrayCheck(){
            Assert.assertEquals(Main.arrayCheck(arr), b);
        }

//        @Before
//        public void init (){
//            Main main = new Main();
//        }
    }



