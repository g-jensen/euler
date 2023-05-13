(ns euler.level1.problem004-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem004 :refer :all]))

; https://projecteuler.net/problem=4

(describe "Euler Problem #4"

  (describe "Palindrome Checker"
    (it "Determines that a vector of size 1 is a palindrome"
      (should (palindrome? [1])))

    (it "Determines if a vector of size 2 is a palindrome"
      (should-not (palindrome? [1 0]))
      (should (palindrome? [1 1])))

    (it "Determines if a vector of size 3 is a palindrome"
      (should (palindrome? [1 2 1]))
      (should-not (palindrome? [1 2 2])))

    (it "Determines if a vector of arbitrary length is a palindrome"
      (should-not (palindrome? [1 2 3 1]))
      (should (palindrome? [1 2 2 1]))))

  (describe "Digit Separator"
    (it "Separates a single digit"
      (should= [3] (digits 3)))

    (it "Separates a two digit number"
      (should= [3 4] (digits 34)))

    (it "Separates an arbitrary length number"
      (should= [5 2 3 7 1] (digits 52371))))

  (it "Solves #4"
    (should= 906609 (euler-4 3))))

(run-specs)
