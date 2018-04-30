package com.ebay.exams.examinator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Delegate;

/**
 * @author Evgeny Borisov
 */
@Builder
@Data
public class SolvedExam {
    @Delegate
    @JsonIgnore
    private Exam exam;

    private String student;
}
