package cz.dojcar.hello;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by michaldojcar on 26.05.2017
 */
public class HelloTest {

    @Test
    public void firstTest() throws Exception {
        Hello hello = new Hello();
        Assert.assertThat(hello.greet(), is("Hi"));
    }
}
