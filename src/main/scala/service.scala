class ExampleFacade {
  var service: ExampleService = _

  def getSomething: List[Something] = service.getSomething
}

class ExampleServiceImpl extends ExampleService {
    def getSomething: List[Something] =
        List(Something("a", "b"))
}

trait ExampleService {
    def getSomething: List[Something]
}

case class Something(one: String, two: String)

object Main extends App {
    val facade = new ExampleFacade
    facade.service = new ExampleServiceImpl
    println(facade.getSomething)
}
