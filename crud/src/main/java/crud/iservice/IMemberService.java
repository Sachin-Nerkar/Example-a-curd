package crud.iservice;

import org.springframework.stereotype.Service;

import crud.model.MemberDO;

/**
 * 
 * @author sachin
 *
 */
@Service
public interface IMemberService {

	MemberDO save(MemberDO entity);

	MemberDO findOne(Long id);

	void delete(MemberDO entity);
}
