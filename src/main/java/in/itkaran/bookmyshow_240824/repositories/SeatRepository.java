package in.itkaran.bookmyshow_240824.repositories;

import in.itkaran.bookmyshow_240824.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
}
