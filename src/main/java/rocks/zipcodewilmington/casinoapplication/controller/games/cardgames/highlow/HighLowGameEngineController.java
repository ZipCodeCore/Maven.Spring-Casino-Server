package rocks.zipcodewilmington.casinoapplication.controller.games.cardgames.highlow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import rocks.zipcodewilmington.casinoapplication.services.games.cardgames.highlow.HighLowGameEngineService;

/**
 * @author leon on 9/20/18.
 */
@Controller
public class HighLowGameEngineController {
    @Autowired
    private HighLowGameEngineService service;
}
