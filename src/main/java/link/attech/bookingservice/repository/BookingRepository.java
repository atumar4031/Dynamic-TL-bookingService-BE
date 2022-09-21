package link.attech.bookingservice.repository;

import link.attech.bookingservice.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookingRepository extends JpaRepository<Booking, Long> {
}
