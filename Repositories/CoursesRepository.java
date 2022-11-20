package pl.msi.Repositories;

import org.springframework.data.repository.CrudRepository;
import pl.msi.Entity.Courses;
import pl.msi.Entity.User;

public interface CoursesRepository extends CrudRepository<Courses, Long> {
}
