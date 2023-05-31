(ns euler.level1.problem012-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem012 :refer :all]))

; https://projecteuler.net/problem=12

(describe "Euler Problem #12"

  (it "generates triangle numbers"
    (should= [1] (take 1 (lazy-triangles)))
    (should= [1 3] (take 2 (lazy-triangles)))
    (should= [1 3 6] (take 3 (lazy-triangles)))
    (should= [1 3 6 10] (take 4 (lazy-triangles))))

  (it "Solves #12"
    (should= 3 (euler-12 1))
    (should= 6 (euler-12 2))
    (should= 28 (euler-12 5))
    (should= 76576500 (euler-12 500))))

(run-specs)
