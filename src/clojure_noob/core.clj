(ns clojure-noob.core)

(defn -main
  "I don't do a whole lot...yet."
  [& args]
  (println "I'm a little teapot!"))

(+ 1 2 3)

(str "It was the panda " "in the library " "with a dust buster")

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

(println "Hello world")

(or false nil :large_I_mean_venti :why_cant_I_just_say_large)

(or (= 0 1) (= "yes" "yes"))

(and :free_wifi :hot_coffee)

(and :feelin_super_cool nil false)

(def failed-protagonist-names
  ["Larry Potter" "Doreen the Explorer" "The Incredible Bulk"])

(defn error-message
  [severity]
  (str "OH GOD! IT'S A DISASTER! WE'RE "
       (if (= severity :mild)
         "MILDLY INCONVENIENCED!"
         "DOOOOOOOMED!")))

(error-message :mild)
