package api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Optional;

public record Election (String id, List<Candidate> candidates) {
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public record Candidate(String id,
                            Optional<String> photo,
                            String givenName,
                            String familyName,
                            Optional<String> phone,
                            Optional<String> job,
                            Integer votes){

    }
}
