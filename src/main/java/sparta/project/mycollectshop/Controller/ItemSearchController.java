package sparta.project.mycollectshop.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sparta.project.mycollectshop.Dto.ItemDto;
import sparta.project.mycollectshop.Service.ItemSearchService;
import sparta.project.mycollectshop.Service.UserService;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class ItemSearchController {

    private final ItemSearchService itemSearchService;
    private final UserService userService;
    // Controller 가 자동으로 해주는 일
    // 1. API Request 의 파라미터 값에서 검색어 추출 -> query 변수
    // 5. API Response 보내기
    //  5.1) response 의 header 설정
    //  5.2) response 의 body 설정
    @GetMapping("/api/search")
    public List<ItemDto> getItems(@RequestParam String query) throws IOException {
        return itemSearchService.getItems(query);
    }


}