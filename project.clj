(defproject clojure-fizz-buzz "0.1.0-SNAPSHOT"
  :description "FizzBuzz in Clojure"
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot clojure-fizz-buzz.fizzbuzz
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
