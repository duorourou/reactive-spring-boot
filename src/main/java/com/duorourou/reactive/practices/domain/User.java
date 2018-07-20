package com.duorourou.reactive.practices.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@Document
@Builder
@AllArgsConstructor
public class User {
    @Id
    private String name;
    private String address;
    private String phoneNumber;
}
