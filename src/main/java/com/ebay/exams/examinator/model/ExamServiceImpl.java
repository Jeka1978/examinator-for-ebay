package com.ebay.exams.examinator.model;

import com.ebay.exams.examinator.services.ExamService;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class ExamServiceImpl implements ExamService {
    @Override
    public CheckedExam convert(SolvedExam solvedExam) {
        return CheckedExam.builder().exam(solvedExam.getExam()).mark(80).build();
    }
}
