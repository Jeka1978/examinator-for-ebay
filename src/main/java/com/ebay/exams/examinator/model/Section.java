package com.ebay.exams.examinator.model;

import lombok.*;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
public class Section {
    private String title;
    private String desc;
    @Singular
    private List<Exercise> exercises;
}
