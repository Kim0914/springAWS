package org.example.springboot.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.Test;



public class HelloResponseDtoTest {
    @Test
    public void lombokTest(){
        //given
        String name = "Test";
        int amount = 10000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        Assertions.assertThat(dto.getName()).isEqualTo(name);
        Assertions.assertThat(dto.getAmount()).isEqualTo(amount);
    }

}