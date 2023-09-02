package com.mphasis.fulfillmentapp.repository;

import com.mphasis.fulfillmentapp.mapper.entity.CandidateDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateDetailsRepo extends JpaRepository<CandidateDetailsEntity,Long> {
}
