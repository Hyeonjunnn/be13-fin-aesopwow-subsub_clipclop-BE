package com.aesopwow.subsubclipclop.domain.auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ForgotPasswordRequestDto {
    @NotBlank(message = "이메일은 필수입니다.")
    @Email(message = "유요한 이메일 형식이 아닙니다.")
    private String email;
}
