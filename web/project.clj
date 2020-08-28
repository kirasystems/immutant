;; Copyright 2014-2017 Red Hat, Inc, and individual contributors.
;;
;; Licensed under the Apache License, Version 2.0 (the "License");
;; you may not use this file except in compliance with the License.
;; You may obtain a copy of the License at
;;
;; http://www.apache.org/licenses/LICENSE-2.0
;;
;; Unless required by applicable law or agreed to in writing, software
;; distributed under the License is distributed on an "AS IS" BASIS,
;; WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
;; See the License for the specific language governing permissions and
;; limitations under the License.

(defproject org.immutant/web "2.1.13-SNAPSHOT"
  :description "Serve web requests using Ring handlers, Servlets, or Undertow HttpHandlers."
  :plugins [[lein-modules "0.3.11"]]
  :java-source-paths ["src"]
  
  :dependencies [[org.immutant/core _]
                 [org.projectodd.wunderboss/wunderboss-web-undertow _]
                 [ring/ring-core _]]

  :profiles {:dev
             {:dependencies [[io.pedestal/pedestal.service _]
                             [http.async.client _]
                             [org.clojars.tcrawley/gniazdo _]
                             [ring/ring-devel _]
                             [compojure _]
                             [clj-http _]
                             [org.glassfish.jersey.media/jersey-media-sse _]]}}

  :test-paths ["test" "test-integration"])
