//package yanolja.task2;
//
//
//import org.junit.Assert;
//import org.junit.Test;
//
//public class InverterTest {
//
//    @Test
//    public void shouldInvert() {
//        Assert.assertEquals("rts", Inverter.invert("str"));
//        Assert.assertEquals("", Inverter.invert(""));
//        Assert.assertEquals("A", Inverter.invert("A"));
//        Assert.assertEquals("", Inverter.invert(null));
//        Assert.assertEquals("rts", Inverter.invert("str"));
//        Assert.assertEquals("rts", Inverter.invert("str"));
//    }
//
//}
//
//class Inverter {
//    public static String invert(String str) {
//        if(str == null) return "";
//
//        StringBuilder builder = new StringBuilder();
//        for(int i = str.length()-1; i >= 0; i--) {
//            builder.append(str.charAt(i));
//        }
//
//        return builder.toString();
//    }
//}