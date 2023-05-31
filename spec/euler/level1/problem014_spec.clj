(ns euler.level1.problem014-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem014 :refer :all]))

; https://projecteuler.net/problem=14

(describe "Euler Problem #14"

  (it "Solves #14"
    (should= 1 (euler-14 2))
    (should= 2 (euler-14 3))
    (should= 3 (euler-14 4))
    (should= 3 (euler-14 5))
    (should= 3 (euler-14 6))
    (should= 6 (euler-14 7))
    (should= 9 (euler-14 13))
    (should= 837799 (euler-14 1000000))))

(run-specs)
