package TelegramBot.Parsers

import scala.util.parsing.combinator._

object BaseParser extends RegexParsers {
  def argument: Parser[String] = "\\(((\\(\\()|(\\)\\))|[^()])*\\)".r ^^ {
    arg => arg.substring(1, arg.length - 1).replace("((", "(").replace("))", ")")
  }
}
