import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    ProcessBuilder process = new ProcessBuilder();
     Integer port;
     if (process.environment().get("PORT") != null) {
         port = Integer.parseInt(process.environment().get("PORT"));
     } else {
         port = 4567;
     }

    setPort(port);

    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      //retriving heros ArrayList data from session and placing it in the model with heros key
      model.put("heros", request.session().attribute("heros"));
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/heros", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      //Save multiple hero objects into the user's session in an array list
      ArrayList<Hero> heros = request.session().attribute("heros");
      //if ArrayList does not exist create new one and add to session
      if (heros == null) {
        heros = new ArrayList<Hero>();
        request.session().attribute("heros", heros);
      }

      //fetch user-inputted hero name from the form and save it in String
      String name = request.queryParams("name");
      int age = Integer.parseInt(request.queryParams("age"));
      String spower = request.queryParams("spower");
      String weakness = request.queryParams("weakness");
      //Hero constructor to create new Hero object and add into heros ArrayList
      Hero newHero = new Hero(name, age, spower, weakness);
      heros.add(newHero);

      //render success page
      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/squads/new", (request, response) -> {
  Map<String, Object> model = new HashMap<String, Object>();
  model.put("template", "templates/squad-form.vtl");
  return new ModelAndView(model, layout);
}, new VelocityTemplateEngine());
}
}
