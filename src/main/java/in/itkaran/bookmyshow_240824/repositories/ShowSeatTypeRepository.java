package in.itkaran.bookmyshow_240824.repositories;

import in.itkaran.bookmyshow_240824.models.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType, Long> {
}
