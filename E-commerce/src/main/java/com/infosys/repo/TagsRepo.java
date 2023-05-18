package com.infosys.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.entity.Tags;

@Repository
public interface TagsRepo extends JpaRepository<Tags, Integer> {
	

}
