(ns euler.math)

(defn prime? [n]
  (cond
    (<= n 1) false
    (<= n 3) true
    (zero? (mod n 2)) false
    (zero? (mod n 3)) false
    :else (every? #(and (not= 0 (mod n %))
                        (not= 0 (mod n (+ 2 %))))
                  (range 5 (inc (Math/sqrt n)) 6))))