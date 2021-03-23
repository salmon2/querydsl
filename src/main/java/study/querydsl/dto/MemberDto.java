package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //Dto 찾기를 위해서 필요
public class MemberDto {
    private String username;
    private int age;

    @QueryProjection //gradle->other->compileQuerydsl로 dto Q파일로 만들기
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }

}
