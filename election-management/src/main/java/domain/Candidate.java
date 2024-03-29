package domain;

import java.util.Optional;

public record Candidate(String id,
                        String givenName,
                        String familyName,
                        String email,
                        Optional<String> tel,
                        Optional<String> job) {
}
