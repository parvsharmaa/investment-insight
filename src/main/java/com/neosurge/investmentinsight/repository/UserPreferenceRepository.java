package com.neosurge.investmentinsight.repository;

import com.neosurge.investmentinsight.model.UserPreference;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserPreferenceRepository extends MongoRepository<UserPreference, String> {
    List<UserPreference> findByUserId(String userId);
}

// InvestmentInsightRepository.java
package com.neosurge.investmentinsight.repository;

import com.neosurge.investmentinsight.model.InvestmentInsight;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface InvestmentInsightRepository extends MongoRepository<InvestmentInsight, String> {
    List<InvestmentInsight> findByUserId(String userId);
}
