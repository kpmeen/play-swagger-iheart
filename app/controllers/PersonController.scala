package controllers

import java.util.UUID
import javax.inject._

import models.api.PersonProtocol.{Address, Name, Person, PersonId}
import play.api.libs.json.Json
import play.api.mvc._


@Singleton
class PersonController @Inject() extends Controller {

  def getPerson(personId: String) = Action { implicit request =>
    val p = Person(
      id = PersonId(UUID.randomUUID),
      name = Name(
        first = "John",
        middle = None,
        last = "Doe"
      ),
      address = Address(
        street = "Donkey Kong Alley",
        houseNumber = 12,
        city = "Hong Kong",
        postcode = 1231,
        country = "China"
      )
    )
    Ok(Json.toJson(p))
  }

}
