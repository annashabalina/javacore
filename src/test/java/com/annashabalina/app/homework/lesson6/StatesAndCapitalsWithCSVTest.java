package com.annashabalina.app.homework.lesson6;

import com.annashabalina.app.homework.lesson4.StatesAndCapitals;
import com.sun.javafx.binding.SelectBinding;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Пользователь on 22.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class StatesAndCapitalsWithCSVTest {
    @Test
    @FileParameters(value="src/test/resources/statesAndCapitalsData.csv",mapper = CsvWithHeaderMapper.class)
    public void findCapital(String state, String expRes){
        StatesAndCapitals myState = new StatesAndCapitals();
        Assert.assertEquals(expRes, myState.findCapital(state));
    }
}
