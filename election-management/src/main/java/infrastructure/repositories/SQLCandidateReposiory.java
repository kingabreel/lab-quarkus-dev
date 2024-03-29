package infrastructure.repositories;

import domain.Candidate;
import domain.CandidateQuery;
import domain.CandidateRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class SQLCandidateReposiory implements CandidateRepository {
    @Override
    public void save(List<Candidate> candidate) {

    }

    @Override
    public List<Candidate> find(CandidateQuery query) {
        return List.of();
    }

}
