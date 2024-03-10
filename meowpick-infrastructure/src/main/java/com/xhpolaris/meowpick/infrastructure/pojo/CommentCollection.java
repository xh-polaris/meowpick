package com.xhpolaris.meowpick.infrastructure.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Document("comment")
@AllArgsConstructor
@NoArgsConstructor
public class CommentCollection {

    @Data
    public static class Reply {
        private String id;
        private String text;
        private String uid;
        @CreatedDate
        private Date crateAt;
        @LastModifiedDate
        private Date updateAt;
//        private List<Reply> replies;
    }

    @MongoId
    private String id;

    private String target;
    private String text;
    private String uid;
    private List<Reply> replies = new ArrayList<>();

    @CreatedDate
    private Date crateAt;
    @LastModifiedDate
    private Date updateAt;
}
