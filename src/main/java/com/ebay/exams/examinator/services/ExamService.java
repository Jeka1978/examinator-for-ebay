package com.ebay.exams.examinator.services;

import com.ebay.exams.examinator.model.CheckedExam;
import com.ebay.exams.examinator.model.SolvedExam; /**
 * @author Evgeny Borisov
 */
public interface ExamService {

    CheckedExam convert(SolvedExam solvedExam);
}
