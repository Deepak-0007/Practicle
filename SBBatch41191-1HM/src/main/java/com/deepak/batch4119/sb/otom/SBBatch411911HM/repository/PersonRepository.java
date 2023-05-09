package com.deepak.batch4119.sb.otom.SBBatch411911HM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepak.batch4119.sb.otom.SBBatch411911HM.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

}
