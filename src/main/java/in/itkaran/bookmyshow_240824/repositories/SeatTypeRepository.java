package in.itkaran.bookmyshow_240824.repositories;

import in.itkaran.bookmyshow_240824.models.SeatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatTypeRepository extends JpaRepository<SeatType, Long> {
}
