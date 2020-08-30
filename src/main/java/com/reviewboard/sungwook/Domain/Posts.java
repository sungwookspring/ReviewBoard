package com.reviewboard.sungwook.Domain;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class Posts {

    @Id @GeneratedValue
    private Long id;
    private String title;
    private String content;
    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
