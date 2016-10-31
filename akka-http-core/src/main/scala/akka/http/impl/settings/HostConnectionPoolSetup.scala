/**
 * Copyright (C) 2016 Lightbend Inc. <http://www.lightbend.com>
 */

package akka.http.impl.settings

import akka.pattern.CircuitBreaker

/** INTERNAL API */
final case class HostConnectionPoolSetup(host: String, port: Int, setup: ConnectionPoolSetup, maybeBreaker: Option[CircuitBreaker] = None)

