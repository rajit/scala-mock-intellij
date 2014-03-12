import org.scalamock.scalatest.MockFactory
import org.scalatest.FlatSpec
import org.scalatest.matchers.ClassicMatchers
import scala.language.reflectiveCalls

class ExampleServiceTest extends FlatSpec with ClassicMatchers with MockFactory {
  def fixture =
    new {
      val exampleService = mock[ExampleService]

      val toReturn = List(Something("c", "d"))
      val facade = new ExampleFacade
      facade.service = exampleService
      (exampleService.getSomething _).expects().returning(toReturn)
    }

  "/pages" should "request pages from pageFacade and return them" in {
    val f = fixture
    assert(f.toReturn == f.facade.getSomething)
  }
}