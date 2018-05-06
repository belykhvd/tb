package TelegramBot

case class Answer(number: Int, options: List[String])
case class State(contexts: Map[Int, Long], polls: Map[Long, Poll])