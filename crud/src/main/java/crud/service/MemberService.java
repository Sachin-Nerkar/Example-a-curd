package crud.service;

import org.springframework.beans.factory.annotation.Autowired;

import crud.iservice.IMemberService;
import crud.model.MemberDO;
import crud.repository.MemberRepository;

public class MemberService implements IMemberService {

	@Autowired
	MemberRepository memberRepository;

	@Override
	public MemberDO save(MemberDO entity) {
		return memberRepository.save(entity);
	}

	@Override
	public MemberDO findOne(Long id) {
		return memberRepository.findOne(id);
	}

	@Override
	public Iterable<MemberDO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(MemberDO entity) {
		memberRepository.delete(entity);
	}

}
