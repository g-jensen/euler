(ns euler.level1.problem006-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem006 :refer :all]))

; https://projecteuler.net/problem=6

(describe "Euler Problem #6"

  (it "finds the sum of the squares of first n natural numbers"
    (should= 385 (sum-of-squares 10)))

  (it "finds the square of the sum of first n natural numbers"
    (should= 3025 (square-of-sum 10)))

  (it "solves #6"
    (should= 2640 (euler-6 10))
    (should= 25164150 (euler-6 100))))

(run-specs)
