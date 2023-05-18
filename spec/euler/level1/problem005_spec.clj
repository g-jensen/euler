(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

; https://projecteuler.net/problem=5

(describe "Euler Problem #5"

  (it "finds the greatest common divisor of two numbers"
    (should= 1 (greatest-common-divisor 1 1))
    (should= 2 (greatest-common-divisor 2 2))
    (should= 2 (greatest-common-divisor 4 2))
    (should= 48 (greatest-common-divisor (* 48 2) (* 48 3))))

  (it "finds the least common multiple of two numbers"
    (should= 6 (least-common-multiple 2 3))
    (should= 8 (least-common-multiple 4 8))
    (should= 60 (least-common-multiple 12 15)))

  (it "finds the least common multiple of a list of numbers"
    (should= 300 (least-common-multiple [12 15 75])))

  (it "solves #5"
    (should= 2 (euler-5 2))
    (should= 6 (euler-5 3))
    (should= 2520 (euler-5 10))
    (should= 232792560 (euler-5 20))))

(run-specs)
