package compareversion;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompareVersionTest {

    @Test
    public void findCompareVersionSecondVersionLess() {
        CompareVersion compareVersion = new CompareVersion();
        String firstVersion = "1.0.0";
        String secondVersion = "1.0.0.5";
        Assert.assertEquals(compareVersion.findCompareVersion(firstVersion, secondVersion), -1);
    }

    @Test
    public void findCompareVersionFirstVersionLess() {
        CompareVersion compareVersion = new CompareVersion();
        String firstVersion = "1.0.0.5";
        String secondVersion = "1.0.0";
        Assert.assertEquals(compareVersion.findCompareVersion(firstVersion, secondVersion), 1);
    }

    @Test
    public void findCompareVersionBothVersionsEmpty() {
        CompareVersion compareVersion = new CompareVersion();
        String firstVersion = "";
        String secondVersion = "";
        Assert.assertEquals(compareVersion.findCompareVersion(firstVersion, secondVersion), 0);
    }

    @Test
    public void findCompareVersionBothVersionsSame() {
        CompareVersion compareVersion = new CompareVersion();
        String firstVersion = "1";
        String secondVersion = "1";
        Assert.assertEquals(compareVersion.findCompareVersion(firstVersion, secondVersion), 0);
    }

    @Test
    public void findCompareVersionBothVersionsLessZero() {
        CompareVersion compareVersion = new CompareVersion();
        String firstVersion = "-1";
        String secondVersion = "-2";
        Assert.assertEquals(compareVersion.findCompareVersion(firstVersion, secondVersion), 1);
    }


}