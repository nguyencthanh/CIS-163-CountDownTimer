package Project1;

import org.junit.Assert;
import org.junit.Test;

public class TestCountDownTimer {
    public TestCountDownTimer() {
    }

    @Test
    public void testSetHour() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.setHours(1);
        Assert.assertTrue(s.getHours() == 1);
    }

    @Test
    public void testSetBigHour() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.setHours(62);
        Assert.assertEquals((long)s.getHours(), 62L);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSetNegativeHour() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.setHours(-1);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSetLetterHour() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.setHours(Integer.parseInt("g"));
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSetWordHour() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.setHours(Integer.parseInt("Hello"));
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSetNullHour() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.setHours(Integer.parseInt((String)null));
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSetHourSuspend() {
        CountDownTimer s = new CountDownTimer();
        CountDownTimer.setSuspend(true);
        s.setHours(1);
    }

    @Test
    public void testSetMinute() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.setMinutes(21);
        Assert.assertTrue(s.getMinutes() == 21);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSetBigMinutes() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.setMinutes(62);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSetNegativeMinute() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.setMinutes(-11);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSetLetterMinute() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.setMinutes(98);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSetWordMinute() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.setMinutes(Integer.parseInt("Hello"));
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSetNullMinute() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.setMinutes(Integer.parseInt((String)null));
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSetMinuteSuspend() {
        CountDownTimer s = new CountDownTimer();
        CountDownTimer.setSuspend(true);
        s.setMinutes(3);
    }

    @Test
    public void testSetSecond() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.setSeconds(7);
        Assert.assertTrue(s.getSeconds() == 7);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSetBigSecond() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.setSeconds(100);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSetNegativeSecond() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.setSeconds(-20);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSetLetterSecond() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.setSeconds(98);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSetWordSecond() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.setSeconds(Integer.parseInt("Hello"));
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSetNullSecond() {
        CountDownTimer s = new CountDownTimer();
        s.setSeconds(Integer.parseInt((String)null));
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSetSecondSuspend() {
        CountDownTimer s = new CountDownTimer();
        CountDownTimer.setSuspend(true);
        s.setSeconds(20);
    }

    @Test
    public void testDefaultConstructor() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        Assert.assertTrue(s.getHours() == 0);
        Assert.assertTrue(s.getMinutes() == 0);
        Assert.assertTrue(s.getSeconds() == 0);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testDefaultSonstructorSuspend() {
        CountDownTimer.setSuspend(true);
        new CountDownTimer();
    }

    @Test
    public void testConstructor3Parameters() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(0, 0, 0);
        Assert.assertTrue(s.getHours() == 0);
        Assert.assertTrue(s.getMinutes() == 0);
        Assert.assertTrue(s.getSeconds() == 0);
        CountDownTimer s1 = new CountDownTimer(2, 3, 4);
        Assert.assertTrue(s1.getHours() == 2);
        Assert.assertTrue(s1.getMinutes() == 3);
        Assert.assertTrue(s1.getSeconds() == 4);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor3ParametersNegHour() {
        new CountDownTimer(-2, 3, 4);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor3ParametersNegMinute() {
        new CountDownTimer(2, -3, 4);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor3ParametersNegSecond() {
        new CountDownTimer(2, 3, -4);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor3LargeSecond() {
        new CountDownTimer(12, 59, 60);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor3LargeMinute() {
        new CountDownTimer(12, 60, 14);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructorString1ParameterAlpha() {
        new CountDownTimer("a");
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor3WithLetters() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer(97, 98, 99);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor3LetterMinute() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer(-1, 98, 3);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor3LetterSecond() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer(1, -2, 99);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor3LetterHour() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer(97, 2, -3);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor3Suspend() {
        CountDownTimer.setSuspend(true);
        new CountDownTimer(3, 5, 8);
    }

    @Test
    public void testConstructor3ParametersNegInput() {
        try {
            new CountDownTimer(-2, 3, 4);
        } catch (IllegalArgumentException var4) {
            Assert.assertTrue(var4 != null);
        }

        try {
            new CountDownTimer(2, -3, 4);
        } catch (IllegalArgumentException var3) {
            Assert.assertTrue(var3 != null);
        }

        try {
            new CountDownTimer(2, 3, -4);
        } catch (IllegalArgumentException var2) {
            Assert.assertTrue(var2 != null);
        }

    }

    @Test
    public void testConstructor2Parameters() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(2, 6);
        Assert.assertEquals((long)s.getMinutes(), 2L);
        Assert.assertEquals((long)s.getSeconds(), 6L);
        CountDownTimer s1 = new CountDownTimer(5, 10);
        Assert.assertEquals((long)s1.getMinutes(), 5L);
        Assert.assertEquals((long)s1.getSeconds(), 10L);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor2ParametersNegativeMinute() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer(-3, 4);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor2ParametersNegativeSecond() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer(3, -4);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor2LargeSecond() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer(59, 60);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor2LargeMinute() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer(60, 14);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor2WithLetters() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer(98, 99);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor2LetterMinute() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer(98, 3);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor2LetterSecond() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer(2, 99);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor2Suspend() {
        CountDownTimer.setSuspend(true);
        new CountDownTimer(3, 6);
    }

    @Test
    public void testConstructor1Parameters() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(6);
        Assert.assertEquals((long)s.getSeconds(), 6L);
        CountDownTimer s1 = new CountDownTimer(10);
        Assert.assertEquals((long)s1.getSeconds(), 10L);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor1ParametersNegativeSecond() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer(-4);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor1LargeSecond() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer(60);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor1WithLetters() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer(99);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructor1Suspend() {
        CountDownTimer.setSuspend(true);
        new CountDownTimer(3);
    }

    @Test
    public void testConstructorString() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer("4:05:20");
        Assert.assertEquals((long)s.getHours(), 4L);
        Assert.assertEquals((long)s.getMinutes(), 5L);
        Assert.assertEquals((long)s.getSeconds(), 20L);
        CountDownTimer s1 = new CountDownTimer("0:05:04");
        Assert.assertEquals((long)s1.getHours(), 0L);
        Assert.assertEquals((long)s1.getMinutes(), 5L);
        Assert.assertEquals((long)s1.getSeconds(), 4L);
        CountDownTimer s2 = new CountDownTimer("0:00:20");
        Assert.assertEquals((long)s2.getHours(), 0L);
        Assert.assertEquals((long)s2.getMinutes(), 0L);
        Assert.assertEquals((long)s2.getSeconds(), 20L);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructorStringNegativeHour() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer("-4:05:20");
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructorStringNegativeMinute() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer("4:-05:20");
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructorStringNegativeSecond() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer("4:05:-20");
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructorString1ParameterLetter() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer("a:00:00");
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructorString2ParameterLetter() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer("0:20:a");
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructorString3ParameterLetter() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer("20:a:00");
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructorStringLarge() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer("1:23:45:678");
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructorStringSuspend() {
        CountDownTimer.setSuspend(true);
        new CountDownTimer("2:20:30");
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructorStringNull() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer("null:null:null");
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructorStringLargeMinute() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer("4:70:20");
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testConstructorStringLargeSecond() {
        CountDownTimer.setSuspend(false);
        new CountDownTimer("4:05:80");
    }

    @Test
    public void testOtherConstructor() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(2, 2, 2);
        CountDownTimer s1 = new CountDownTimer(s);
        Assert.assertEquals((long)s1.getHours(), 2L);
        Assert.assertEquals((long)s1.getHours(), 2L);
        Assert.assertEquals((long)s1.getSeconds(), 2L);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testOtherConstructorNull() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(Integer.parseInt((String)null));
        new CountDownTimer(s);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testOtherConstructorSuspend() {
        CountDownTimer s = new CountDownTimer(4, 3, 4);
        CountDownTimer.setSuspend(true);
        new CountDownTimer(s);
    }

    @Test
    public void testEquals() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s1 = new CountDownTimer(5, 59, 30);
        CountDownTimer s2 = new CountDownTimer(6, 1, 20);
        CountDownTimer s3 = new CountDownTimer(5, 59, 30);
        CountDownTimer s4 = new CountDownTimer(5, 59, 20);
        CountDownTimer s5 = new CountDownTimer(5, 40, 30);
        CountDownTimer s6 = new CountDownTimer(4, 59, 30);
        CountDownTimer s7 = new CountDownTimer(5, 40, 20);
        CountDownTimer s8 = new CountDownTimer(4, 59, 20);
        CountDownTimer s9 = new CountDownTimer(4, 40, 30);
        Assert.assertFalse(s1.equals(s2));
        Assert.assertTrue(s1.equals(s3));
        Assert.assertEquals(s3, s1);
        Assert.assertFalse(s1.equals(s4));
        Assert.assertFalse(s1.equals(s5));
        Assert.assertFalse(s1.equals(s6));
        Assert.assertFalse(s1.equals(s7));
        Assert.assertFalse(s1.equals(s8));
        Assert.assertFalse(s1.equals(s9));
    }

    @Test
    public void testEquals3Parameterand2Parameter() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(3, 2, 1);
        CountDownTimer s1 = new CountDownTimer(2, 1);
        Assert.assertNotEquals(s, s1);
        CountDownTimer s2 = new CountDownTimer(0, 4, 5);
        CountDownTimer s3 = new CountDownTimer(4, 5);
        Assert.assertEquals(s2, s3);
    }

    @Test
    public void testEquals3Parameterand1Parameter() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(3, 2, 1);
        CountDownTimer s1 = new CountDownTimer(1);
        Assert.assertNotEquals(s, s1);
        CountDownTimer s2 = new CountDownTimer(0, 0, 5);
        CountDownTimer s3 = new CountDownTimer(5);
        Assert.assertEquals(s2, s3);
    }

    @Test
    public void testEquals2Parameterand1Parameter() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(2, 1);
        CountDownTimer s1 = new CountDownTimer(1);
        Assert.assertNotEquals(s, s1);
        CountDownTimer s2 = new CountDownTimer(0, 5);
        CountDownTimer s3 = new CountDownTimer(5);
        Assert.assertEquals(s2, s3);
    }

    @Test
    public void testEquals3ParameterandStringParameter() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(3, 2, 1);
        CountDownTimer s1 = new CountDownTimer("2:05:06");
        Assert.assertNotEquals(s, s1);
        CountDownTimer s2 = new CountDownTimer(1, 12, 13);
        CountDownTimer s3 = new CountDownTimer("1:12:13");
        Assert.assertEquals(s2, s3);
    }

    @Test
    public void testEquals2ParameterandStringParameter() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(2, 1);
        CountDownTimer s1 = new CountDownTimer("0:05:06");
        Assert.assertNotEquals(s, s1);
    }

    @Test
    public void testEquals1ParameterandStringParameter() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(1);
        CountDownTimer s1 = new CountDownTimer("0:00:06");
        Assert.assertNotEquals(s, s1);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testEqualsNull() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.equals((Object)null);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testEqualsSuspend() {
        new CountDownTimer(1, 2, 3);
        CountDownTimer.setSuspend(true);
        new CountDownTimer(1, 2, 3);
    }

    @Test
    public void testEqualsT1andT2True() {
        CountDownTimer s = new CountDownTimer(5, 59, 30);
        CountDownTimer s1 = new CountDownTimer(5, 59, 30);
        Assert.assertTrue(CountDownTimer.equals(s, s1));
        CountDownTimer s2 = new CountDownTimer(0, 50, 30);
        CountDownTimer s3 = new CountDownTimer(0, 50, 30);
        Assert.assertTrue(CountDownTimer.equals(s2, s3));
    }

    @Test
    public void testEqualsT1andT2False() {
        CountDownTimer s = new CountDownTimer(5, 59, 30);
        CountDownTimer s1 = new CountDownTimer(5, 59, 0);
        Assert.assertFalse(CountDownTimer.equals(s, s1));
        CountDownTimer s2 = new CountDownTimer(0, 50, 30);
        CountDownTimer s3 = new CountDownTimer(1, 20, 30);
        Assert.assertFalse(CountDownTimer.equals(s2, s3));
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testEqualsT1Null() {
        CountDownTimer.setSuspend(false);
        CountDownTimer t1 = new CountDownTimer();
        CountDownTimer.equals(t1, (CountDownTimer)null);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testEqualsT2Null() {
        CountDownTimer.setSuspend(false);
        CountDownTimer t2 = new CountDownTimer();
        CountDownTimer.equals(t2, (CountDownTimer)null);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testEqualsT1AndT2Suspend() {
        CountDownTimer s1 = new CountDownTimer(5, 59, 30);
        CountDownTimer s2 = new CountDownTimer(5, 59, 30);
        CountDownTimer.setSuspend(true);
        CountDownTimer.equals(s1, s2);
    }

    @Test
    public void testCompareTo1() {
        CountDownTimer s = new CountDownTimer(1, 1, 1);
        CountDownTimer s1 = new CountDownTimer(0, 1, 1);
        Assert.assertEquals((long)s.compareTo(s1), 1L);
        CountDownTimer s2 = new CountDownTimer(10, 0, 0);
        CountDownTimer s3 = new CountDownTimer(5, 0, 0);
        Assert.assertEquals((long)s2.compareTo(s3), 1L);
        CountDownTimer s4 = new CountDownTimer(0, 1, 0);
        CountDownTimer s5 = new CountDownTimer(0, 0, 59);
        Assert.assertEquals((long)s4.compareTo(s5), 1L);
    }

    @Test
    public void testCompareToNegative1() {
        CountDownTimer s = new CountDownTimer(1, 1, 1);
        CountDownTimer s1 = new CountDownTimer(5, 1, 1);
        Assert.assertEquals((long)s.compareTo(s1), -1L);
        CountDownTimer s2 = new CountDownTimer(10, 0, 0);
        CountDownTimer s3 = new CountDownTimer(20, 0, 0);
        Assert.assertEquals((long)s2.compareTo(s3), -1L);
        CountDownTimer s4 = new CountDownTimer(0, 1, 0);
        CountDownTimer s5 = new CountDownTimer(0, 4, 59);
        Assert.assertEquals((long)s4.compareTo(s5), -1L);
    }

    @Test
    public void testCompareTo0() {
        CountDownTimer s = new CountDownTimer(1, 1, 1);
        CountDownTimer s1 = new CountDownTimer(1, 1, 1);
        Assert.assertEquals((long)s.compareTo(s1), 0L);
        CountDownTimer s2 = new CountDownTimer(10, 0, 0);
        CountDownTimer s3 = new CountDownTimer(10, 0, 0);
        Assert.assertEquals((long)s2.compareTo(s3), 0L);
        CountDownTimer s4 = new CountDownTimer(0, 1, 59);
        CountDownTimer s5 = new CountDownTimer(0, 1, 59);
        Assert.assertEquals((long)s4.compareTo(s5), 0L);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testCompareToNull() {
        CountDownTimer s = new CountDownTimer(1, 2, 3);
        s.compareTo((CountDownTimer)null);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testCompareToSuspend() {
        CountDownTimer s = new CountDownTimer(1, 1, 1);
        CountDownTimer s1 = new CountDownTimer(1, 1, 1);
        CountDownTimer.setSuspend(true);
        s.compareTo(s1);
    }

    @Test
    public void testCompareToT1andT2Zero() {
        CountDownTimer s = new CountDownTimer(5, 59, 30);
        CountDownTimer s1 = new CountDownTimer(5, 59, 30);
        Assert.assertEquals((long)CountDownTimer.compareTo(s, s1), 0L);
        CountDownTimer s2 = new CountDownTimer(0, 50, 30);
        CountDownTimer s3 = new CountDownTimer(0, 50, 30);
        Assert.assertEquals((long)CountDownTimer.compareTo(s2, s3), 0L);
    }

    @Test
    public void testCompareToT1andT2One() {
        CountDownTimer s = new CountDownTimer(5, 59, 30);
        CountDownTimer s1 = new CountDownTimer(5, 59, 0);
        Assert.assertEquals((long)CountDownTimer.compareTo(s, s1), 1L);
        CountDownTimer s2 = new CountDownTimer(2, 50, 30);
        CountDownTimer s3 = new CountDownTimer(1, 20, 30);
        Assert.assertEquals((long)CountDownTimer.compareTo(s2, s3), 1L);
    }

    @Test
    public void testEqualsT1andT2NegativeOne() {
        CountDownTimer s = new CountDownTimer(5, 59, 30);
        CountDownTimer s1 = new CountDownTimer(10, 59, 30);
        Assert.assertEquals((long)CountDownTimer.compareTo(s, s1), -1L);
        CountDownTimer s2 = new CountDownTimer(0, 50, 30);
        CountDownTimer s3 = new CountDownTimer(6, 50, 30);
        Assert.assertEquals((long)CountDownTimer.compareTo(s2, s3), -1L);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testCompareToT1Null() {
        CountDownTimer.setSuspend(false);
        CountDownTimer t1 = new CountDownTimer(2, 2, 2);
        CountDownTimer.compareTo(t1, (CountDownTimer)null);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testCompareToT2Null() {
        CountDownTimer.setSuspend(false);
        CountDownTimer t2 = new CountDownTimer(1, 1, 1);
        CountDownTimer.compareTo((CountDownTimer)null, t2);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testCompareToT1AndT2Suspend() {
        CountDownTimer s = new CountDownTimer(1, 1, 1);
        CountDownTimer s1 = new CountDownTimer(1, 1, 1);
        CountDownTimer.setSuspend(true);
        CountDownTimer.compareTo(s, s1);
    }

    @Test
    public void testDec1Second() {
        CountDownTimer s = new CountDownTimer(1, 59, 59);
        s.dec();
        Assert.assertEquals((long)s.getHours(), 1L);
        Assert.assertEquals((long)s.getMinutes(), 59L);
        Assert.assertEquals((long)s.getSeconds(), 58L);
    }

    @Test
    public void testDec() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(5, 3, 6);
        s.dec();
        Assert.assertEquals((long)s.getSeconds(), 5L);
    }

    @Test
    public void testDecMinute() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(0, 5, 0);
        s.dec();
        Assert.assertEquals((long)s.getMinutes(), 4L);
        Assert.assertEquals((long)s.getSeconds(), 59L);
    }

    @Test
    public void testDecHour() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(2, 0, 0);
        s.dec();
        Assert.assertEquals((long)s.getHours(), 1L);
        Assert.assertEquals((long)s.getMinutes(), 59L);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testDecSuspend() {
        CountDownTimer s = new CountDownTimer(0, 30, 30);
        CountDownTimer.setSuspend(true);
        s.dec();
    }

    @Test
    public void testsub1() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(0, 0, 6);
        s.sub(1);
        Assert.assertEquals((long)s.getSeconds(), 5L);
    }

    @Test
    public void testSub10() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.add(20);
        s.sub(10);
        Assert.assertEquals((long)s.getSeconds(), 10L);
    }

    @Test
    public void testSub59() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.add(70);
        s.sub(59);
        Assert.assertEquals((long)s.getSeconds(), 11L);
    }

    @Test
    public void testSub60() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.add(120);
        s.sub(60);
        Assert.assertEquals((long)s.getMinutes(), 1L);
    }

    @Test
    public void testSub3600() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.add(7200);
        s.sub(3600);
        Assert.assertEquals((long)s.getHours(), 1L);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSub0() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.sub(0);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSubNegative() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.sub(-1);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSubSuspend() {
        CountDownTimer s = new CountDownTimer(0, 3, 3);
        CountDownTimer.setSuspend(true);
        s.sub(1);
    }

    @Test
    public void testSubOther() {
        CountDownTimer s = new CountDownTimer(2, 2, 2);
        CountDownTimer s1 = new CountDownTimer(1, 1, 1);
        s.sub(s1);
        Assert.assertEquals((long)s.getHours(), 1L);
        Assert.assertEquals((long)s.getMinutes(), 1L);
        Assert.assertEquals((long)s.getSeconds(), 1L);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSubOtherNull() {
        CountDownTimer s = new CountDownTimer(5, 5, 5);
        CountDownTimer s1 = new CountDownTimer(0, 0, Integer.parseInt((String)null));
        s.sub(s1);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testSubOtherSuspend() {
        CountDownTimer s = new CountDownTimer(5, 5, 5);
        CountDownTimer s1 = new CountDownTimer(0, 0, 3);
        CountDownTimer.setSuspend(true);
        s.sub(s1);
    }

    @Test
    public void testInc() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(5, 3, 6);
        s.inc();
        Assert.assertEquals((long)s.getSeconds(), 7L);
    }

    @Test
    public void testIncMinute() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(0, 5, 59);
        s.inc();
        Assert.assertEquals((long)s.getMinutes(), 6L);
        Assert.assertEquals((long)s.getSeconds(), 0L);
    }

    @Test
    public void testIncHour() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(2, 59, 59);
        s.inc();
        Assert.assertEquals((long)s.getHours(), 3L);
        Assert.assertEquals((long)s.getMinutes(), 0L);
        Assert.assertEquals((long)s.getSeconds(), 0L);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testIncSuspend() {
        CountDownTimer s = new CountDownTimer(0, 30, 30);
        CountDownTimer.setSuspend(true);
        s.inc();
    }

    @Test
    public void testAdd1() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.add(1);
        Assert.assertEquals((long)s.getHours(), 0L);
        Assert.assertEquals((long)s.getMinutes(), 0L);
        Assert.assertEquals((long)s.getSeconds(), 1L);
    }

    @Test
    public void testAdd10() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.add(10);
        Assert.assertEquals((long)s.getHours(), 0L);
        Assert.assertEquals((long)s.getMinutes(), 0L);
        Assert.assertEquals((long)s.getSeconds(), 10L);
    }

    @Test
    public void testAdd59() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.add(59);
        Assert.assertEquals((long)s.getHours(), 0L);
        Assert.assertEquals((long)s.getMinutes(), 0L);
        Assert.assertEquals((long)s.getSeconds(), 59L);
    }

    @Test
    public void testAdd60() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.add(61);
        Assert.assertEquals((long)s.getHours(), 0L);
        Assert.assertEquals((long)s.getMinutes(), 1L);
        Assert.assertEquals((long)s.getSeconds(), 1L);
    }

    @Test
    public void testAdd3600() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.add(3600);
        Assert.assertEquals((long)s.getHours(), 1L);
        Assert.assertEquals((long)s.getMinutes(), 0L);
        Assert.assertEquals((long)s.getSeconds(), 0L);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testAdd0() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.add(0);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testAddNegative() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer();
        s.add(-1);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testAddSuspend() {
        CountDownTimer s = new CountDownTimer(0, 5, 5);
        CountDownTimer.setSuspend(true);
        s.add(5);
    }

    @Test
    public void testAddOther() {
        CountDownTimer s = new CountDownTimer(2, 2, 2);
        CountDownTimer s1 = new CountDownTimer(1, 1, 1);
        s.add(s1);
        Assert.assertEquals((long)s.getHours(), 3L);
        Assert.assertEquals((long)s.getMinutes(), 3L);
        Assert.assertEquals((long)s.getSeconds(), 3L);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testAddOtherNull() {
        CountDownTimer s = new CountDownTimer(5, 5, 5);
        CountDownTimer s1 = new CountDownTimer(0, 0, Integer.parseInt((String)null));
        s.add(s1);
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testAddOtherSuspend() {
        CountDownTimer s = new CountDownTimer(5, 5, 5);
        CountDownTimer s1 = new CountDownTimer(0, 0, 3);
        CountDownTimer.setSuspend(true);
        s.add(s1);
    }

    @Test
    public void testToStringStringParameter() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer("1:02:03");
        Assert.assertEquals(s.toString(), "1:02:03");
        CountDownTimer s1 = new CountDownTimer("0:11:11");
        Assert.assertEquals(s1.toString(), "0:11:11");
    }

    @Test
    public void testToString3Parameter() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(0, 30, 40);
        Assert.assertEquals(s.toString(), "0:30:40");
        CountDownTimer s1 = new CountDownTimer(2, 30, 4);
        Assert.assertEquals(s1.toString(), "2:30:04");
        CountDownTimer s2 = new CountDownTimer(2, 3, 40);
        Assert.assertEquals(s2.toString(), "2:03:40");
        CountDownTimer s3 = new CountDownTimer(2, 3, 4);
        Assert.assertEquals(s3.toString(), "2:03:04");
    }

    @Test
    public void testToString2Parameter() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(30, 40);
        Assert.assertEquals(s.toString(), "0:30:40");
        CountDownTimer s1 = new CountDownTimer(30, 4);
        Assert.assertEquals(s1.toString(), "0:30:04");
        CountDownTimer s2 = new CountDownTimer(3, 40);
        Assert.assertEquals(s2.toString(), "0:03:40");
        CountDownTimer s3 = new CountDownTimer(3, 4);
        Assert.assertEquals(s3.toString(), "0:03:04");
    }

    @Test
    public void testToString1Parameter() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s = new CountDownTimer(40);
        Assert.assertEquals(s.toString(), "0:00:40");
        CountDownTimer s1 = new CountDownTimer(4);
        Assert.assertEquals(s1.toString(), "0:00:04");
    }

    @Test(
            expected = IllegalArgumentException.class
    )
    public void testToStringSuspended() {
        CountDownTimer s = new CountDownTimer(0, 30, 40);
        CountDownTimer.setSuspend(true);
        s.toString();
    }

    @Test
    public void testSaveLoadMethod() {
        CountDownTimer.setSuspend(false);
        CountDownTimer s1 = new CountDownTimer(5, 5, 5);
        CountDownTimer s2 = new CountDownTimer("5:05:05");
        s1.save("myFile");
        s1 = new CountDownTimer();
        s1.load("myFile");
        Assert.assertEquals(s1, s2);
    }
}

