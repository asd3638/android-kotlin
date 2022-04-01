package service;

import junit.framework.TestCase;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/"})
public class SampleServiceImplTest extends TestCase {

    private SampleServiceImpl sampleService;

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    @Test
    public void testDoAdd() {
        Assert.assertEquals(Optional.of(5), sampleService.doAdd("2", "3"));
    }
}