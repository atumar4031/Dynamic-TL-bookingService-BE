package link.attech.bookingservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BookingModel {
    private String passenger;
    private String email;
    private String phone;
    private String transportationSource;
    private String transportationDestination;
    private String bookingReference;
}
