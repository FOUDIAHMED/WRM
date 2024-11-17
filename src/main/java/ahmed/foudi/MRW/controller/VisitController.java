package ahmed.foudi.MRW.controller;

import ahmed.foudi.MRW.services.impl.VisitServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("visit/")
@RequiredArgsConstructor
public class VisitController {
    private final VisitServiceImpl visitService;
}
