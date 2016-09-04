package models.api

import java.util.UUID

import play.api.libs.functional.syntax._
import play.api.libs.json._

object PersonProtocol {

  case class PersonId(id: UUID) extends AnyVal

  object PersonId {
    implicit val format: Format[PersonId] = Json.format[PersonId]
  }

  case class Name(first: String, middle: Option[String], last: String)

  object Name {
    implicit val format: Format[Name] = Json.format[Name]
  }

  case class Address(
    street: String,
    houseNumber: Int,
    city: String,
    postcode: Int,
    country: String
  )

  object Address {
    implicit val format: Format[Address] = Json.format[Address]
  }

  case class Person(id: PersonId, name: Name, address: Address)

  object Person {
    implicit val format: Format[Person] = (
      __.format[PersonId] and
        __.format[Name] and
        __.format[Address]
      ) (Person.apply, unlift(Person.unapply))
  }

}
