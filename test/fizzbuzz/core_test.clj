(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest fizzbuzz
  (testing "fizzbuzz 1 should return 1"
    (is (= 1
           (fizz-buzz 1))))
  (testing "fizzbuzz 2 should return 2"
    (is (= 2
           (fizz-buzz 2)))))
