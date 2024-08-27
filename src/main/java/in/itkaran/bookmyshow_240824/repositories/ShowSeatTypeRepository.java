package in.itkaran.bookmyshow_240824.repositories;

import in.itkaran.bookmyshow_240824.models.Show;
import in.itkaran.bookmyshow_240824.models.ShowSeat;
import in.itkaran.bookmyshow_240824.models.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType, Long> {

    List<ShowSeatType> findAllByShow(Show show);
}
