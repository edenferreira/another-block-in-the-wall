(defproject another-block-in-the-wall "0.1.0-SNAPSHOT"
  :description "A collection of games and stuff using blocks"

  :url "TODO"

  :license {:name "MIT License"}

  :dependencies [[org.clojure/clojure "1.10.1"]
                 [com.stuartsierra/component "0.4.0"]
                 [quil "3.0.0"]]

  :aliases {"kaocha" ["with-profile" "+kaocha" "run" "-m" "kaocha.runner"]
            "test"   ["kaocha"]}

  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.3.1"]
                                  [com.stuartsierra/component.repl "0.2.0"]
                                  [lambdaisland/kaocha "0.0-554"]
                                  [nubank/matcher-combinators "1.2.4"]]
                   :source-paths ["dev"]}
             :kaocha {:dependencies [[lambdaisland/kaocha "0.0-554"]]}})
