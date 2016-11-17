(defproject sieve "0.1.0-SNAPSHOT"
  :description "Sieve of Erasthotenes"
  :license {:name "MIT License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot sieve.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
