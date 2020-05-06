(ns data-structures.function)

(name "No gnome knows homes like me")

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

[3 2 1]

(get [3 2 1] 0)

(get [3 2 1] 2)

(get ["a" {:name "Pugsley" :last-name "Winterbottom"} "c"] 1)

(vector "a" "b" "c" "d")

(vector 1 2 3 4 5 6)

(conj [1 2 3] 4 5)

'(1 2 3 4 5)

(nth '(1 2 3 4 5) 3)

(nth '(:a :b :c :d) 0)

(list 1 3 5)

(list "a" 3 {3 4})

(nth '("a" 3 {3 4}) 2)

(conj '(1 2 3) 4)

(conj '(2 3) 1)

(conj '(1 2 3) 0)

#{"kurt vonnegut" 20 :icicle}

(hash-set 1 1 2 2 3 5 8)

(conj #{:a :b} :c)

(set [2 2 3 3 4 6 8 9 0 0 1 1])

(contains? #{:a :b} 3)

(contains? #{nil} nil)

(:b #{:a :b})

(= (hash-set :c :a :b) #{:b :a :c})

(get #{:a :b} :a)

(get #{:a nil} nil)

(contains? #{:a nil} nil)

(first [1 2 3 4])

(or + -)

(or - +)

((or + -) 1 2 3)

((or - +) 5 2)

(or (= 0 1) (= "yes" "yes"))

((and (= 1 1) +) 1 2 3)

((first [+ 0 5 8]) 1 2 3)

(inc 2)

(map inc [1 2 3 4 5])

(map + [1 2 3] [4 5 6])

(+ (inc 199)(/ 100 (- 7 2)))
; (+ 200 (/ 100 (- 7 2))) ; evaluated "(inc 199)"
; (+ 200 (/ 100 5)) ; evaluated (- 7 2)
; (+ 200 20) ; evaluated (/ 100 5)
; 220 ; final evaluation




