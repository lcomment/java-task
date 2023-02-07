package com.example.domain.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.member.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {
	Member findByUserid(String userid) throws Exception;
}
