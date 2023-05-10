(ns euler.level1.problem001)

(defn multiple-of-3-or-5? [m]
  (or (zero? (mod m 3)) (zero? (mod m 5))))

(defn add-if-multiple-of-3-or-5 [s m]
  (if-not (multiple-of-3-or-5? m) s (+ s m)))

(defn euler-1 [n]
  (apply + (filter #(multiple-of-3-or-5? %) (range 1 n))))

; Cycle:
; Write a failing test
; Make it pass
; Refactor

; Rules:
; Don't write until failing test
; Write test to make it fail
; Don't write more than it takes to make the test pass