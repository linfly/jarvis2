package com.mogujie.jarvis.rest;

import org.junit.Test;

/**
 * Created by muming on 15/12/1.
 */
public class TestRestResult {

    @Test
    public void test() {

        RestResult<?> result = new RestResult<>();
        result.setCode(1);
        result.setMsg("msg is welcome!");

        new RestResult<>();

    }

}