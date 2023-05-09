(ns euler.level1.problem001-spec
  (:use
    [speclj.core]
    [euler.level1.problem001]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #1"

  (it "Checks if a number is a multiple of 3 or 5"
    (should (multiple-of-3-or-5? 0))
    (should-not (multiple-of-3-or-5? 1))
    (should-not (multiple-of-3-or-5? 2))
    (should (multiple-of-3-or-5? 3))
    (should-not (multiple-of-3-or-5? 4))
    (should (multiple-of-3-or-5? 5))
    (should (multiple-of-3-or-5? 6))
    (should (multiple-of-3-or-5? 15)))

  (it "Solves #1"
    (should= 23 (euler-1 10))
	  (should= 233168 (euler-1 1000))))

(run-specs)
