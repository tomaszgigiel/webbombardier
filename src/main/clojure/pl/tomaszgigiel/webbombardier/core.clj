(ns pl.tomaszgigiel.webbombardier.core
  (:require [clojure.java.io :as io])
  (:require [clojure.tools.logging :as log])
  (:import [org.openqa.selenium By WebDriver chrome.ChromeDriver firefox.FirefoxDriver])
  (:gen-class))

(def curdir (.getAbsolutePath (io/file "")))
(def userdir (System/getProperty "user.home"))

(defn selenium []
  (let [driver (ChromeDriver.)]
    (.get driver "http://moj.gov.pl/"))
  )

(defn -main
  "webbombardier: web bombardier, almost jMeter"
  [& args]
  (do
    (System/setProperty "webdriver.chrome.driver" (str curdir "\\drivers\\72.0.3626.69\\chromedriver_win32\\chromedriver.exe"))
    (selenium)
    (log/info "ok")))
