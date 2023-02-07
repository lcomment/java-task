package com.example.global;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.data.annotation.CreatedDate;

import lombok.Getter;

@Getter
@Embeddable
public class BaseTime {
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime writeday;
}