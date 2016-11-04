package com.annashabalina.app.homework.lesson10;

import com.annashabalina.app.classwork.lesson10.Palindromes;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Пользователь on 04.11.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class PalindromesCSVTest {
    @Test
    @FileParameters(value="src/test/resources/palindromes.csv",
        mapper= CsvWithHeaderMapper.class)
    public void testAlgorithm1(String palindrome, boolean expRes){
        Assert.assertEquals(expRes, Palindromes.checkIfPalindromeV1(palindrome));
    }

    @Test
    @FileParameters(value="src/test/resources/palindromes.csv",
                mapper=CsvWithHeaderMapper.class)
    public void testAlgorithm2(String palindrome, boolean expRes){
        Assert.assertEquals(expRes, Palindromes.checkIfPalindromeV2(palindrome));
    }

    @Test
    @FileParameters(value="src/test/resources/palindromes.csv",
                    mapper=CsvWithHeaderMapper.class)
    public void testAlgorithm3(String palindrome, boolean expRes){
        Assert.assertEquals(expRes, Palindromes.checkIfPalindromeV3(palindrome));
    }

    @Test
    @FileParameters(value="src/test/resources/palindromes.csv",
                    mapper=CsvWithHeaderMapper.class)
    public void testAlgorithm4(String palindrome, boolean expRes){
        Assert.assertEquals(expRes, Palindromes.checkIfPalindromeV4(palindrome));
    }

    @Test
    @FileParameters(value="src/test/resources/palindromes.csv",
                    mapper=CsvWithHeaderMapper.class)
    public void testAlgorithm5(String palindrome, boolean expRes){
        Assert.assertEquals(expRes, Palindromes.checkIfPalindromeV5(palindrome));
    }
}
