(ns data-structures.function)

(def name "Chewbacca")
(str "\"Uggllglglglglglglglll\" - " name)

{:first-name "Daniele"
 :last-name "Di Salvo"}

{"string-key" +}

{:name {:first "John" :middle "Jacob" :last "Jingleheimerschmidt"}}

(hash-map :a 1 :b 2)

(get {:a 0 :b 1} :b)

(get {:a 0 :b {:c 5} :d {:e 3} :f {:g 8}} :d)

(get {:a 0 :b {:c 5} :d {:e 3} :f {:g 8}} :a)

(get-in {:a 0 :b {:c "ho hum"} } [:b :c])

({:name "The Human Coffeepot"} :name)