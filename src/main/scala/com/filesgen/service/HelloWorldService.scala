package com.filesgen.service

import com.filesgen.generated.proto.hello.{GreeterGrpc, HelloReply, HelloRequest}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class GreeterService extends GreeterGrpc.Greeter {
  override def sayHello(request: HelloRequest): Future[HelloReply] = Future {
    HelloReply(message = s"${request.name}")
  }
}
