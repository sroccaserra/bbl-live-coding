(ns fizzbuzz.core)

;; modulo
;; or

(defn multiple-of-3? [n]
  (zero? (mod n 3)))

(defn fizz-buzz [n]
  (cond
    (multiple-of-3? n) "fizz"
    (= n 5) "buzz"
    true n))
