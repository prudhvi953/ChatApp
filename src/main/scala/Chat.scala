package sample.chat

import akka.actor.Actor
import akka.actor._

import scala.collection.mutable._

object Chat extends App {

sealed trait Messenger
case class Create(name: String) extends Messenger
case class Remove(name: String) extends Messenger
case class Message(from: String,to: String,sub: String) extends Messenger

var lis = new ListBuffer[String]()
var log = new ListBuffer[String]()


class Login extends Actor {
  def receive = {
    case Create(name) => {
      lis+=name
      println("logged in " + name)
      println(lis)
}
}
}

class Logout extends Actor {
   def receive = {
     case Remove(name) => {
       lis-=name
       println("logged out " + name)
       println(lis)
}
}
}

class Send extends Actor {
   def receive = {
     case Message(from:String, to: String, sub:String) => {
      if(1==1) { //(lis.contains(from)&&lis.contains(to)) {
       log+="From:"+from+","+"to:"+to+","+"sub: "+sub
       print(log)
} 
      else
       println("Oops...one of the users is not loggedin")      
}
}
}

val system = ActorSystem("Chat")
val login = system.actorOf(Props[Login])
val logout = system.actorOf(Props[Logout])
val send    = system.actorOf(Props[Send])
login ! Create("hello")
login ! Create("world")
//logout ! Remove("hello")
login ! Create("hello1")
//logout ! Remove("world")
send  ! Message("hello","world","hi")
send ! Message("word","hello","hello")
send ! Message("asdf","ghik","how are you")
}
