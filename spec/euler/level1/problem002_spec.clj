(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2

(describe "Euler Problem #2"

  (it "calculates the Fibonacci numbers up to n"
    (should= [] (take-while #(< % 1) (fibs)))
    (should= [1 1 2 3 5 8] (take-while #(< % 10) (fibs))))

  (it "calculates the even Fibonacci numbers up to n"
      (should= [] (take-while #(< % 2) (even-fibs)))
      (should= [2 8 34] (take-while #(< % 100) (even-fibs))))

  (it "solves #2"
    (should= 4613732 (euler-2 4000000))))

(run-specs)
