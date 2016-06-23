package facade;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import data.FederalBillEntity;

import java.io.IOException;
import java.net.URL;

@Component
public class GovTrackFacade {

    private static final String BASE_URL = "https://www.govtrack.us/api/v2/";
    
    private static final String BILL_ENDPOINT = "bill/";
    private static final String COSPONSORSHIP_ENDPOINT = "cosponsorship/";
    private static final String PERSON_ENDPOINT = "person/";
    private static final String ROLE_ENDPOINT = "role/";
    private static final String VOTE_ENDPOINT = "vote/";
    private static final String VOTER_VOTE_ENDPOINT = "voter_vote/";
    private static final String COMMITTEE_ENDPOINT = "committee/";
    private static final String COMMITTEE_MEMBER_ENDPOINT = "committee_member/";
    
    ObjectMapper objectMapper = new ObjectMapper();
    
    public FederalBillEntity getBill(long id) throws IOException {
        URL url = new URL(BASE_URL + BILL_ENDPOINT + id);
        return objectMapper.readValue(url, FederalBillEntity.class);
    }
}
