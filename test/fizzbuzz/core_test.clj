(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

;; Conseil pour montrer TDD :
;; - Partir sur un énoncé
;; - pattern test list

;; Choix de branche possible :
;; - j'ai une plage où il marche et une plage où il ne marche plus
;; - je suis l'énoncé

;; Live coding : avoir des couleurs pour green bar et red bar

;; Live coding : avoir des casquettes rouge vert bleu, en changer
;; pour matérialiser les différentes étapes (toutes collées = TDD hat)

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
           (fizz-buzz 5))))

  (testing "fizzbuzz 6 should return fizz"
    (is (= "fizz"
           (fizz-buzz 6)))))
