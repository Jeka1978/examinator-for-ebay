package com.ebay.exams.examinator.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
public class Exercise {
    private String question;
    private String answer;
}
