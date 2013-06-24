package org.pt.sports.SportsApp.repo;

import java.util.List;

import org.pt.sports.SportsApp.domain.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
