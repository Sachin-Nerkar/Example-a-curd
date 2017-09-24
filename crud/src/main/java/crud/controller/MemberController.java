package crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import crud.iservice.IMemberService;
import crud.model.MemberDO;

/**
 * 
 * @author sachin
 *
 */
@RestController
public class MemberController {

	@Autowired
	IMemberService memberService;

	@PostMapping(value = "addMember")
	@ResponseBody
	public List<MemberDO> addMember(@RequestParam List<MemberDO> members) {
		List<MemberDO> addedMembers = new ArrayList<>();
		for (MemberDO member : members) {
			try {
				MemberDO mem = memberService.save(member);
				addedMembers.add(mem);
			} catch (Exception e) {
				System.out.println("Not able to add member : " + e.getMessage());
			}
		}
		return addedMembers;
	}

	@RequestMapping(value = "/getMember/{id}")
	public MemberDO getMember(@RequestAttribute long id) {
		MemberDO member = new MemberDO();
		try {
			member = memberService.findOne(id);
		} catch (Exception e) {
			System.out.println("Not able to find member with id : " + id);
		}
		return member;
	}
}
