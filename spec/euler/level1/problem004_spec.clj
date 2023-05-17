(ns euler.level1.problem004-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem004 :refer :all]))

; https://projecteuler.net/problem=4

(describe "Euler Problem #4"

  (context "Palindrome Checker"
    (it "determines that a vector of size 1 is a palindrome"
      (should (palindrome? [1])))

    (it "determines if a vector of size 2 is a palindrome"
      (should-not (palindrome? [1 0]))
      (should (palindrome? [1 1])))

    (it "determines if a vector of size 3 is a palindrome"
      (should (palindrome? [1 2 1]))
      (should-not (palindrome? [1 2 2])))

    (it "determines if a vector of arbitrary length is a palindrome"
      (should-not (palindrome? [1 2 3 1]))
      (should (palindrome? [1 2 9 2 1]))))

  (context "Digit Separator"
    (it "separates a single digit"
      (should= [3] (digits 3)))

    (it "separates a two digit number"
      (should= [3 4] (digits 34)))

    (it "separates an arbitrary length number"
      (should= [5 2 3 7 1] (digits 52371))))

  (it "solves #4"
    (should= 9 (euler-4 1))
    (should= 906609 (euler-4 3))))

(run-specs)
