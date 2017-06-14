package spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberDao {
	private static long nextId = 0;
	
	private Map<String, Member> map = new HashMap<String, Member>();	//제네릭 Map<key, value>
	
	public Member selectByEmail(String email) {
		return map.get(email);
	}
	
	public void insert(Member member) {
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}
	
	public void update(Member member) {
		map.put(member.getEmail(), member);
	}

	public Collection<Member> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
