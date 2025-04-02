package com.pauseforcode.itstime;

import com.pauseforcode.itstime.config.AsyncSyncConfiguration;
import com.pauseforcode.itstime.config.EmbeddedRedis;
import com.pauseforcode.itstime.config.EmbeddedSQL;
import com.pauseforcode.itstime.config.JacksonConfiguration;
import com.pauseforcode.itstime.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = { ItsTimeBackApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class }
)
@EmbeddedRedis
@EmbeddedSQL
public @interface IntegrationTest {
}
