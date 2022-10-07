package sparta.project.mycollectshop.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {

    private Long id;
    private String userid;
    private String userpwd;
    private String location;
    private LocalDateTime createdDate = LocalDateTime.now();

}
