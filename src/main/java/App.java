import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      //retriving hero data from session and placing it in the model with hero key
      model.put("hero" request.session().attribute("hero"));
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/heros", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      //fetch user-inputted hero name from the form and save it in String
      String name = request.queryParams("name");
      //Hero constructor to create new Hero
      Hero newHero = new Hero(name);
      //Save Hero objects into the user's session
      request.session().attribute("hero", newHero);
      //render success page
      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
}
}
