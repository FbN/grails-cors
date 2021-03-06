/*
 * Copyright 2013 BrandsEye (http://www.brandseye.com/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

grails.project.work.dir = "target"

grails.project.dependency.resolution = {
    inherits "global"
    log "warn"

    repositories {
        grailsCentral()
    }

    dependencies {
        //test ":grails-test-suite-base:$grailsVersion"
	String springSecurityVersion = '3.2.3.RELEASE'
        compile("org.springframework.security:spring-security-core:$springSecurityVersion") {
            transitive = false
        }
        compile("org.springframework.security:spring-security-web:$springSecurityVersion") {
	    transitive = false
        }
    }

    plugins {
        compile ":webxml:1.4.1"
	build(":release:3.0.1", ":rest-client-builder:1.0.3") {
	   export = false
	}
    }
}
