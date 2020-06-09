package micronaut.issue;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.micronaut.core.io.IOUtils;
import io.micronaut.test.annotation.MicronautTest;
import micronaut.issue.model.Dummy;
import micronaut.issue.model.DummyLombok;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;

@MicronautTest
public class DeserializerTest {

    @Inject
    private ObjectMapper objectMapper;

    @Test
    void testWithoutLombok() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        try (InputStream in = classLoader.getResourceAsStream("dummy.json")) {
            Objects.requireNonNull(in);
            String json = IOUtils.readText(new BufferedReader(new InputStreamReader(in)));
            Dummy dummy = objectMapper.readValue(json, Dummy.class);

            Assertions.assertNotNull(dummy);
        }
    }

    @Test
    void testWithLombok() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        try (InputStream in = classLoader.getResourceAsStream("dummy.json")) {
            Objects.requireNonNull(in);
            String json = IOUtils.readText(new BufferedReader(new InputStreamReader(in)));
            DummyLombok dummy = objectMapper.readValue(json, DummyLombok.class);

            Assertions.assertNotNull(dummy);
        }
    }
}
