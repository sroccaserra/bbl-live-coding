(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

;; J'ai une plage où il marche et une plage où il ne marche plus

;; Couleurs pour green bar et red bar

;; Avoir des casquettes collées ensemble (rouge vert bleu) pour matérialiser
;; les différentes étapes (TDD hat)

;; Partir sur un énoncé
;; pattern test list

(deftest fizzbuzz
  (testing "fizzbuzz 1 should return 1"
    (is (= 1
           (fizz-buzz 1))))

  (testing "fizzbuzz 2 should return 2"
    (is (= 2
           (fizz-buzz 2))))

  (testing "fizzbuzz 3 should return fizz"
    (is (= "fizz"
           (fizz-buzz 3))))

  (testing "fizzbuzz 5 should return buzz"
    (is (= "buzz"
           (fizz-buzz 5)))))
