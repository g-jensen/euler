(ns euler.level1.problem007-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem007 :refer :all]))

; https://projecteuler.net/problem=7

(describe "Euler Problem #7"

  (it "generates prime numbers"
    (should= [2 3 5 7 11] (primes 5))
    (should= [2 3 5 7 11] (take 5 (lazy-primes-slow-and-overflows)))
    (should= [2 3 5 7 11] (take 5 (lazy-primes))))

  (it "Solves #7"
    (should= 13 (euler-7 6))
    (should= 104743 (euler-7 10001))))

(run-specs)
