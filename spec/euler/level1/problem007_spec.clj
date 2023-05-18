(ns euler.level1.problem007-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem007 :refer :all]))

; https://projecteuler.net/problem=7

(describe "Euler Problem #7"

  (context "Prime Checker"

    (it "determines 1 to be non-prime"
      (should-not (prime? 1)))

    (it "determines 2 to be prime"
      (should (prime? 2)))

    (it "determines 4 to be non-prime"
      (should-not (prime? 4)))

    (it "determines 5 to be prime"
      (should (prime? 5)))

    (it "determines 6 to be non-prime"
      (should-not (prime? 6)))

    (it "determines 9 to be non-prime"
      (should-not (prime? 9)))

    (it "determines 15 to be non-prime"
      (should-not (prime? 15))))

  (it "Solves #7"
    (should= 2 (euler-7 1))
    (should= 3 (euler-7 2))
    (should= 5 (euler-7 3))
    (should= 13 (euler-7 6))
    (should= 104743 (euler-7 10001))))

(run-specs)
