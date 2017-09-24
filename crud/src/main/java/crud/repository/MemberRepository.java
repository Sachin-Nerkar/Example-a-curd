package crud.repository;

import org.springframework.data.repository.CrudRepository;
import crud.model.MemberDO;

/**
 * 
 * @author sachin
 *
 */
public interface MemberRepository extends CrudRepository<MemberDO, Long> {
}
