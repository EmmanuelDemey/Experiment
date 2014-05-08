package hello;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.emmanueldemey.Objective;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/objective")
public class ObjectiveController {


    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public @ResponseBody Objective getObjective(
            @PathVariable(value="id") Long id) {
        return null;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public @ResponseBody Objective deleteObjective(
            @PathVariable(value="id") Long id) {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Objective createObjective(@RequestBody Objective obj) {
        return obj;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public @ResponseBody Objective updateObjective(
            @PathVariable(value="id") Long id, @RequestBody Objective obj) {
        return obj;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody
    List<Objective> getAllObjectives() {
        return null;
    }

    @RequestMapping(value = "/types", method = RequestMethod.GET)
    public @ResponseBody Object getObjectiveTypes() {
        return null;
    }
}