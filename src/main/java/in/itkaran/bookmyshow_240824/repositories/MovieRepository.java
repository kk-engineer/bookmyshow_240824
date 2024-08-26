package in.itkaran.bookmyshow_240824.repositories;

import in.itkaran.bookmyshow_240824.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
