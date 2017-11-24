package ac.uk.bristol.cs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by csxds on 23/11/2017.
 */
public class MainController {

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {

        return "hi";
    }
}
