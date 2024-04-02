package infrastructure.schedulers;

import domain.annotations.Principal;
import infrastructure.repositories.RedisElectionRepository;
import infrastructure.repositories.SQLElectionRepository;
import io.quarkus.scheduler.Scheduled;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Sync {

    private final SQLElectionRepository sqlElectionRepository;
    private final RedisElectionRepository redisElectionRepository;

    public Sync(@Principal SQLElectionRepository sqlElectionRepository, RedisElectionRepository redisElectionRepository) {
        this.sqlElectionRepository = sqlElectionRepository;
        this.redisElectionRepository = redisElectionRepository;
    }

    @Scheduled(cron = "*/10 * * * * ?")
    void sync(){/*
        List<Election> elections = sqlElectionRepository.findAll();

        elections.forEach(election -> {
            sqlElectionRepository.sync(redisElectionRepository.sync(election));
        });
        */
        sqlElectionRepository.findAll().forEach(election -> sqlElectionRepository.sync(redisElectionRepository.sync(election)));
    }
}
