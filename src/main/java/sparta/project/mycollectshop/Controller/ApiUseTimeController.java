package sparta.project.mycollectshop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sparta.project.mycollectshop.Entity.ApiUseTime;
import sparta.project.mycollectshop.Entity.UserRoleEnum;
import sparta.project.mycollectshop.Repository.ApiUseTimeRepository;

import java.util.List;

@RestController
public class ApiUseTimeController {
    private final ApiUseTimeRepository apiUseTimeRepository;

    @Autowired
    public ApiUseTimeController(ApiUseTimeRepository apiUseTimeRepository) {
        this.apiUseTimeRepository = apiUseTimeRepository;
    }

    @Secured(UserRoleEnum.Authority.ADMIN)
    @GetMapping("/api/use/time")
    public List<ApiUseTime> getAllApiUseTime() {
        return apiUseTimeRepository.findAll();
    }
}