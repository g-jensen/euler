(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3

(describe "Euler Problem #3"

  (it "Removes a factor from a given number"
    (should= 20 (remove-factor 1 20))
    (should= 20 (remove-factor 3 20))
    (should= 1 (remove-factor 5 5))
    (should= 1 (remove-factor 2 32))
    (should= 25 (remove-factor 2 100)))

  (it "Finds the primes factors of a number"
    (should= '() (prime-factors 1))
    (should= '(2) (prime-factors 2))
    (should= '(2 5) (prime-factors 100))
    (should= '(2 3 5 7) (prime-factors (* 7 6 5 4 3 2)))
    (should= '(71 839 1471 6857) (prime-factors 600851475143)))

  (it "Solves #3"
    (should= 6857 (euler-3 600851475143))))

(run-specs)
