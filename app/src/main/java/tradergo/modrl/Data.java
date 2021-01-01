package tradergo.modrl;

import lombok.Value;

public interface Data {

    @Value
    public class CData {

        private String id;
        private String firstName;
        private String familyName;

    }
}