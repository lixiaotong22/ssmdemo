package com.learn.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Paper {
    private long paperId;
    private String paperName;
    private int paperNum;
    private String paperDetail;
}
