(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot...yet."
  [& args]
  (println "I'm a little teapot!"))

(if true
  "By Zeus's hammer!"
  "By Aquaman's trident!")

(if false
  "By Zeus's hammer!"
  "By Aquaman's trident!")

(if false
  "By Odin's Elbow!")

(if true
  (do (println "Success!")
      "By Zeus's hammer!")
  (do (println "Failure!")
      "By Aquaman's trident!"))

(when true
  (println "Success!")
  "abra cadabra")

(nil? 1)

(nil? nil)

(if "bears eat beets"
  "bears beets Battlestar Galactica")

(if nil
  "This won't be the result because nil is falsey"
  "nil is falsey")

(= 1 1)

(= nil nil)

(= 1 2)

(= "ciao" "ciao")

(= "ooohh" "yeeeah")

(= "DaNiElE" "DaNiElE")

(= "Daniele" "Oscar" "Omar")

(= 2.0 3.0)

(= 2.5 2.5)