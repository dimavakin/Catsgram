package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Data
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
public class Post {
    private Long id;
    private long authorId;
    private String description;
    private Instant postDate;
}
