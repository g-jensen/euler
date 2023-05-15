(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

; https://projecteuler.net/problem=5

(describe "Euler Problem #5"

  (it "finds the gcd of two numbers"
    (should= 1 (gcd 1 1))
    (should= 2 (gcd 2 2))
    (should= 2 (gcd 4 2))
    (should= 48 (gcd (* 48 2) (* 48 3))))

  (it "finds the lcm of two numbers"
    (should= 6 (lcm 2 3))
    (should= 8 (lcm 4 8))
    (should= 60 (lcm 12 15)))

  (it "finds the lcm of a list of numbers"
    (should= 300 (lcm [12 15 75])))

  (it "Solves #5"
    (should= 2520 (euler-5 10))
    (should= 232792560 (euler-5 20))))

(run-specs)
