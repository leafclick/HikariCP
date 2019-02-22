/*
 * Copyright (C) 2013,2014 Brett Wooldridge
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zaxxer.hikari.metrics;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.pool.HikariPool;

public interface IHealthChecker {
   /**
    * Register Dropwizard health checks.
    *
    * @param pool         the pool to register health checks for
    * @param hikariConfig the pool configuration
    * @param registry     the HealthCheckRegistry into which checks will be registered
    */
   void registerHealthChecks(final HikariPool pool, final HikariConfig hikariConfig, final Object registry);
}
