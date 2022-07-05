package com.example.account.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity // 설정 파일
public class Account {
    @Id // Primary Key로 지정
    @GeneratedValue
    private Long id;

    private String accountNumber;

    @Enumerated(EnumType.STRING) // enum에 있는 데이터의 index가 아니라 데이터 자체를 가져옴
    private AccountStatus accountStatus;
}
