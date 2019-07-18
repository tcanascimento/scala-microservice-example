package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}
import play.api.libs.json.Json
import repositories.DataRepository

@Singleton
class ApiController @Inject()(cc: ControllerComponents,
                              dataRepository: DataRepository)
  extends AbstractController(cc) {

  def ping: Action[AnyContent] = Action { implicit request =>
    Ok("Hello, Scala is running here!!!")
  }

  def getPost(postId: Int): Action[AnyContent] = Action { implicit request =>
    dataRepository.getPost(postId) map { post =>
      // If the post was found, return a 200 with the post data as JSON
      Ok(Json.toJson(post))
    } getOrElse NotFound    // otherwise, return Not Found
  }

  // NEW - Get comments for a post
  def getComments(postId: Int): Action[AnyContent] = Action { implicit request =>
    // Simply return 200 OK with the comment data as JSON.
    Ok(Json.toJson(dataRepository.getComments(postId)))
  }

}
