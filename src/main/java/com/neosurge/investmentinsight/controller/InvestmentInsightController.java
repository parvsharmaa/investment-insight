package com.neosurge.investmentinsight.controller;

import com.neosurge.investmentinsight.model.InvestmentInsight;
import com.neosurge.investmentinsight.repository.InvestmentInsightRepository;
import com.neosurge.investmentinsight.service.GptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/insights")
public class InvestmentInsightController {
    @Autowired
    private InvestmentInsightRepository investmentInsightRepository;

    @Autowired
    private GptService gptService;

    @PostMapping
    public ResponseEntity<InvestmentInsight> getInsight(@RequestBody String userInput) {
        String insight = gptService.generateInsight(userInput);
        InvestmentInsight investmentInsight = new InvestmentInsight();
        investmentInsight.setInsight(insight);
        investmentInsight.setCreatedAt(LocalDateTime.now());
        InvestmentInsight savedInsight = investmentInsightRepository.save(investmentInsight);
        return ResponseEntity.ok(savedInsight);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<InvestmentInsight>> getInsights(@PathVariable String userId) {
        List<InvestmentInsight> insights = investmentInsightRepository.findByUserId(userId);
        return ResponseEntity.ok(insights);
    }
}