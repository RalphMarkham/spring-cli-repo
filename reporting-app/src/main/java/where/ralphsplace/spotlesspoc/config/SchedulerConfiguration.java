package where.ralphsplace.spotlesspoc.config;

import net.javacrumbs.shedlock.core.LockProvider;
import net.javacrumbs.shedlock.provider.redis.jedis4.JedisLockProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnCloudPlatform;
import org.springframework.boot.cloud.CloudPlatform;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;

@Configuration
public class SchedulerConfiguration {
  @Bean
  @ConditionalOnCloudPlatform(CloudPlatform.CLOUD_FOUNDRY)
  public LockProvider lockProvider(JedisPool jedisPool) {
    return new JedisLockProvider(jedisPool, "ENV");
  }
}
