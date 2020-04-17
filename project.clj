(defproject webbombardier "1.0.0.0-SNAPSHOT"
  :description "webbombardier: web bombardier, almost jMeter"
  :url "http://tomaszgigiel.pl"
  :license {:name "Apache License"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/tools.cli "0.4.2"]
                 [org.clojure/tools.logging "0.5.0"]

                 [org.jsoup/jsoup "1.11.3"]
                 [org.seleniumhq.selenium/selenium-java "3.141.59"]
                 [org.seleniumhq.selenium/selenium-firefox-driver "3.141.59"]
                 [org.seleniumhq.selenium/selenium-chrome-driver "3.141.59"]
                 [org.seleniumhq.selenium/selenium-ie-driver "3.141.59"]
                 [org.seleniumhq.selenium/selenium-edge-driver "3.141.59"]
                 [commons-httpclient/commons-httpclient "3.1"]
                 ]

  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :resource-paths ["src/main/resources"]
  :target-path "target/%s"
  :jar-name "webbombardier.jar"
  :uberjar-name "webbombardier-uberjar.jar"
  :main pl.tomaszgigiel.webbombardier.core
  :aot [pl.tomaszgigiel.webbombardier.core]
  :profiles {:test {:resource-paths ["src/test/resources"]}}
)