(ns euler.level1.problem006-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem006 :refer :all]))

; https://projecteuler.net/problem=6

; 1 5 14 30
; 1 9 36 100

(describe "Euler Problem #6"
  (it "solves #6"
    (should= 0 (euler-6 0))
    (should= 0 (euler-6 1))
    (should= 4 (euler-6 2))
    (should= 22 (euler-6 3))
    (should= 70 (euler-6 4))
    (should= 2640 (euler-6 10))
    (should= 25164150 (euler-6 100))))

(run-specs)
