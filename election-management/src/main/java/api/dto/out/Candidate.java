package api.dto.out;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public record Candidate(String id,
                        Optional<String> photo,
                        String givenName,
                        String familyName,
                        String email,
                        Optional<String> phone,
                        Optional<String> job) {
    public static Candidate fromDomain(domain.Candidate candidate) {
        return new Candidate(candidate.id(),
                candidate.photo(),
                candidate.givenName(),
                candidate.familyName(),
                candidate.email(),
                candidate.phone(),
                candidate.jobTitle());
    }
}
