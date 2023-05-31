(ns euler.level1.problem009-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem009 :refer :all]))

; https://projecteuler.net/problem=9

; (3, 4, 5), (6, 8,10), (5, 12, 13), (9, 12, 15)

(describe "Euler Problem #9"

  (it "Solves #9"
    (should= #{} (euler-9 1))
    (should= #{0} (euler-9 2))
    (should= #{} (euler-9 3))
    (should= #{60 0} (euler-9 12))
    (should= #{480 0} (euler-9 24))
    (should= #{31875000 0} (euler-9 1000))))

(run-specs)
