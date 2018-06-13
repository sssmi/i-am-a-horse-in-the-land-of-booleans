(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

; Write the function (abs n), which returns the absolute value of n,
; i.e. if n<0, the value of (abs n) is −n, and otherwise n.
(defn abs [x]
  (if (< x 0) (* x -1) x))

; Write the function (divides? divisor n), which returns true if divisor divides n and false otherwise.
;
; (mod num div) returns 0 if div divides num exactly:
;
; (mod 10 5) ;=> 0
; (mod 3 2)  ;=> 1
; (divides? 2 4) ;=> true
; (divides? 4 2) ;=> false
; (divides? 5 10) ;=> true
; (divides? 2 5)) ;=> false

(defn divides? [divisor n]
  (if (== (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
    (and (= (mod n 3) 0) (= (mod n 5) 0)) "gotcha!"
    (= (mod n 3) 0) "fizz"
    (= (mod n 5) 0) "buzz"
    :else ""))

; Write the function (teen? age), which returns truthy
; if age is at least 13 and at most 19.
; Use only one comparison operator and give it three arguments.
(defn teen? [age]
  (if (and (>= age 13) (<= age 19)) true false))

; Write the function (not-teen? age), which returns true when teen? returns false and false otherwise.
;
; (not-teen? 13) ;=> false
; (not-teen? 25) ;=> true
; (not-teen? 12) ;=> true
; (not-teen? 19) ;=> false
; (not-teen? 20)) ;=> true
(defn not-teen? [age]
  (not (teen? age)))


; Write a function (generic-doublificate x) that takes one argument and
;
; doubles it if it is a number,
; returns nil if it is an empty collection,
; if it is a list or a vector, returns two times the length of it
; returns true otherwise.
; You can use the following functions:
;
; (number? n) returns true if n is a number.
; (empty? coll) returns true if coll is empty.
; (list? coll) and (vector? coll) test if coll is a list or a vector.
; (count coll) returns the length of a list or a vector.
; (generic-doublificate 1)        ;=> 2
; (generic-doublificate [1 2])    ;=> 4
; (generic-doublificate '(65 21)) ;=> 4
; (generic-doublificate {})       ;=> nil
; (generic-doublificate [])       ;=> nil
; (generic-doublificate {:a 1}))   ;=> true
(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (list? x) (* (count x) 2)
    (vector? x) (* (count x) 2)
    :else true))


; Write the function (leap-year? year), which returns true if year is a leap year, otherwise false. A year is a leap year if it is divisible by 4, except if it is divisible by 100, in which case it still is a leap year if it is divisible by 400.
;
; See Wikipedia for a simple pseudocode solution.
;
; (leap-year? 100) ;=> false
; (leap-year? 200) ;=> false
; (leap-year? 400) ;=> true
; (leap-year? 12)  ;=> true
; (leap-year? 20)  ;=> true
; (leap-year? 15)))  ;=> false
(defn leap-year? [year]
  (cond
    (= (mod year 400) 0) true
    (= (mod year 100) 0) false
    (= (mod year 4) 0) true
    :else false))



; '_______'
