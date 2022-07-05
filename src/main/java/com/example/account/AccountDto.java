package com.example.account;

import lombok.*;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;


@Getter
@Setter
@ToString
//@NoArgsConstructor // 아무 값을 넣지 않아도 생성이 가능함
@AllArgsConstructor // 모든 값을 다 넣어야 생성이 가능함
@RequiredArgsConstructor // 필요한 값을 넣어야 생성이 가능함 (Bean을 주입받을 때 자주 사용함)
@Data // Getter, Setter, ToString 등등 모두 포함하고 있음 (보안상의 이유로 잘 사용하지 않음)
@Slf4j
public class AccountDto {
    private String accountNumber;
    private String nickname;
    private LocalDateTime registeredAt;

    public void log() {
        log.error("error is occurred.");
    }

    // getter, setter 로 데이터 입,출력
    // 데이터의 이름을 바꿀때, 데이터가 추가될 때 번거로움
/*
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public LocalDateTime getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(LocalDateTime registeredAt) {
        this.registeredAt = registeredAt;
    }
*/

}
