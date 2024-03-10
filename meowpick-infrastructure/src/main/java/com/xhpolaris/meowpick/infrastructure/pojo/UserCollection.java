package com.xhpolaris.meowpick.infrastructure.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;

@Data
@Document("user")
@NoArgsConstructor
@AllArgsConstructor
public class UserCollection {
    @MongoId
    private String  id;
    private String  name;
    private String  avatar;
    private String  phone;
    private String  email;
    private String  password;
    private boolean auth;
    private String  teacher;

    private boolean account_enable     = true;
    private boolean account_lock       = true;
    private boolean account_expire     = true;
    private boolean account_credential = true;

    @CreatedDate
    private Date crateAt;
    @LastModifiedDate
    private Date updateAt;

}
