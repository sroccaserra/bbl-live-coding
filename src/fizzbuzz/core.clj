(ns fizzbuzz.core)

(defn fizz-buzz [n]
  (case n
    3 "fizz"
    5 "buzz"
    n))
