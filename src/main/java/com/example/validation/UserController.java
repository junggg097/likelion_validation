package com.example.validation;

import com.example.validation.dto.UserDto;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {
    @PostMapping("/validate-dto")
    public String validateDto(
            // 이 데이터는 입력을 검증 해야 한다.
            @Valid
            @RequestBody
            UserDto dto
    ){
        log.info(dto.toString());
        return "done";
    }
}
