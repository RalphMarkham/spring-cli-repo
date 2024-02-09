package where.ralphsplace.spotlesspoc.config;

import net.javacrumbs.shedlock.core.LockProvider;
import net.javacrumbs.shedlock.provider.inmemory.InMemoryLockProvider;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
class SchedulerConfigurationTest {

  @Bean
  public LockProvider lockProvider() {
    return new InMemoryLockProvider();
  }
}
