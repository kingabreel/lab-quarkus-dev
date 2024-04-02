package domain;


import api.dto.out.Election;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ElectionApi {
    private final ElectionService electionService;

    public ElectionApi(ElectionService electionService) {
        this.electionService = electionService;
    }

    public void submit() {
        electionService.submit();
    }

    public List<Election> findAll(){
        return electionService.findAll()
                .stream()
                .map(Election::fromDomain)
                .toList();
    }
}
