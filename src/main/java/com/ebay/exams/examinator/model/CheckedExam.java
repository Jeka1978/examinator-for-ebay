package com.ebay.exams.examinator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Delegate;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
public class CheckedExam {
    private Integer mark;
    @Delegate
    @JsonIgnore
    private Exam exam;
}
