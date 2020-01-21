package com.udacity.examples.Testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertNotEquals;

@RunWith(Parameterized.class)
public class HelperParameterizedTest {

    private String input;
    private String output;


    public HelperParameterizedTest(String input, String output) {
        super();
        this.input = input;
        this.output = output;
    }

    @Parameters
    public static Collection initData(){
        String names[][] = {{"Lisa", "Lisa"},{"Lisa", "Jacob"}};
        return Arrays.asList(names);
    }

    @Test
    public void verify_input_name_is_not_out_out_name(){
        assertNotEquals(input, output);
    }
}

